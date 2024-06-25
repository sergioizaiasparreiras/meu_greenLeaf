package com.greenleaf.auth.services;

import com.greenleaf.auth.models.Cliente;
import com.greenleaf.auth.models.Mesa;
import com.greenleaf.auth.models.RequisicaoMesa;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class RestauranteService {

    private List<Mesa> mesas = new ArrayList<>();
    private List<RequisicaoMesa> requisicoes = new ArrayList<>();

    public RestauranteService() {
        // Inicializando mesas
        for (int i = 1; i <= 4; i++) {
            mesas.add(new Mesa((long) i, 4, true));
            mesas.add(new Mesa((long) (i + 4), 6, true));
        }
        mesas.add(new Mesa(9L, 8, true));
        mesas.add(new Mesa(10L, 8, true));
    }

    public RequisicaoMesa criarRequisicao(Cliente cliente) {
        Mesa mesa = alocarMesa(cliente.getNumeroPessoas());
        RequisicaoMesa requisicao = new RequisicaoMesa(null, cliente, mesa, null, null);
        requisicao.setCliente(cliente);
        requisicao.setMesa(mesa);
        requisicao.setDataHoraEntrada(LocalDateTime.now());

        requisicoes.add(requisicao);
        return requisicao;
    }

    public List<RequisicaoMesa> listarRequisicoes() {
        return requisicoes;
    }

    public Mesa alocarMesa(int numeroPessoas) {
        for (Mesa mesa : mesas) {
            if (mesa.isDisponivel() && mesa.getCapacidade() >= numeroPessoas) {
                mesa.setDisponivel(false);
                return mesa;
            }
        }
        return null; // Adicionar lógica de fila de espera se necessário
    }
}
