package actividadprogramacion;

import java.util.Scanner;

public class Ejercicio6 {

public static void main (String[]args) {

int num=0, suma=0;
Scanner teclado=new Scanner (System.in);

do {
System.out.print("Introduce un numero: ");
num=teclado.nextInt();
suma=suma+num;
		}


while (num!=0);
System.out.println("La suma de las posiciones pares es: " + suma);
System.out.println("La suma de las posiciones impares es: " + suma);
		
	}
}