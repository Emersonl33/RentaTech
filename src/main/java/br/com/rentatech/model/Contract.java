package br.com.rentatech.model;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.Calendar;

@Entity
@Table(name = "CONTRACT")
public class Contract {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_contract")
    private Integer id;

    @Column(name = "entry_date", nullable = false, updatable = false)
    private LocalDateTime entryDate;

    @PrePersist
    protected void onCreate() {
        entryDate = LocalDateTime.now();
    }
    /*
    --@PrePersist: Esta anotação marca o método que deve ser chamado antes da persistência da entidade no banco de dados.
        No caso, o método onCreate() será chamado antes da entidade ser persistida, e é aqui que você define a createdDate.

    --LocalDateTime.now(): Obtém a data e hora atual do sistema. Você pode usar outras classes de data e hora dependendo da sua necessidade,
      como java.util.Date ou java.sql.Timestamp, mas LocalDateTime é geralmente preferível nas versões mais recentes do Java.

    --@Column(nullable = false, updatable = false): Define a coluna createdDate como não nula e não atualizável.
      Isso garante que a data de criação não será modificada depois que a entidade for criada.
   */

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "valid_date")
    private Calendar valid_date;

    public Calendar getValid_date() {
        return valid_date;
    }

    public void setValid_date(Calendar valid_date) {
        this.valid_date = valid_date;
    }
}
