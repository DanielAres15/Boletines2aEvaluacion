package Boletin2Usodeclases;

import java.util.Scanner;

public class Triángulo {

	int base;
	int altura;
	int resultado;
	
	public static void areaTriangulo () {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Introduce la base");
		int base= sc.nextInt();
		System.out.println("Introduce la altura");
		int altura= sc.nextInt();
		
		
		int resultado=(base*altura)/2;
			
		System.out.print("El area del triángulo es: "+resultado);
			
		System.out.println("\n");
			
			
		}
	
}
