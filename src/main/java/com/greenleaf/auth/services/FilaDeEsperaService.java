package com.greenleaf.auth.services;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greenleaf.auth.models.RequisicaoMesa;
import com.greenleaf.auth.repositories.RequisicaoMesaRepository;

@Service
public class FilaDeEsperaService {

    private Queue<RequisicaoMesa> filaDeEspera = new LinkedList<>();

    @Autowired
    private RequisicaoMesaRepository requisicaoMesaRepository;

    public void adicionarNaFila(RequisicaoMesa requisicaoMesa) {
        filaDeEspera.add(requisicaoMesa);
        requisicaoMesaRepository.save(requisicaoMesa);  // Salvar no banco de dados
    }

    public RequisicaoMesa removerDaFila() {
        RequisicaoMesa requisicaoMesa = filaDeEspera.poll();
        if (requisicaoMesa != null) {
            requisicaoMesaRepository.delete(requisicaoMesa);  // Remover do banco de dados
        }
        return requisicaoMesa;
    }

    public List<RequisicaoMesa> verificarFila() {
        return requisicaoMesaRepository.findAll();  // Recuperar toda a fila do banco de dados
    }
}
