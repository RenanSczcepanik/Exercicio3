package br.edu.uricer;

import java.math.BigDecimal;

public class CalculaSalario {

    private final BigDecimal DESCONTO_DE_30 = new BigDecimal("0.30");
    private final BigDecimal DESCONTO_DE_25 = new BigDecimal("0.25");
    private final BigDecimal DESCONTO_DE_20 = new BigDecimal("0.20");
    private final BigDecimal DESCONTO_DE_15 = new BigDecimal("0.15");
    private final BigDecimal DESCONTO_DE_10 = new BigDecimal("0.10");
    private final BigDecimal SALARIO_BASE_DESENVOLVEDOR = new BigDecimal("3000");
    private final BigDecimal SALARIO_BASE_GERENTE = new BigDecimal("5000");
    private final BigDecimal SALARIO_BASE_DBA = new BigDecimal("2000");
    private final BigDecimal SALARIO_BASE_TESTADOR = new BigDecimal("2000");


    public CalculaSalario () {
    }

    public BigDecimal calculaSalario(String cargo, BigDecimal salario) {
        switch (cargo) {
            case "DESENVOLVEDOR":
                return calculaDesenvolvedor(salario);
            case "GERENTE":
                return calculaGerente(salario);
            case "DBA":
                return calculaDBA(salario);          
            case "TESTADOR":
                return calculaTestador(salario); 
            default:
                System.out.println("DIGITE O CARGO CORRETAMENTE");
                return new BigDecimal ("0");
        }
    }

    private BigDecimal calculaDesenvolvedor(BigDecimal salario) {    
        if (salario.compareTo(SALARIO_BASE_DESENVOLVEDOR) >= 0) {
            return salario.subtract(salario.multiply(DESCONTO_DE_20));
        } else {
            return salario.subtract(salario.multiply(DESCONTO_DE_10));
        }
    }

    private BigDecimal calculaGerente(BigDecimal salario) {
        if (salario.compareTo(SALARIO_BASE_GERENTE) >= 0) {
            return salario.subtract(salario.multiply(DESCONTO_DE_30));
        } else {
            return salario.subtract(salario.multiply(DESCONTO_DE_20));
        }
    }

    private BigDecimal calculaDBA(BigDecimal salario) {
        if (salario.compareTo(SALARIO_BASE_DBA) >= 0) {
            return salario.subtract(salario.multiply(DESCONTO_DE_25));
        } else {
            return salario.subtract(salario.multiply(DESCONTO_DE_15));
        }
    }

    private BigDecimal calculaTestador(BigDecimal salario) {
        if (salario.compareTo(SALARIO_BASE_TESTADOR) >= 0) {
            return salario.subtract(salario.multiply(DESCONTO_DE_25));
        } else {
            return salario.subtract(salario.multiply(DESCONTO_DE_15));
        }
    }
}
