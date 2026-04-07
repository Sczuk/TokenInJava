package br.com.tokenInJava.token_in_java.entity.product;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Table(name = "product")
@Entity
@Getter
@Setter
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private double price;

}
