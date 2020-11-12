
import java.util.Date;


public class Movimiento {
    private int idMovimiento;
    private Date timeStamp;
    private String tipo;
    private double importe;

    
    Movimiento(int codigo, String operacion, double cantidad) {
        this.idMovimiento = codigo;
        this.timeStamp = new Date();
        this.tipo = operacion;
        this.importe= cantidad;
    }
}
