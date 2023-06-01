package com.br.etec.nickolas.provacliente.repository;

import com.br.etec.nickolas.provacliente.model.ContasReceber;
import com.br.etec.nickolas.provacliente.repository.contasreceber.ContasReceberRepositoryQuery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContasReceberRepository extends JpaRepository<ContasReceber, Integer>, ContasReceberRepositoryQuery {
}
