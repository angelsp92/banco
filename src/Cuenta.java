
import java.util.ArrayList;

public class Cuenta {
    private String nCuenta, titular;
    protected ArrayList<Movimiento> movimientos;
    private double saldo;
    private int codMovimientos;

    Cuenta(String numCuenta, String nombre) {
        this.nCuenta = numCuenta;
        this.titular = nombre;
        this.movimientos = new ArrayList<Movimiento>();
        this.saldo = 0;
        this.codMovimientos = 1;
    }
    
    double getSaldo() {
        return this.saldo;
    }
    
    void setSaldo(double cantidad) {
       this.saldo += cantidad;
    }

    void ingresar(double cantidad) {
        if(cantidad < 0) {
            System.out.println("Error: Debes introducir una cantidad positiva para ingresar.");
        }
        else {
            Movimiento m = new Movimiento(this.codMovimientos, "Ingreso", cantidad);
            this.movimientos.add(m);
            this.codMovimientos++;

            this.setSaldo(cantidad);
        }
    }

    void retirar(double cantidad) {
        if(cantidad <= 0){
            System.out.println("Error: Debes introducir una cantidad positiva para retirar.");
        }
        else if(this.getSaldo() < cantidad){
            System.out.println("Error: Saldo insuficiente (Saldo actual: " + this.getSaldo() + ")");
        }
        else {
            Movimiento m = new Movimiento(this.codMovimientos, "Retirar", -cantidad);
            this.movimientos.add(m);
            this.codMovimientos++;

            this.setSaldo(-cantidad);
        }
    }
}
