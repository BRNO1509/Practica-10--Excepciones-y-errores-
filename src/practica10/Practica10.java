/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica10;

/**
 *
 * @author User
 */
public class Practica10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("1*****************************");
        try{
        String mensajes[]={"Anotnio","Javier","Gabriela"};
        for (int i=0;i<4;i++){
            System.out.println(mensajes[i]);
        }
    }catch(ArrayIndexOutOfBoundsException aie){
            System.out.println("Error: Apuntador fuera de rango");
    }
        System.out.println("2***************************");
        try{
        float equis=5/0;
        System.out.println("Equis= "+equis);
        }catch(ArithmeticException ae){
            System.out.println("Error division entre cero");
        }finally{
            System.out.println("A pesar de todo, se ejecuta finally");
        }
        System.out.println("3****************************");
        try{
        float equis=5/0;
        System.out.println("Equis= "+equis);
        }catch(ArithmeticException ae){
            System.out.println("Error division entre cero");
        }catch(ArrayIndexOutOfBoundsException aie){
            System.out.println("Error: Apuntador fuera de rango");
        }catch(Exception e){
            System.out.println("Exepcion general");
        }finally{
            System.out.println("A pesar de todo, se ejecuta finally");
        }
        System.out.println("4**************************");
        //Propagacion de exepciones
        try{
        int division=division(8,0);
        System.out.println("Division= "+division);
        }catch(ArithmeticException e){
            System.out.println("Exepcion Aritmetica");
            //e.printStackTrace();
        }
        /*int division=division(8,0);
        System.out.println("Division= "+division);*/
        System.out.println("5**************************");
        //Propagacion de exepciones
        try{
        int division2=division(8,0);
        System.out.println("Division= "+division2);
        }catch(ArithmeticException e){
            System.out.println("Exepcion Aritmetica");
            //e.printStackTrace();
        }
}
    public static int division(int a,int b)throws ArithmeticException{
        int c;
       /* try{
            c=a/b;
        }catch(ArithmeticException e){
            System.out.println("Exepcion Aritmetica");
            c=0;
        }*/
       c=a/b;
        return c;
    }
    public static int division2(int a,int b)throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException();
        }int c=a/b;
        return c;
    }
}
