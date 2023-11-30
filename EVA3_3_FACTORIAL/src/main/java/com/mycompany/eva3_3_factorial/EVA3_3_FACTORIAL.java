package com.mycompany.eva3_3_factorial;

import java.util.Scanner;
public class EVA3_3_FACTORIAL {
    private static final Scanner input = new Scanner (System.in);

    public static void main(String[] args) {
        int valor = 5;
        System.out.println("Factorial de 5 = " + calcularFactorial(valor));
    }
    
    public static int calcularFactorial (int valor){
        int guardar = 1;
        for (int i = 1; i <= valor; i++) {
            guardar *= i;
        }
        return guardar;
    }
}
