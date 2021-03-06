package Boletin3Usoavanzadoclases1;

public class Vehiculo {

	protected String matricula;
	protected String tipo;
	protected int velocidadMaxima;
	protected Conductor conductor;
	
	public Vehiculo(String matricula, String tipo, int velocidadMaxima, Conductor conductor) {
		// TODO Auto-generated constructor stub
		this.matricula = matricula;
		this.tipo = tipo;
		this.velocidadMaxima = velocidadMaxima;
		this.conductor = conductor;
	}
	
	public Vehiculo(String matricula, String tipo, int velocidadMaxima) {
		// TODO Auto-generated constructor stub
		this.matricula = matricula;
		this.tipo = tipo;
		this.velocidadMaxima = velocidadMaxima;
	}
	
	public Vehiculo() {
		// TODO Auto-generated constructor stub
	}
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
		System.out.printf("Los datos de este vehiculo son: \n Matr�cula: %s\n Tipo: %s\n Velocidad m�xima: %d km/h \n Conductor: \n %s\n ",matricula,tipo,velocidadMaxima, conductor);
	}
	
}
