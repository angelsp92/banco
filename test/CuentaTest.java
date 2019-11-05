/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author usuario
 */
public class CuentaTest {
    private static Cuenta c;
    
    public CuentaTest() {
    }
    
    @Before
    public void setUp() {
        System.out.println("Set up");
        c = new Cuenta("0001.0002.12.1234567890","Fulano de Tal");
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Test
    public void testIngresar(){
        System.out.println("Ingresar test");
        c.Ingresar(1000.0);
        assertTrue(c.getSaldo()==1000.0);
    }
    
    @Test
    public void testRetirar(){
        System.out.println("Retirar test");
        c.Retirar(1000.0);
        assertTrue(c.getSaldo()==-1000.0);
    }
    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
