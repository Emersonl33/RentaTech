package br.com.rentatech.model;

import jakarta.persistence.*;

@Entity
@Table(name = "CART")
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cart")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product_id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user_id;

    @ManyToOne
    @JoinColumn(name = "plan_id")
    private Plan plan_id;

}
