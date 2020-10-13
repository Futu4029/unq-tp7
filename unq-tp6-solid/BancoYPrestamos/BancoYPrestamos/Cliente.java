package BancoYPrestamos;

public class Cliente {
	private String nombre;
	private String apellido;
	private String direccion;
	private int edad;
	private double sueldoNetoMensual;
	
	
	public Cliente (String nombre, String apellido, String  direccion, int edad, double sueldoNetoMensual) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.edad = edad;
		this.sueldoNetoMensual = sueldoNetoMensual;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public String getDireccion() {
		return direccion;
	}

	public int getEdad() {
		return edad;
	}

	public double getSueldoNetoMensual() {
		return sueldoNetoMensual;
	}
	
	public double montoNetoAnual() {
		return sueldoNetoMensual*12;
	}
	
	public void solicitarCreditoPersonal(Banco banco, double monto, int cuotas) {
		CreditoPersonal solicitud = new CreditoPersonal(this, monto, cuotas);
		banco.registrarSolicitud(solicitud);
	}
	
	public void solicitarCreditoHipotecario(Banco banco, double monto, int cuotas, Propiedad propiedad) {
		CreditoHipotecario solicitud = new CreditoHipotecario(this, monto, cuotas, propiedad);
		banco.registrarSolicitud(solicitud);
	}
}
