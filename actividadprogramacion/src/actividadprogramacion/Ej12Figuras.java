package actividadprogramacion;

import java.io.*;
public class Ej12Figuras {

public static void main(String[] args)throws IOException {
BufferedReader in =new BufferedReader (new InputStreamReader(System.in));

int nu;
int lado;
float area;
int base;
int altura;
float radio;
float pi;
pi=(float) 3.14;
System.out.println("1 - Area del cudrado");
System.out.println("2 - Area del triangulo");
System.out.println("3 - Area del rectangulo");
System.out.print("Seleccione la opcion: ");
nu= Integer.parseInt(in.readLine());

if (nu==1){
System.out.print("Diga el lado del cuadrado: ");
lado= Integer.parseInt(in.readLine());
area= lado*lado;
System.out.print("El area del cudrado es: "+ area);
}

if (nu==2){
System.out.print("Diga la base del triangulo: ");
base= Integer.parseInt(in.readLine());
System.out.print("Diga la altura del triangulo: ");
altura= Integer.parseInt(in.readLine());
area=(base*altura)/2;
System.out.print("El area del triangulo es: "+ area);
}

if (nu==3){
System.out.print("Diga la base del rectangulo: ");
base= Integer.parseInt(in.readLine());
System.out.print("Diga la altura del rectangulo: ");
altura=Integer.parseInt(in.readLine());
area=base*altura;
System.out.print("El area del rectangulo es: "+ area);

		}
	}
}