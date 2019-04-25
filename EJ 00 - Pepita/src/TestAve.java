import junit.framework.TestCase;

public class TestAve  extends TestCase {
	
	Ave pepita;
	
	public void setUp() {
		pepita = new Ave();
		pepita.setEnergia(100);
		pepita.setUbicacion("marDelPlata");
	}
	
	public void testComer() {
		pepita.comer(50);
		assertTrue(pepita.getEnergia() == 150.0);
	}
	
	public void testUbicacion() {
		assertTrue(pepita.getUbicacion() ==  "marDelPlata");
	}
	
	public void testVolar() {
		pepita.volar(120);
		assertTrue(pepita.getEnergia() == 30 );
	}
	
	public void testCambiarUbicacion() {
		pepita.setUbicacion("lasToninas");
		assertTrue(pepita.getUbicacion() == "lasToninas" );
	}
	
	public void testOtroVolar() {
		pepita.volar(180);
		assertTrue(pepita.getEnergia() == 0 );
	}
	
	public void testEstaFeliz() {
		pepita.comer(50);
		assertTrue(pepita.getEnergia() == 150.0);
		assertTrue(pepita.estaFeliz());
	}

}
