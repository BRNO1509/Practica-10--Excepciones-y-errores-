/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cajero;

/**
 *
 * @author User
 */
public class Cuenta {
    private double saldo;
    
    public Cuenta() {
        this.saldo=0;
    }
    /**
     * 
     * @return Regresa el valor de saldo
     */
    public double getSaldo() {
        return saldo;
    }
    /**
     * 
     * @param monto Se resalta el mensaje de cuanto se esta depositando a la cuenta
     * y a la vez se crea el proceso donde se ingresa al saldo 
     */
    public void depositar (double monto){
        System.out.println("Depositando: "+monto+" pesos");
        saldo=saldo+monto;
    }
    public void retirar(double monto) throws SaldoInsuficienta{
        System.out.println("Retirando monto");
        if(saldo<monto)
            throw new SaldoInsuficienta();
        else{
            saldo=saldo-monto;
        }
        System.out.println("Saldo actual: "+saldo);
    }
}
