import junit.framework.TestCase;

public class TestMicro extends TestCase {
	
	private Micro unMicro = new Micro();

	private Persona ana = new Persona();

	private Fiaca fiaca = new Fiaca();
	private Moderado moderado = new Moderado();
	private Claustrofobico claustrofobico = new Claustrofobico();
	private Apurado apurado = new Apurado();
	
	public void setUp() {
		unMicro.setVolumen(150);
		unMicro.setCantidadSentados(20);
		unMicro.setCantidadParados(10);

		ana.setPersonalidad(fiaca);

		moderado.setCantMinimaLugaresLibres(34);
	}
	
	public void testPuedeSubirFiaca() {
		assertTrue(unMicro.sePuedeSubir(ana));
	}
	
	public void testPuedeSubirModerado() {
		ana.setPersonalidad(moderado);
		assertFalse(unMicro.sePuedeSubir(ana));
	}
	
	public void testPuedeSubirClaustrofobico() {
		ana.setPersonalidad(claustrofobico);
		assertTrue(unMicro.sePuedeSubir(ana));
	}
	
	public void testPuedeSubirApurado() {
		ana.setPersonalidad(apurado);
		assertTrue(unMicro.sePuedeSubir(ana));
	}
	
	public void testSubirAApurado() {
		ana.setPersonalidad(apurado);
		unMicro.subirA(ana);
		assertTrue(unMicro.cantidadDePasajeros() == 1);
	}
	
	public void testSubirAModerado() {
		ana.setPersonalidad(moderado);
		unMicro.subirA(ana);
		assertTrue(unMicro.cantidadDePasajeros() == 0);
	}
	
	public void testSubirAFiaca() {
		ana.setPersonalidad(fiaca);
		unMicro.subirA(ana);
		assertTrue(unMicro.cantidadDePasajeros() == 1);
	}
	
	public void testSubirAClaustrofobico() {
		unMicro.setVolumen(90);
		ana.setPersonalidad(claustrofobico);
		unMicro.subirA(ana);
		assertTrue(unMicro.cantidadDePasajeros() == 0);
	}
	
	public void testBajarAApurado() {
		ana.setPersonalidad(apurado);
		unMicro.subirA(ana);
		assertTrue(unMicro.cantidadDePasajeros() == 1);
		unMicro.bajarAPersona(ana);
		assertTrue(unMicro.cantidadDePasajeros() == 0);
	}
	
	public void testBajarAModerado() {
		ana.setPersonalidad(moderado);
		unMicro.subirA(ana);
		assertTrue(unMicro.cantidadDePasajeros() == 1);
		unMicro.bajarAPersona(ana);
		assertTrue(unMicro.cantidadDePasajeros() == 0);
	}
}