package ejercicio2;

public abstract class Empleado {
	private double sueldo;
	
	public Empleado(double sueldo) {
		this.sueldo = sueldo;
	}
	
	public abstract double sueldo();
	
	public double getSueldo() {
		return sueldo;
	}
	
}
