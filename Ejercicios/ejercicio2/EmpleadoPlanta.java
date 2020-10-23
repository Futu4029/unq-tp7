package ejercicio2;

public class EmpleadoPlanta extends Empleado{
	private int cantidadDeHijos;
	public EmpleadoPlanta(int cantidadDeHijos) {
		super(3000.00);
		this.setCantidadDeHijos(cantidadDeHijos);
	}

	@Override
	public double sueldo(){
		return getSueldo() + getCantidadDeHijos() * 150;
	}

	public int getCantidadDeHijos() {
		return cantidadDeHijos;
	}

	public void setCantidadDeHijos(int cantidadDeHijos) {
		this.cantidadDeHijos = cantidadDeHijos;
	}
		
}
