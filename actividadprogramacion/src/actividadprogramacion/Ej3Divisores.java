package actividadprogramacion;
import java.util.Scanner;

public class Ej3Divisores{

public static void main (String[]args) {
	Scanner teclado=new Scanner(System.in);
	int numero;

	System.out.print("Introduce un numero: ");
	numero=teclado.nextInt();

	if (numero <= 3)
		System.out.println ("El numero " + numero + " no tiene divisores propios");
	else
	for(int i=2; i < numero -1; i++) {
		if (numero% i==0) {
			System.out.println("El numero " + i + " es divisor propio de " + numero);
			}
		}
	}
}