
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
        c = new Cuenta("1111.2222.33.1234567890", "Fulano de tal");
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Test
    public void testIngresar1() {
        System.out.println("Test1: Ingresar cantidad positica");
        c.ingresar(1000.0);
        assertTrue(c.getSaldo() == 1000.0);
    }
    
    @Test
    public void testIngresar2() {
        System.out.println("Test2: Ingresar cantidad negativa (Error)");
        c.ingresar(-1000.0);
        assertTrue(c.getSaldo() == 1000.0);
    }
    
    @Test
    public void testRetirar1(){
        System.out.println("Test3: Retirar cantidad positiva menos saldo actual");
        c.retirar(500.0);
        assertTrue(c.getSaldo() == 500.0);
    }
    
    @Test
    public void testRetirar2(){
        System.out.println("Test4: Retirar cantidad positiva mayor saldo actual (Error)");
        c.retirar(700.0);
        assertTrue(c.getSaldo() == 500.0);
    }
    
    @Test
    public void testRetirar3(){
        System.out.println("Test3: Retirar cantidad negativa (Error)");
        c.retirar(-50.0);
        assertTrue(c.getSaldo() == 500.0);
    }
    
}