package Boletin3Usoavanzadoclases2;

public abstract class Figura {

	private double area;
	
	public void setArea(double area) {
		// TODO Auto-generated method stub
		this.area=area;
	}
	
	public double getArea() {
		// TODO Auto-generated method stub
		return this.area;
	}
	protected abstract void calcularArea();
	
	protected  void imprimirArea() {
		System.out.println(area);
	}
	
}
