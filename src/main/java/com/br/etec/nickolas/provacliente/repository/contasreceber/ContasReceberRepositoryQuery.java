package com.br.etec.nickolas.provacliente.repository.contasreceber;

import com.br.etec.nickolas.provacliente.repository.Dtos.ContasReceberDto;
import com.br.etec.nickolas.provacliente.repository.filter.ContasReceberFilter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ContasReceberRepositoryQuery {

    public Page<ContasReceberDto> filtrar(ContasReceberFilter contasreceberfilter, Pageable pageable);

}
