package actividadprogramacion;

public class Funciones {
public static void main(String[] args) {
int t;
String num ="0123456789", trozo;
String let ="abcdefghijklmnop";
char letra;
//escritura acumulada
for (t=0;t<=num.length();t++)
{
trozo=num.substring(0, t);
System.out.println("este es el trozo obtenido: "+ trozo);
}
//deletreo o recorrido de un string caracter a caracter
for (t=0;t<num.length();t++)
{
trozo=num.substring(t, t+1);
System.out.println("este es el trozo obtenido: "+ trozo);
}
let=let.replace('c','X');
let=let.replace('d','X');
let=let.replace('e','X');
System.out.println("despues del reemplazao de las equis>>> "+ let);
// si solo se ejecuta el método replace el contenido de let no cambia
let.replace('c','Z');
let.replace('d','Z');
let.replace('e','Z');
System.out.println("despues del reemplazao de las zetas>>> "+ let);
letra=num.charAt(0);
t=letra;
System.out.println("la letras sexta ha sido: "+ t);
let=String.valueOf(letra);
// Alfabeto mayusculas
for (letra=65;letra<=90;letra++)
System.out.print(letra+"/");
System.out.println();
// Alfabeto minusculas
for (letra=97;letra<=122;letra++)
System.out.print(letra+"/");
// numeros tratados como caracteres
for (letra=48;letra<=57;letra++)
System.out.print(letra+"/");
System.out.println();
}// fin de main
}//fin de class