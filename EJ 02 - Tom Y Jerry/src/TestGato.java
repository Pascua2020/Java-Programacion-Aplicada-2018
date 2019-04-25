import junit.framework.TestCase;

public class TestGato extends TestCase {
	
	Gato tom;
	Raton jerry;

	public void setUp() {
		tom = new Gato();
		tom.setEnergia(20);
		tom.setPosicion(30);

		jerry = new Raton();
		jerry.setPeso(4);
		jerry.setPosicion(34);
	}
	
	public void testTomPuedeAtraparAJerry() {
		assertTrue(tom.puedeAtraparA(jerry));		
	}

	public void testTomNoPuedeAtraparAJerry() {
		tom.setEnergia(10);
		assertFalse(tom.puedeAtraparA(jerry));
	}
	
	public void testTomCorrerAJerry() {
		tom.correrA(jerry);
		assertTrue(tom.getEnergia() == 6);
		assertTrue(tom.getPosicion() == jerry.getPosicion());
	}
}