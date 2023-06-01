package com.br.etec.nickolas.provacliente.controller;

import com.br.etec.nickolas.provacliente.model.Cliente;
import com.br.etec.nickolas.provacliente.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteRepository clienterepository;

    @GetMapping("/todos")
    public List<Cliente> listartodosClientes() {
        return clienterepository.findAll();
    }
}
