package actividadprogramacion;

import java.util.Scanner;

public class Ej11MultiplesPrimos {
	public static void main(String[] args) {
		int inicio, fin, contador = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Escribe el inicio: ");
		inicio = sc.nextInt();
		
		System.out.print("Escribe el fin: ");
		fin = sc.nextInt();
		
		for (int x = inicio; x <= fin; x++) {
			if (esPrimo(x)) {
				contador++;
				System.out.print(String.valueOf(x) + " ");
			}
		}
		System.out.printf("\nTotal: %d", contador);
		sc.close();
	}

	public static boolean esPrimo(int numero) {

		if (numero == 0 ||numero == 4) {
			return false;
		}
		for (int x = 2; x < numero / 2; x++) {

			if (numero % x == 0)
				return false;
		}

		return true;
	}
}