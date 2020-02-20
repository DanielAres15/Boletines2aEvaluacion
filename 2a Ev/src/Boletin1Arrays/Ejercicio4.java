package Boletin1Arrays;

import java.util.Arrays;

import Boletin1Arrays.UtilObtencionDatos;


/*
 * Realiza un programa que asigne datos numéricos a un array bidimensional 
 * y a continuación escriba las sumas correspondientes a las filas del array 
 * (consideramos que la primera dimensión del array son las filas)
 */
public class Ejercicio4 {

	public static void main(String[] args) {
		int[][]array;
		
		array=obtenerArray();
		array=rellenarArray(array);
		calcularEImprimir(array);
		
	}//main
	
	private static int[][] obtenerArray()
	{		
		int filas;
		int columnas;
		int[][] array;
		
		System.out.println("Indique filas:");
		filas = UtilObtencionDatos.obtencionNumericoPositivo();
		System.out.println("Indique columnas:");
		columnas = UtilObtencionDatos.obtencionNumericoPositivo();
		
		array= new int[filas][columnas];
		
		return array;
	}//obtenerArray
	
	private static int[][] rellenarArray(int [][] array)
	{
		int valor;
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array[i].length;j++)
			{
				System.out.printf("Indique el valor de [%d][%d]\n",i,j);
				valor=UtilObtencionDatos.obtencionNumericoPositivo();
				array[i][j]=valor;
			}
		}
		return array;
	}//rellenarArray
	
	public static void calcularEImprimir(int [][] array)
	{
		int valorResumen;
		for(int i=0;i<array.length;i++)
		{
			valorResumen=0;
			for(int j=0;j<array[i].length;j++)
			{
				valorResumen=valorResumen+array[i][j];
			}
			System.out.printf("El valor sumatorio de la fila %d es %d\n",i,valorResumen);
		}
	}//calcularEImprimir
	
	
	
}//class