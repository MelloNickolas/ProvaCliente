package com.br.etec.nickolas.provacliente.controller;

import com.br.etec.nickolas.provacliente.model.ContasReceber;
import com.br.etec.nickolas.provacliente.repository.ContasReceberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/contasreceber")
public class ContasReceberController {

    @Autowired
    private ContasReceberRepository contasreceberrepository;

    @GetMapping("/todos")
    public List<ContasReceber> listartodascontasreceber() { return contasreceberrepository.findAll(); }
}
