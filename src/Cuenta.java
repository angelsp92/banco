
import java.util.ArrayList;

public class Cuenta {
    private String nCuenta, titular;
    protected ArrayList<Movimiento> movimientos;
    private double saldo;

    Cuenta(String numCuenta, String nombre) {
        this.nCuenta = numCuenta;
        this.titular = nombre;
        this.movimientos = new ArrayList();
        this.saldo = 0;
    }

    void ingresar(double x) {
        if(x < 0) {
            System.out.println("Error: Debes introducir una cantidad positiva para ingresar.");
        }
        else {
            this.setSaldo(1000.0);
        }
    }

    double getSaldo() {
        return this.saldo;
    }
    
    void setSaldo(double x) {
       this.saldo += x;
    }

    void retirar(double x) {
        if(x <= 0){
            System.out.println("Error: Debes introducir una cantidad positiva para retirar.");
        }
        else if(this.getSaldo() < x){
            System.out.println("Error: Saldo insuficiente (Saldo actual: " + this.getSaldo() + ")");
        }
        else {
            this.setSaldo(-500);
        }
    }
}
