package actividadprogramacion;

import java.util.Scanner;

public class Ej7SumayMedia {

public static void main (String[]args) {

int num=0, suma=0, contador = 0, media = 0;
Scanner teclado=new Scanner (System.in);

do {
System.out.print("Introduce un numero: ");
num=teclado.nextInt();
suma=suma+num;
contador++;
media=suma/contador;
}

while (num!=0);

System.out.println("La suma de todos los numeros es: " + suma);
System.out.println("La cantidad de numeros introducidos es: " + contador);
System.out.println("La media de los numeros introducidos es: " + media);
	}
}