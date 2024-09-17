package br.com.rentatech.model;

import jakarta.persistence.*;

@Entity
@Table(name="ITEM_CART")
public class ItemCart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_itemcart")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product_id;

}
