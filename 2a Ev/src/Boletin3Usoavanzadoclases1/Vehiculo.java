package Boletin3Usoavanzadoclases1;

public class Vehiculo {

	private String matricula;
	private String tipo;
	private int velocidadMaxima;
	private Conductor conductor;
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}
	public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}
	public Conductor getConductor() {
		return conductor;
	}
	public void setConductor(Conductor conductor) {
		this.conductor = conductor;
	}
	public void mostrarDatos() {
		System.out.printf("Los datos de este vehiculo son: matricula %s\n Tipo %s\n Velocidad máxima %d km/h",matricula,tipo,velocidadMaxima);
	}
	
}
