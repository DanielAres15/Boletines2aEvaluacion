package Boletin2Usodeclases;

import java.util.Scanner;

public class Cuadrado {

	int lado;
	int resultado;
	
	
public static void areaCuadrado () {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Introduce el lado");
		int lado= sc.nextInt();
		
	
		int resultado=(lado*lado);
			
		System.out.print("El area del cuadrado es: "+resultado);
			
		System.out.println("\n");
			
		}
}
