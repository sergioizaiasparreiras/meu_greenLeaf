package com.greenleaf.auth.view.controllers;

import com.greenleaf.auth.models.Cliente;
import com.greenleaf.auth.services.ClienteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping("")
    public List<Cliente> listarClientes() {
        return clienteService.listarClientes();
    }

    @GetMapping("/{id}")
    public Optional<Cliente> obterClientePorId(@PathVariable Integer id){
        return clienteService.obterClientePorId(id);
    }

    @PostMapping("")
    public Cliente adicionarCliente(@RequestBody Cliente cliente) {
        return clienteService.adicionarCliente(cliente);
    }

    @DeleteMapping("/{id}")
    public void deletarCliente(@PathVariable Integer id) {
        clienteService.deletarCliente(id);
    }
}
