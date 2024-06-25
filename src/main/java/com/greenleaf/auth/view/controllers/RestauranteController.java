package com.greenleaf.auth.view.controllers;

import com.greenleaf.auth.models.Cliente;
import com.greenleaf.auth.models.RequisicaoMesa;
import com.greenleaf.auth.services.RestauranteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/restaurante")
public class RestauranteController {

    @Autowired
    private RestauranteService restauranteService;

    @PostMapping("/requisicao")
    public RequisicaoMesa criarRequisicao(@RequestBody Cliente cliente) {
        return restauranteService.criarRequisicao(cliente);
    }

    @GetMapping("/requisicoes")
    public List<RequisicaoMesa> listarRequisicoes() {
        return restauranteService.listarRequisicoes();
    }
}
