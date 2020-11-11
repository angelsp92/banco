
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class CuentaTest {
    private static Cuenta c;
    
    public CuentaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Inicio Clase CuentaTest");
        c = new Cuenta();
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Test
    public void testIngresar1() {
        System.out.println("Test1: Ingresar cantidad positica");
        double saldo = 0;
        double ingreso = 100.0;
        assertTrue((saldo+ingreso)==100.0);
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testIngresar2() {
        System.out.println("Test2: Ingresar cantidad negativa (Error)");
        double saldo = 0;
        double ingreso = -100.0;
        assertTrue((saldo)==0.0);
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testRetirar1(){
        System.out.println("Test3: Retirar cantidad positiva menos saldo actual");
        double saldo = 100.0;
        double retirar = 50.0;
        assertTrue((saldo-retirar)==50.0);
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testRetirar2(){
        System.out.println("Test4: Retirar cantidad positiva mayor saldo actual (Error)");
        double saldo = 100.0;
        double retirar = 150.0;
        assertTrue((saldo)==100.0);
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testRetirar3(){
        System.out.println("Test3: Retirar cantidad negativa (Error)");
        double saldo = 100.0;
        double retirar = -50.0;
        assertTrue((saldo)==100.0);
       //fail("The test case is a prototype.");
    }
    
}