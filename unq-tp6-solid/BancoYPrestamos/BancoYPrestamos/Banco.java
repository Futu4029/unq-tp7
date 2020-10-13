package BancoYPrestamos;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	private List<Cliente> clientes = new ArrayList<Cliente>();
	private List<SolicitudDeCredito> solicitudes = new ArrayList<SolicitudDeCredito>();
	private List<Cuenta> cuentas = new ArrayList<Cuenta>();
	
	public Banco() {
		super();
	}
	
	public List<Cliente> getClientes() {
		return clientes;
	}
	
	public List<SolicitudDeCredito> getSolicitudes(){
		return solicitudes;
	}
	
	public void registrarCliente(Cliente cliente) {
		clientes.add(cliente);
		cuentas.add(new Cuenta(cliente));
	}
	
	public void registrarSolicitud(SolicitudDeCredito solicitud) {
		solicitudes.add(solicitud);
		this.evaluacionDeCredito(solicitud);
	}
	
	public void evaluacionDeCredito(SolicitudDeCredito solicitud) {
		if (solicitud.esAceptable()){
			this.otorgarCredito(solicitud.getCliente(), solicitud.getMonto());
		}
	}
	
	public void otorgarCredito(Cliente cliente, double monto) {
		this.findCuenta(cliente).acreditarMonto(monto);
	}
	
	public Cuenta findCuenta(Cliente cliente) {
		return cuentas.stream().filter(cuenta -> cuenta.getTitular().equals(cliente)).findFirst().get();
	}
	
	public double montoADesembolzar() {
		return solicitudes.stream().filter(
				soli -> soli.esAceptable()).mapToDouble(
						soli -> soli.getMonto()).sum();
	}
	
}
