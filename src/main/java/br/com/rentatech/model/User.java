package br.com.rentatech.model;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Calendar;

@Entity
@Table(name = "USER")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user")
    private Integer id;

    @Column(name = "username", length = 50)
    private String username;

    @Column(name = "email", length = 50)
    private String description;

    @Column(name = "password", length = 30)
    private String password;

    @Column(name = "address", length = 50)
    private String adress;

    @Column(name = "name", length = 50)
    private String name;

    @Column(name = "gender", length = 1)
    private String gender;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "birth_date")
    private Calendar birth_date;

    public String getUsername() {
        return username;
    }

    public String getDescription() {
        return description;
    }

    public String getPassword() {
        return password;
    }

    public String getAdress() {
        return adress;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public Calendar getBirth_date() {
        return birth_date;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setBirth_date(Calendar birth_date) {
        this.birth_date = birth_date;
    }

}
