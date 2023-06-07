package com.br.etec.nickolas.provacliente.repository.contasreceber;

import com.br.etec.nickolas.provacliente.model.ContasReceber;
import com.br.etec.nickolas.provacliente.repository.filter.ContasReceberFilter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class ContasReceberRepositoryImpl implements ContasReceberRepositoryQuery{

    @PersistenceContext
    private EntityManager manager;

    @Override
    public Page<ContasReceber> filtrar(ContasReceberFilter contasreceberfilter, Pageable pageable) {

        CriteriaBuilder builder = manager.getCriteriaBuilder();
        CriteriaQuery<ContasReceber> criteria = builder.createQuery(ContasReceber.class);
        Root<ContasReceber> root = criteria.from(ContasReceber.class);

        Predicate[] predicates = criarrestricoes(contasreceberfilter, builder, root);
        criteria.where(predicates);
        criteria.orderBy(builder.asc(root.get("valorconta")));

        TypedQuery<ContasReceber> query = manager.createQuery(criteria);
        addrestricoespaginas(query, pageable);

        return new PageImpl<>(query.getResultList(),pageable, total(contasreceberfilter));
    }

    private Long total(ContasReceberFilter contasreceberfilter){
        CriteriaBuilder builder = manager.getCriteriaBuilder();
        CriteriaQuery<Long> criteria = builder.createQuery(Long.class);
        Root<ContasReceber> root = criteria.from(ContasReceber.class);

        Predicate[] predicates = criarrestricoes(contasreceberfilter, builder, root);
        criteria.where(predicates);
        criteria.orderBy(builder.asc(root.get("valorconta")));

        criteria.select(builder.count(root));

        return manager.createQuery(criteria).getSingleResult();
    }

    private void addrestricoespaginas(TypedQuery<ContasReceber> query, Pageable pageable) {
        int paginaAtual = pageable.getPageNumber();
        int totalRegistrosPorPagina = pageable.getPageSize();
        int primeiroRegistroPágina = paginaAtual * totalRegistrosPorPagina;

        query.setFirstResult(primeiroRegistroPágina);
        query.setMaxResults(totalRegistrosPorPagina);
    }

    private Predicate[] criarrestricoes(ContasReceberFilter contasreceberfilter, CriteriaBuilder builder, Root<ContasReceber> root) {

        List<Predicate> predicates = new ArrayList<>();

        if(contasreceberfilter.getValorconta() != null){
            predicates.add(builder.equal(root.get("valorconta"), contasreceberfilter.getValorconta()));
        }
        if(contasreceberfilter.getDataconta() != null){
            predicates.add(builder.greaterThanOrEqualTo(root.get("dataconta"), contasreceberfilter.getDataconta()));
        }

        return predicates.toArray(new Predicate[predicates.size()]);
    }
}
