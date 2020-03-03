package Boletin2Usodeclases;

import java.util.Scanner;

public class Ejercicio2 {
	static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean valorMenu=false;//booleano para comprobar si el usuario escribe o no el "0" para salir.
		do//bucle do while que repitirá todo el menú y opciones hasta que el usuario escriba"0".
		{
			int valorTeclado=5;//Iniciamos la variable valorTeclado con un valor que no consta en el menú.
			boolean valorCorrecto;
			System.out.println("Elije una de las opciones del siguiente menú:");
			System.out.println(" ");
			System.out.println("(1) Área del triángulo");
			System.out.println("(2) Área del cuadrado");
			System.out.println("(3) Área del rectángulo");
			System.out.println("(4) Área del rombo");
			System.out.println("(0) Salir");
			
			/* Hacemos la comprobación de que el usuario introduce un número correcto. Podríamos hacerlo con una
			 * función orientada solamente a pedir este número, pero no ahorraríamos código.*/
			
			do
			{
				if(sc.hasNextInt())
				{
					valorCorrecto=true;
					valorTeclado=sc.nextInt();
				}
				else
				{
					valorCorrecto=false;
					System.out.println("No has escrito un número correcto.Vuelve a intentarlo pulsando:\n"
							+ "(1) Para el área del triángulo\n(2) Para el área del cuadrado\n(3) Para el área del rectángulo\n(4) Para el área del rombo\n(0) Para salir\n");
					sc.next();
				}
			}while(valorCorrecto==false);
		
			switch(valorTeclado)
			{
			
				case 1:
					Triángulo.areaTriangulo();
				break;
				
				case 2:
					Cuadrado.areaCuadrado();
					break;
					
				case 3:
					Rectangulo.areaRectangulo();
					break;
					
				case 4:
					Rombo.areaRombo();
					break;
					
				case 0:
					valorMenu=true;
					System.out.printf("¡Hasta la próxima!");
					break;
			}
		}while(valorMenu==false);//bucle que hace que si no se escribe el "0" para salir, repita el menú.
	}
}
