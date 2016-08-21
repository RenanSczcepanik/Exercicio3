package br.edu.uricer;

import java.math.BigDecimal;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Computer
 */
public class CalculaSalarioTest {
    
    public CalculaSalarioTest() {
    }
        
    @Test
    public void testSalarioDESENVOLVEDOR() {
        CalculaSalario test = new CalculaSalario(new BigDecimal("5000.0"), "DESENVOLVEDOR");
        BigDecimal esperado =  new BigDecimal("4000.00");
        assertEquals(esperado,test.usaCargo());
    }
    
    @Test
    public void testSalarioDBA() {
        CalculaSalario test = new CalculaSalario(new BigDecimal("550.0"), "TESTADOR");
        BigDecimal esperado =  new BigDecimal("467.50");
        assertEquals(esperado,test.usaCargo());
    }
    
}
