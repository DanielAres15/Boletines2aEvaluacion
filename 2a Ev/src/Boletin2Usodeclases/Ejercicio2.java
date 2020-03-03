package Boletin2Usodeclases;

import java.util.Scanner;

public class Ejercicio2 {
	static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean valorMenu=false;//booleano para comprobar si el usuario escribe o no el "0" para salir.
		do//bucle do while que repitir� todo el men� y opciones hasta que el usuario escriba"0".
		{
			int valorTeclado=5;//Iniciamos la variable valorTeclado con un valor que no consta en el men�.
			boolean valorCorrecto;
			System.out.println("Elije una de las opciones del siguiente men�:");
			System.out.println(" ");
			System.out.println("(1) �rea del tri�ngulo");
			System.out.println("(2) �rea del cuadrado");
			System.out.println("(3) �rea del rect�ngulo");
			System.out.println("(4) �rea del rombo");
			System.out.println("(0) Salir");
			
			/* Hacemos la comprobaci�n de que el usuario introduce un n�mero correcto. Podr�amos hacerlo con una
			 * funci�n orientada solamente a pedir este n�mero, pero no ahorrar�amos c�digo.*/
			
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
					System.out.println("No has escrito un n�mero correcto.Vuelve a intentarlo pulsando:\n"
							+ "(1) Para el �rea del tri�ngulo\n(2) Para el �rea del cuadrado\n(3) Para el �rea del rect�ngulo\n(4) Para el �rea del rombo\n(0) Para salir\n");
					sc.next();
				}
			}while(valorCorrecto==false);
		
			switch(valorTeclado)
			{
			
				case 1:
					Tri�ngulo.areaTriangulo();
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
					System.out.printf("�Hasta la pr�xima!");
					break;
			}
		}while(valorMenu==false);//bucle que hace que si no se escribe el "0" para salir, repita el men�.
	}
}
