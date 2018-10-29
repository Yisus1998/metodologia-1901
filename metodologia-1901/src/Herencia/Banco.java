/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia;

/**
 *
 * @author T-107
 */
public class Banco {
    
    public static void main(String[] args ){
    
   
    TarjetaCredito t1=new TarjetaCredito();

     t1.setNumero(666);
    
    
     TarjetaAhorro t2=new  TarjetaAhorro();
    //t2.numero=4321;
       TarjetaNomina t3=new  TarjetaNomina();
      // t3.numero=-666;
       
     //  if (t1.getNumero()<0)
     //  {t1.getNumero()=-t1.getNumero();}
           //
        System.out.println("El numero de la carpeta t3 es "+t1.getNumero());
      
    
    }
    
}
