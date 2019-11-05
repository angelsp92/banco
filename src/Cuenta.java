/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author usuario
 */
public class Cuenta {
    
    private String mNumero;
    private String nTitular;
    private double saldo;
    
    public Cuenta(String numero, String titular){
        mNumero=numero;
        nTitular=titular;
        saldo=0;
    }
    
    public void Ingresar(double x){
        
    }
    
    public void Retirar(double x){
        
    }
    
    public double getSaldo(){
        return 1000.0;
    }
}
