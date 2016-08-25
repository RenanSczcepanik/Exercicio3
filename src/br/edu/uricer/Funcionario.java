package br.edu.uricer;

import java.math.BigDecimal;

public class Funcionario {
    private String NOME;
    private String E_MAIL;
    private BigDecimal SALARIO_BASE;
    private String CARGO;
    
    public Funcionario() {
    }

    public Funcionario(BigDecimal SALARIO_BASE, String CARGO) {
        this.SALARIO_BASE = SALARIO_BASE;
        this.CARGO = CARGO;
    }
    
    public String getNOME() {
        return NOME;
    }

    public void setNOME(String NOME) {
        this.NOME = NOME;
    }

    public String getE_MAIL() {
        return E_MAIL;
    }

    public void setE_MAIL(String E_MAIL) {
        this.E_MAIL = E_MAIL;
    }

    public BigDecimal getSALARIO_BASE() {
        return SALARIO_BASE;
    }

    public void setSALARIO_BASE(BigDecimal SALARIO_BASE) {
        this.SALARIO_BASE = SALARIO_BASE;
    }

    public String getCARGO() {
        return CARGO;
    }

    public void setCARGO(String CARGO) {
        this.CARGO = CARGO;
    }
    
    
}
