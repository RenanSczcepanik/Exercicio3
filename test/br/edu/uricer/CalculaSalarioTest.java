package br.edu.uricer;

import java.math.BigDecimal;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculaSalarioTest {
    
    public CalculaSalarioTest() {
        
    }       
    @Test
    public void testSalarioDESENVOLVEDOR() {
        CalculaSalario test = new CalculaSalario();
        BigDecimal resultado = test.calculaSalario("DESENVOLVEDOR", new BigDecimal("5000"));
        BigDecimal esperado =  new BigDecimal("4000.00");
        assertEquals(esperado,resultado);
    }  
    @Test
    public void testSalarioDBA() {
        CalculaSalario test = new CalculaSalario();
        BigDecimal resultado = test.calculaSalario("DBA", new BigDecimal("550"));
        BigDecimal esperado =  new BigDecimal("467.50");
        assertEquals(esperado,resultado);
    }
    @Test
    public void testSalarioTESTADOR() {
        CalculaSalario test = new CalculaSalario();
        BigDecimal resultado = test.calculaSalario("TESTADOR", new BigDecimal("1250"));
        BigDecimal esperado =  new BigDecimal("1062.50");
        assertEquals(esperado,resultado);
    }
    @Test
    public void testSalarioGERENTE() {
        CalculaSalario test = new CalculaSalario();
        BigDecimal resultado = test.calculaSalario("GERENTE", new BigDecimal("2500"));
        BigDecimal esperado =  new BigDecimal("2000.00");
        assertEquals(esperado,resultado);
    }
}
