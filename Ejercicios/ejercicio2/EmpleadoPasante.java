package ejercicio2;

public class EmpleadoPasante extends Empleado{
	private int horasX;
	public EmpleadoPasante(double sueldo, int horasX) {
		super(sueldo);
		this.setHorasX(horasX);
	}

	@Override
	public double sueldo() {
		return 40*getHorasX() + this.getSueldo();
	}

	public int getHorasX() {
		return horasX;
	}

	public void setHorasX(int horasX) {
		this.horasX = horasX;
	}
}
