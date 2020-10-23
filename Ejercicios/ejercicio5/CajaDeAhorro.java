package ejercicio5;

public class CajaDeAhorro extends CuentaBancaria {
	private int limite;
	public CajaDeAhorro(String titular, int limite){
		super(titular);
		this.limite=limite;
	}
	public int getLimite(){
		return this.limite;
	}
	public boolean validarExtraccion(int monto) {
		return this.getSaldo()>=monto && this.getLimite()>=monto;
	}
}

