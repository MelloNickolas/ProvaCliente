package com.br.etec.nickolas.provacliente.repository.cliente;

import com.br.etec.nickolas.provacliente.model.Cliente;
import com.br.etec.nickolas.provacliente.repository.filter.ClienteFilter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ClienteRepositoryQuery {

    public Page<Cliente> filtrar(ClienteFilter clientefilter, Pageable pageable);

}
