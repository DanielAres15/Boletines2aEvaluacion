package Boletin1Arrays;

import java.util.Scanner;

public class UtilObtencionDatos {

	/**
	 * Funci�n que obtiene de consola un valor num�rico entero
	 * Si el usuario introduce un valor que no es num�rico entero se sigue 
	 * preguntando al usuario
	 * @return El valor num�rico entero obtenido del usuario
	 */
	public static int obtenerValorEntero() {
		int valor=0;
		boolean valorCorrecto = false;

		Scanner sc = new Scanner(System.in);
		
		while (valorCorrecto == false) {
			System.out.println("Introduce un valor num�rico entero: ");
			
			if(sc.hasNextInt())
			{
				valor = sc.nextInt();
				valorCorrecto=true;
			}
			else
			{
				sc.next();
				valorCorrecto = false;
			}
		}
		return valor;
	}//obtenerValorEntero
	
	
	/**
	 * Funci�n que obtiene de consola un valor num�rico entero
	 * Si el usuario introduce un valor que no es num�rico entero se sigue 
	 * preguntando al usuario
	 * @return El valor num�rico entero obtenido del usuario
	 */
	public static int obtenerValorEntero(String mensaje) {
		int valor=0;
		boolean valorCorrecto = false;

		Scanner sc = new Scanner(System.in);
		
		while (valorCorrecto == false) {
			System.out.println(mensaje);
			
			if(sc.hasNextInt())
			{
				valor = sc.nextInt();
				valorCorrecto=true;
			}
			else
			{
				sc.next();
				valorCorrecto = false;
			}
		}
		return valor;
	}//obtenerValorEntero
	
	/**
	 * Funci�n que obtiene de consola un valor num�rico entero entre dos valores
	 * Se utiliza con men�s, para obtener un valor entre los indicados
	 * @param mensajeMenu mensaje del men� que se mostrar�
	 * @param numeroMenor menor n�mero a elegir
	 * @param numeroMayor mayor n�mero a elegir
	 * @return valor elegido de entre los posibles
	 */
	public static int obtenerValorMenu(String mensajeMenu,int numeroMenor,int numeroMayor) {
		int valor=0;
		boolean valorCorrecto = false;

		Scanner sc = new Scanner(System.in);
		
		while (valorCorrecto == false) {
			System.out.println(mensajeMenu);
			
			if(sc.hasNextInt())
			{
				valor = sc.nextInt();
				if(valor>=numeroMenor && valor<=numeroMayor)
					valorCorrecto=true;
				else
				{
					System.out.println("Debe escogerse un valor entre los indicados en el men�");
					valorCorrecto=false;
				}
			}
			else
			{
				sc.next();
				valorCorrecto = false;
			}
		}
		return valor;
	}//obtenerValorMenu
	
	/**
	 * Funci�n que obtiene de consola un valor num�rico entero y positivo
	 * Si el usuario introduce un valor que no es num�rico entero positivo se sigue 
	 * preguntando al usuario
	 * @return El valor num�rico entero positivo obtenido del usuario
	 */
	public static int obtencionNumericoPositivo() {
		int valor=0;
		boolean valorCorrecto = false;

		Scanner sc = new Scanner(System.in);
		
		while (valorCorrecto == false) {
			System.out.println("Introduce un valor num�rico entero positivo: ");
			
			if(sc.hasNextInt())
			{
				valor = sc.nextInt();
				if(valor>0)
					valorCorrecto=true;
				else
					valorCorrecto=false;
			}
			else
			{
				sc.next();
				valorCorrecto = false;
			}
		}
		return valor;
	}//obtenerValorEnteroPositivo
	
	
	public static String obtenerValorCadena() {
		System.out.println("Introduce un valor: ");
		Scanner sc = new Scanner(System.in);
		return sc.nextLine();
	}//obtenerValorCadena

	public static char obtenerValorCaracter() {
		String valorIntroducido = "";
		boolean valorCorrecto = false;

		Scanner sc = new Scanner(System.in);
		
		while (valorCorrecto == false) {
			System.out.println("Introduce un caracter: ");
			
			valorIntroducido = sc.nextLine();
			if (valorIntroducido.length() == 1)
				valorCorrecto = true;
			else
				valorCorrecto = false;
		}
		return valorIntroducido.charAt(0);
	}//obtenerValorCaracter
}//UtilObtencionDatos