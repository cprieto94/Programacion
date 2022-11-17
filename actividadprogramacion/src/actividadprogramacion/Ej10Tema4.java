package actividadprogramacion;

import java.util.Scanner;
 
public class Ej10Tema4 {
public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);
    String codigo;
   
    
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
	    		
	    	if (sexo=='H' || sexo=='M' || sexo=='h' || sexo=='m') {	 	
	    	}
	    	else {
	    		System.out.println("El sexo no es correcto");
	    	}
	    	
	    	if (curso=='1' || curso=='2') {	    	
	    	}
	    	else {
	    		System.out.println("El curso no es correcto");
	    	}
	    	}
	    	else {
	    		System.out.println("El ano no es un numero entre 1990 y 1995");
	    	}
	    	
	    }
	    else {
	    	System.out.println("El ano no es un numero");
	    }
    }
    else {
    	System.out.println("Debe tener 8 caracteres");
    }
  }
}
