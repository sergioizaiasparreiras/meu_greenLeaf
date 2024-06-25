package com.greenleaf.auth.models;
import java.time.LocalDateTime;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class RequisicaoMesa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    private Cliente cliente;

    @ManyToOne
    private Mesa mesa;

    private LocalDateTime dataHoraEntrada;
    private LocalDateTime dataHoraSaida;

    // Construtores, getters e setters

    public RequisicaoMesa(Integer id, Cliente cliente, Mesa mesa, LocalDateTime dataHoraEntrada, LocalDateTime dataHoraSaida) {
        this.id = id;
        this.cliente = cliente;
        this.mesa = mesa;
        this.dataHoraEntrada = dataHoraEntrada;
        this.dataHoraSaida = dataHoraSaida;
    }
    // Getters and Setters
}
