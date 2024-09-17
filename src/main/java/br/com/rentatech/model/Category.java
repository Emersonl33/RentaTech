package br.com.rentatech.model;

import jakarta.persistence.*;

@Entity
@Table(name = "CATEGORY")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_category")
    private Integer id;

    @Column(name = "category_name", length = 30)
    private String category_name;

}
