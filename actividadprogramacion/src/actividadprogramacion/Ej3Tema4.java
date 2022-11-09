package actividadprogramacion;
import java.util.Scanner;
public class Ej3Tema4 {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		String insertaPalabra;
		String insertaFrase;

		System.out.print("Dime una frase: ");
		insertaFrase = teclado.nextLine();

		System.out.print("Dime una palabra: ");
		insertaPalabra = teclado.nextLine();
		
		System.out.println("Esa palabra esta en la posicion: " + posicionPalabra(insertaFrase, insertaPalabra));
		teclado.close();
	}
	
	public static int posicionPalabra(String frase, String palabra) {
		
		String[] palabras = frase.split(" ");
		
		for (int i = 0; i < palabras.length; i++) {
			if (palabras[i].equals(palabra))
				return i+1;
		}
		
		return 0;
	}

}