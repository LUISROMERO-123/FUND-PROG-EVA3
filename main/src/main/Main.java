/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;
/**
 *
 * @author invitado
 */
public class Main {

    
    public static void main(String[] args) {
        //llamada funcion o procedimiento
        imprimirMensaje ("Hola mundo!!", 5);
       
    }
    
   public static void imprimirMensaje(String mensaje, int cant){
       for (int i = 0; i < cant; i++) {
             System.out.println(mensaje);
           
           
       }
     
   }
}