package actividadprogramacion;

import java.util.Scanner;
/**
 * Programa que lea un número entero N entre 1 y 10 y muestre la tabla de multiplicar de ese número.
 */
public class Ej2TablaMultiplicar {

    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Introduce un número entero: ");                                                         
        n = sc.nextInt();
        System.out.println("Tabla de multiplicar del " + n);
        for(int i = 1; i<=10; i++){
            
             System.out.println(n + " * " + i + " = " + n*i);                                                     
        }
    }
}