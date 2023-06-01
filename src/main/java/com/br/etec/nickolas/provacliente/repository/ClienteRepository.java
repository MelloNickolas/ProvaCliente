package com.br.etec.nickolas.provacliente.repository;

import com.br.etec.nickolas.provacliente.model.Cliente;
import com.br.etec.nickolas.provacliente.repository.cliente.ClienteRepositoryQuery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer>, ClienteRepositoryQuery {
}
