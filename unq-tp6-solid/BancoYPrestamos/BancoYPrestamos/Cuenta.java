package BancoYPrestamos;

public class Cuenta {
	private Cliente titular;
	private double montoDisponible = 0;
	
	public Cuenta (Cliente cliente) {
		this.titular = cliente;
	}

	public double getMontoDisponible() {
		return montoDisponible;
	}
	
	public void acreditarMonto(double monto) {
		this.montoDisponible = getMontoDisponible() + monto;
	}

	public Cliente getTitular() {
		return titular;
	}
}
