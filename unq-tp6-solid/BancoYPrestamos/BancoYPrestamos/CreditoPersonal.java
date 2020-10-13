package BancoYPrestamos;

public class CreditoPersonal extends SolicitudDeCredito{

	public CreditoPersonal(Cliente cliente, double monto, int cuotas) {
		super(cliente, monto, cuotas);
	}
	
	public boolean esAceptable() {
		return this.getCliente().montoNetoAnual()>= 15000
				&& this.montoCuotaMensual() <= this.getCliente().getSueldoNetoMensual()*0.7;
	}
}
