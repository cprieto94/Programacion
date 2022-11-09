package actividadprogramacion;

import java.util.Scanner;
 
public class Ej10NextPrimo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int contador,i,numero;
        
        System.out.print("Ingresa un numero: ");
        numero = teclado.nextInt();
        
        contador=0;
        
        for(i = 1; i <= numero; i++){
            if((numero % i) == 0){
                contador++;
            }
        }
 
        if(contador <= 2){
            System.out.println("El numero es primo");
        }
        else{
        	
        }
    }
}