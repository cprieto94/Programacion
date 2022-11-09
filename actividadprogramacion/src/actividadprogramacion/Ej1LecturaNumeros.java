package actividadprogramacion;

/** Este programa ......
@author yo
*/
import java.util.Scanner;
public class Ej1LecturaNumeros {
	public static void main (String args[]){
		Scanner teclado=new Scanner (System.in);
		int suma=0;
		int a,b,resultado; //numero que leemos por teclado
		System.out.print("Escribe el numero A: "); a=teclado.nextInt();
		System.out.print("Escribe el numero B: "); b=teclado.nextInt();
		if (a>b) System.out.println("Error: " + a + " es mayor que " + b);
		else { for (int contador=a+1; contador<b; contador++)
			suma+=contador;	
			resultado=(a+1+b-1);
			System.out.print("La suma de los numeros entre " + a +" y " + b + " es: ");
			System.out.print(resultado);
		}
	}
}
