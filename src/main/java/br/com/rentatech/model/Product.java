package br.com.rentatech.model;

import jakarta.persistence.*;

import javax.swing.*;

@Entity
@Table (name = "PRODUCT")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "product_id")
    private Integer id;

    @Column (name = "name", length = 30)
    private String name;

    @Column (name = "description", length = 500)
    private String description;

    @Column (name = "availability")
    private Boolean availability;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Boolean getAvailability() {
        return availability;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setAvailability(Boolean availability) {
        this.availability = availability;
    }
}
