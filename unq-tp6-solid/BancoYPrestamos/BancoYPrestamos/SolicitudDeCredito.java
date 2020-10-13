package BancoYPrestamos;

public abstract class  SolicitudDeCredito {
	private Cliente cliente;
	private double monto;
	private int cuotas;
	
	public SolicitudDeCredito(Cliente cliente, double monto, int cuotas) {
		this.cliente = cliente;
		this.setMonto(monto);
		this.setCuotas(cuotas);
	}
	public double montoCuotaMensual() {
		return getMonto() / getCuotas();
	}

	public Cliente getCliente() {
		return cliente;
	}
	public double getMonto() {
		return monto;
	}
	public void setMonto(double monto) {
		this.monto = monto;
	}
	public int getCuotas() {
		return cuotas;
	}
	public void setCuotas(int cuotas) {
		this.cuotas = cuotas;
	}
	
	public abstract boolean esAceptable();
	
}
