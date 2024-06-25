package com.greenleaf.auth.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;



@Data
@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private int numeroPessoas;

    public Cliente(Integer id, String nome, int numeroPessoas) {
        this.id = id;
        this.nome = nome;
        this.numeroPessoas = numeroPessoas;
    }
    // Getters and Setters
}

    


