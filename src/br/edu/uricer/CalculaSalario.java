/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.uricer;

import java.math.BigDecimal;

/**
 *
 * @author Computer
 */
public class CalculaSalario {
    private final BigDecimal DESCONTO_DE_25 = new BigDecimal(0.25);
    private final BigDecimal DESCONTO_DE_20 = new BigDecimal(0.2);
    private final BigDecimal DESCONTO_DE_15 = new BigDecimal(0.15);
    private final BigDecimal DESCONTO_DE_10 = new BigDecimal(0.1);
    public BigDecimal salario;
    
    public BigDecimal recebeCargo(String cargo){
        if(cargo.equals("DESENVOLVEDOR")){
            return calculaDesenvolvedor(new BigDecimal(3000));
        }
    }
    private BigDecimal calculaDesenvolvedor(BigDecimal SALARIO_BASE){
        this.salario = SALARIO_BASE;
        return salario.multiply(DESCONTO_DE_25);
    }
}
