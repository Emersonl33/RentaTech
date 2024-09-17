package br.com.rentatech.model;

import jakarta.persistence.*;


@Entity
@Table(name = "PLAN")
public class Plan {
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "plan_id")
    private Integer id;

    @Column(name = "name", length = 50)
    private String name;

    @Column(name = "type")
    private String type;

    @Column(name = "price")
    private Double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
