package actividadprogramacion;

import java.util.Scanner;

public class Ej8Factorial {
	
public static void main (String[]args) {

int factorial=1;
Scanner teclado=new Scanner (System.in);
int numero=1;

System.out.print("Introduce un numero: ");
numero=teclado.nextInt();

for (int x=2;x<=numero;x++) {
	  factorial=factorial*x;
	  
		}
System.out.println("El factorial del numero " + Integer.toString(numero) +  " es " + Integer.toString(factorial));
	}
}

