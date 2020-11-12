
public class Cuenta {
    private String nCuenta, titular;
    private double saldo;

    Cuenta(String numCuenta, String nombre) {
        this.nCuenta = numCuenta;
        this.titular = nombre;
        this.saldo = 0;
    }

    void ingresar(double cantidad) {
        if(cantidad < 0) {
            System.out.println("Error: Debes introducir una cantidad positiva para ingresar.");
        }
        else {
            this.setSaldo(1000.0);
        }
    }

    double getSaldo() {
        return this.saldo;
    }
    
    void setSaldo(double cantidad) {
       this.saldo += cantidad;
    }

    void retirar(double cantidad) {
        if(cantidad <= 0){
            System.out.println("Error: Debes introducir una cantidad positiva para retirar.");
        }
        else if(this.getSaldo() < cantidad){
            System.out.println("Error: Saldo insuficiente (Saldo actual: " + this.getSaldo() + ")");
        }
        else {
            this.setSaldo(-500);
        }
    }
}
