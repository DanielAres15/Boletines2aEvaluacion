package Boletin2Usodeclases;

import java.util.Scanner;

public class Rombo {
	
	int diagma;
	int diagme;
	int resultado;
	
public static void areaRombo () {
	
	Scanner sc= new Scanner(System.in);
	
	System.out.println("Introduce la diagonal mayor");
	int diagma= sc.nextInt();
	System.out.println("Introduce la diagonal menor");
	int diagme= sc.nextInt();
	
	
	int resultado=(diagma*diagme)/2;
		
	System.out.print("El area del rombo es: "+resultado);
		
	System.out.println(" ");
		
		
	}
}
