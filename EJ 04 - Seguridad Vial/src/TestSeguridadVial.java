import junit.framework.TestCase;

public class TestSeguridadVial extends TestCase {
	
	private Conductor carlitos = new Conductor();
	private Auto falcon = new Auto();
	private Moto yamaha = new Moto();
	
	public void setUp() {
		falcon.setPlusVelocidad(40);
		falcon.setTieneRuedaAuxilio(true);
		
		carlitos.setTieneRegistro(true);
		carlitos.setVehiculo(falcon);
		
		yamaha.setVelocidad(160);
		yamaha.setCantEspejos(2);
	}
	
	public void testConductorCarlitosSeguro() {
		assertTrue(falcon.esSeguro());
		assertTrue(carlitos.esSeguro());
	}
	
	public void testAutoNoSeguro() {
		falcon.setPlusVelocidad(60);
		assertFalse(falcon.esSeguro());
		assertFalse(carlitos.esSeguro());
	}
	
	public void testConductorMotoSeguro() {
		carlitos.setVehiculo(yamaha);
		assertTrue(yamaha.esSeguro());
		assertTrue(carlitos.esSeguro());
	}
	
	
	public void testConductorMotoNoSegura() {
		carlitos.setVehiculo(yamaha);
		yamaha.setVelocidad(250);
		assertFalse(yamaha.esSeguro());
		assertFalse(carlitos.esSeguro());        
	}
}