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
public class Cajero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SaldoInsuficienta  {
        // TODO code application logic here
        Cuenta cuenta=new Cuenta();
        cuenta.depositar(500);
        try{
        cuenta.retirar(300);
        cuenta.retirar(100);
        cuenta.retirar(200);
    }catch (SaldoInsuficienta ex){
            System.out.println("SaldoInsuficiente");
}}}