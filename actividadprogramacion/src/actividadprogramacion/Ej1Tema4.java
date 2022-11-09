package actividadprogramacion;

import java.util.Scanner;
 
public class Ej1Tema4 {
public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);
    String codigo;
    
    int hPrimero = 0, hSegundo = 0, mPrimero = 0, mSegundo = 0;
    
    System.out.print("Ingresa un codigo: ");
    codigo=teclado.nextLine();
    
    if (codigo.length()==8) {
    	String ano=codigo.substring(0,4);

    	boolean numero = true;
	    for (int i = 0; i < ano.length(); i++) {
	    	char car = ano.charAt(i);
	    	if (!Character.isDigit(car)) {
	    		numero = false;
	    		break;
	    	}
	    }
	    
	    if (numero) {
	    	int n = Integer.parseInt(ano);
	    	if (n <= 1995 && n >= 1990) {
	    		char sexo = codigo.charAt(4);
	    		char curso = codigo.charAt(5);
	    		
	    		if ()
	    		
	    	}else {
	    		System.out.println("El año no es un núnero entre 1990 y 1995");
	    	}
	    	
	    }else {
	    	System.out.println("El año no es un número");
	    }
    }
    else {
    	System.out.println("Debe tener 8 caracteres");
    }
	}
}
