package actividadprogramacion;

import java.util.Scanner;
 
public class Ej11Tema4 {
public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);
    
    System.out.print("Introduce una frase: ");
        
    String cadena = teclado.nextLine().toUpperCase();
    
    if (cadena.length()<=60) {
    	
    int distintas=0;
    for (int i=0; i<cadena.length(); i++){
    	char letra = cadena.charAt(i);
    	boolean nueva=true; 
    	// Determino si la letra es distinta
    /*	for (int j=0; j<i; j++)
    		if (letra==cadena.charAt(j))
    			nueva = false;*/
    	int k=0;
    	while (k<i && nueva) {
    		if (letra==cadena.charAt(k))
    			nueva = false;
    		k++;
    }
    
    	if (nueva) {
    		distintas = distintas+1;
    		int contador = 1;
    		for (int j= i+1; j<cadena.length(); j++)
    			if (letra==cadena.charAt(j))
    				contador++;
    		
    		System.out.format("La frecuencia de " + letra + " es: %.3f%n", (float)contador/cadena.length());
    	}	
    }
    	System.out.println("El numero de letras distintas es: " + distintas);
}
    else {
    	System.out.println("NUMERO DE CARACTERES EXCEDIDO");
    }
}
}