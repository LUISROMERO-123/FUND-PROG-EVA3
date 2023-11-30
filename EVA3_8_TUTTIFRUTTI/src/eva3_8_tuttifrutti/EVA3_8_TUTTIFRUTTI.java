/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_8_tuttifrutti;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA3_8_TUTTIFRUTTI {
    final static String USUARIO = "TUTTI";
    final static String PASSWORD = "FRUTI";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     
        String usuario;
        String pwd;
        do{
            //preguntar usuario y contraseña
            usuario = capturaDatos("Usuario: ");
            pwd = capturaDatos("Contraseña; ");        
            
        }while(!validarUsuario(usuario, pwd));
        System.out.println("BIENVENIDO AL SISTEMA!!");
    }
    
    public static boolean validarUsuario(String usuario, String pwd){
        if (usuario.equals(USUARIO) && pwd.equals(PASSWORD))
            return true;
        else
            return false;
    }
    
    public static String capturaDatos(String mensaje){
           Scanner input = new Scanner(System.in);
           System.out.println(mensaje);
           return input.nextLine();
       
    
    }
}