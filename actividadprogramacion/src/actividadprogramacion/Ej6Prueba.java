package actividadprogramacion;

import java.util.Scanner;

public class Ej6Prueba {

public static void main (String[]args) {

int num=0, pares=0, impares=0;
Scanner teclado=new Scanner (System.in);

do {
System.out.print("Introduce un numero: ");
num=teclado.nextInt();

}

while (num!=0);

System.out.println("La suma de los numeros pares es: " + pares);
System.out.println("La suma de los numeros impares es: " + impares);
	}
}