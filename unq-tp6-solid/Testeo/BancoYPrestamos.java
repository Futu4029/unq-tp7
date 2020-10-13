import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import BancoYPrestamos.*;

class BancoYPrestamos {
	private Banco banco;
	private Cliente jose;
	private Cliente jaz;
	private CreditoPersonal cp1;
	private CreditoHipotecario ch1;
	private CreditoPersonal cp2;
	private CreditoHipotecario ch2;
	private Propiedad ph1;
	private Propiedad ph2;
	
	@BeforeEach
	public void setUp() {
		banco = new Banco();
		jose = new Cliente("Lorca", "jose", "Los Cabildos 2323", 30, 45000.00);
		ph1 = new Propiedad("Lugar piola", "Los Cabildos 2323", 555555.00);
		ph2 = new Propiedad("Lugar piola", "Los Cabildos 2323", 5.00);
		cp1 = new CreditoPersonal(jose, 20000.00, 10);
		ch1 = new CreditoHipotecario(jose, 20000.00, 4, ph1);
		jaz = new Cliente("Diaz", "jaz", "Mine 2121", 23, 10000.00);
		cp2 = new CreditoPersonal(jaz, 20000.00, 2);
		ch2 = new CreditoHipotecario(jaz, 20000.00, 10, ph2);
		
		
		banco.registrarCliente(jose);
		banco.registrarCliente(jaz);
		jaz.solicitarCreditoHipotecario(banco, 10000, 10, ph2);
		jose.solicitarCreditoHipotecario(banco, 20000, 4, ph1);
		jose.solicitarCreditoPersonal(banco, 50000, 3);
	}
	
	
	@Test
	void esAceptableCP1() {
		assertTrue(cp1.esAceptable());
	}
	@Test
	void esAceptableCH1() {
		assertTrue(ch1.esAceptable());
	}
	
	@Test
	void esAceptableCH2() {
		assertTrue(!ch2.esAceptable());
	}
	
	@Test
	void esAceptableCP2() {
		assertTrue(!cp2.esAceptable());
	}
	
	@Test
	void solicitudJazCreditoHipotecario() {
		assertEquals(0, banco.findCuenta(jaz).getMontoDisponible());
	}
	
	@Test
	void testCuotas() {
		assertEquals(5000, ch1.montoCuotaMensual());
	}
	
	@Test
	void solicitudJoseCreditoHipotecario() {
		assertEquals(70000, banco.findCuenta(jose).getMontoDisponible());
	}
	
	@Test
	void cantSolicitudes() {
		assertEquals(3, banco.getSolicitudes().size());
	}
	
	@Test
	void calcularMontoTotal() {
		assertEquals(70000, banco.montoADesembolzar());
	}
	
	
}
