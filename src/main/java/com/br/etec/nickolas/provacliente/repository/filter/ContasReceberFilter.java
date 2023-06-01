package com.br.etec.nickolas.provacliente.repository.filter;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ContasReceberFilter {

    private BigDecimal valorconta;
    private LocalDate dataconta;

    public BigDecimal getValorconta() {
        return valorconta;
    }

    public void setValorconta(BigDecimal valorconta) {
        this.valorconta = valorconta;
    }

    public LocalDate getDataconta() {
        return dataconta;
    }

    public void setDataconta(LocalDate dataconta) {
        this.dataconta = dataconta;
    }
}
