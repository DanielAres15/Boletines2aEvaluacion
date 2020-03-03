package Boletin2Usodeclases;

import java.util.Scanner;

public class Rectangulo {

	int base;
	int altura;
	int resultado;
	
public static void areaRectangulo () {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Introduce la base");
		int base= sc.nextInt();
		System.out.println("Introduce la altura");
		int altura= sc.nextInt();
		
		
		int resultado=(base*altura);
			
		System.out.print("El area del rectángulo es: "+resultado);
			
		System.out.println("\n");
			
			
		}
}
