package Boletin3Usoavanzadoclases2;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Triangulo miTriangulo=new Triangulo(2,4);
		Cuadrado miCuadrado=new Cuadrado(4);
		Circulo miCirculo=new Circulo(4);
		Rectangulo miRectangulo=new Rectangulo(2, 4);
		
		miTriangulo.calcularArea();
		System.out.println("El area de mi triángulo es: "+miTriangulo.getArea());
		
		miCuadrado.calcularArea();
		System.out.println("El area de mi cuadrado es: "+miCuadrado.getArea());
		
		miCirculo.calcularArea();
		System.out.println("El area de mi círculo es: "+miCirculo.getArea());
		
		miRectangulo.calcularArea();
		System.out.println("El area de mi rectángulo es: "+miRectangulo.getArea());
	}

}
