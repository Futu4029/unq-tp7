package BancoYPrestamos;

public class CreditoHipotecario extends SolicitudDeCredito{
	private Propiedad propiedad;
	
	public CreditoHipotecario(Cliente cliente, double monto, int cuotas, Propiedad prop) {
		super(cliente, monto, cuotas);
		this.propiedad = prop;
	}
	
	@Override
	public boolean esAceptable() {
		return  this.montoCuotaMensual() <= this.getCliente().getSueldoNetoMensual()*0.5
				&& this.getMonto() <= propiedad.getValorFiscal()
				&& this.getCliente().getEdad() + this.getCuotas()/12  <= 65;
	}
}
