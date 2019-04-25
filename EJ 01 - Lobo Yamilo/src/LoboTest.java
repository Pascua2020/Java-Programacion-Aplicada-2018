import junit.framework.TestCase;

public class LoboTest extends TestCase {
		
	Lobo yamilo;
	Chancho chanchitoCasaPaja;
	
	public void setUp() {
		yamilo = new Lobo();
		yamilo.setCalorias(120);

		chanchitoCasaPaja = new Chancho();
		chanchitoCasaPaja.setPeso(500);
	}
	
	public void testCalorias() {
		assertTrue(yamilo.calorias() == 120.0);
	}
	
	public void testComer() {
		yamilo.comer(chanchitoCasaPaja);
		assertTrue(yamilo.calorias() == 170.0);
	}	
	
	public void testNoEstaGordo() {
		assertFalse(yamilo.estaGordo());
	}
	
	public void testEstaGordo() {
		yamilo.setCalorias(250);
		assertTrue(yamilo.estaGordo());
	}
	
	public void testEstaSaludable() {
		assertTrue(yamilo.estaSaludable());
	}
	
	public void testCorrer() {
		yamilo.correr(20);
		assertTrue(yamilo.calorias() == 80.0);
	}
}