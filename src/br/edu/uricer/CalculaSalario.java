package br.edu.uricer;

import java.math.BigDecimal;

public class CalculaSalario {

    private final BigDecimal DESCONTO_DE_30 = new BigDecimal("0.30");
    private final BigDecimal DESCONTO_DE_25 = new BigDecimal("0.25");
    private final BigDecimal DESCONTO_DE_20 = new BigDecimal("0.2");
    private final BigDecimal DESCONTO_DE_15 = new BigDecimal("0.15");
    private final BigDecimal DESCONTO_DE_10 = new BigDecimal("0.1");
    private final BigDecimal SALARIO_BASE_DESENVOLVEDOR = new BigDecimal("3000.0");
    private final BigDecimal SALARIO_BASE_GERENTE = new BigDecimal("5000.0");
    private final BigDecimal SALARIO_BASE_DBA = new BigDecimal("2000.0");
    private final BigDecimal SALARIO_BASE_TESTADOR = new BigDecimal("2000.0");
    
    public BigDecimal salario;
    String cargo;

    public CalculaSalario(BigDecimal salario, String cargo) {
        this.salario = salario;
        this.cargo = cargo;
    }

    public BigDecimal usaCargo() {
        switch (cargo) {
            case "DESENVOLVEDOR":
                return calculaDesenvolvedor();
            case "GERENTE":
                return calculaGerente();
            case "DBA":
                return calculaDBA();
            case "TESTADOR":
                return calculaTestador();
            default:
                System.out.println("DIGITE O CARGO CORRETAMENTE");
                return new BigDecimal(0);
        }
    }

    private BigDecimal calculaDesenvolvedor() {
        if (salario.compareTo(SALARIO_BASE_DESENVOLVEDOR) >= 0) {            
            return salario.subtract(salario.multiply(DESCONTO_DE_20));
        } else {
            return salario.subtract(salario.multiply(DESCONTO_DE_10));
        }
    }

    private BigDecimal calculaGerente() {
        if (salario.compareTo(SALARIO_BASE_GERENTE) >= 0) {
            return salario.multiply(DESCONTO_DE_30);
        } else {
            return salario.multiply(DESCONTO_DE_20);
        }
    }

    private BigDecimal calculaDBA() {
        if (salario.compareTo(SALARIO_BASE_DBA) >= 0) {
            return salario.subtract(salario.multiply(DESCONTO_DE_25));
        } else {
            return salario.subtract(salario.multiply(DESCONTO_DE_15));
        }
    }

    private BigDecimal calculaTestador() {
        if (salario.compareTo(SALARIO_BASE_TESTADOR) >= 0) {
            return salario.subtract(salario.multiply(DESCONTO_DE_25));
        } else {
            return salario.subtract(salario.multiply(DESCONTO_DE_15));
        }
    }
}
