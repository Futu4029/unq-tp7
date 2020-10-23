package ejercicio2;

public class EmpleadoTemporario extends Empleado{
	private int horasX;
	private boolean tieneHijos;
	private boolean tieneEsposa;
	
	public EmpleadoTemporario(int horas, boolean tieneHijos, boolean tieneJermu) {
		super(1000.00);
		this.setHorasX(horas);
		this.setTieneHijos(tieneHijos);
		this.setTieneEsposa(tieneJermu);
	}

	@Override
	public double sueldo() {
		if (isTieneHijos() || isTieneEsposa()) {
		return 5*getHorasX() + this.getSueldo() + plusPorFamilia();
		}else {
		return 5*getHorasX() + this.getSueldo();
		}
	}
	
	public double plusPorFamilia() {
		return 100.00;
	}

	public int getHorasX() {
		return horasX;
	}

	public void setHorasX(int horasX) {
		this.horasX = horasX;
	}

	public boolean isTieneHijos() {
		return tieneHijos;
	}

	public void setTieneHijos(boolean tieneHijos) {
		this.tieneHijos = tieneHijos;
	}

	public boolean isTieneEsposa() {
		return tieneEsposa;
	}

	public void setTieneEsposa(boolean tieneEsposa) {
		this.tieneEsposa = tieneEsposa;
	}
}


	
