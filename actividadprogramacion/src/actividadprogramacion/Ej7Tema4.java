package actividadprogramacion;

import java.util.Scanner;
 
public class Ej7Tema4{
    public static void main(String[] args){
        String str = "E s P a Ñ a";
        char ch;
        int uppercase=0,lowercase=0,numeros=0,espacios=0;
        for(int i=0;i<str.length();i++){
            ch = str.charAt(i);
            int asciivalue = (int)ch;
            
            if(asciivalue==32){
            	espacios++;
            }
            if(asciivalue>=48 && asciivalue<=57){
            	numeros++;
            }
            if(asciivalue>=65 && asciivalue<=90 || asciivalue==128 || asciivalue==165){
                uppercase++;
            }
            else if(asciivalue>=97 && asciivalue<=122 || asciivalue==135 || asciivalue==164){
                lowercase++;    
            }
        }
        System.out.println(str);
        System.out.println("Cantidad de espacios en blanco: " + espacios);
        System.out.println("Cantidad de numeros introducidos: " + numeros);
        System.out.println("Cantidad de letras mayusculas: " + uppercase);
        System.out.println("Cantidad de letras minusculas: " + lowercase); 
    }
}