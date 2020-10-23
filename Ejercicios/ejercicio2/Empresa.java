package ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
	private List<Empleado> empleados = new ArrayList<Empleado>();

	public Empresa() {
		super();
	}
	
	public List<Empleado> getEmpleados() {
		return empleados;
	}
	
	public void sueldoALiquidar(Empleado empleado) {
		empleado.sueldo();
	}
}
