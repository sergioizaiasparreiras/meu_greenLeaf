package com.greenleaf.auth.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Mesa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private int capacidade;

    @Column(nullable = false)
    private boolean disponivel;

    public Mesa(Integer id, int capacidade, boolean disponivel) {
        this.id = id;
        this.capacidade = capacidade;
        this.disponivel = disponivel;
    }

    public Mesa(long i, int j, boolean b) {
        //TODO Auto-generated constructor stub
    }
    // Getters and Setters
}
