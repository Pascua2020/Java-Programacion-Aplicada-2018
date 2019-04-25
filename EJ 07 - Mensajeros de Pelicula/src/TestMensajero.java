import junit.framework.TestCase;

public class TestMensajero extends TestCase{
	
	private Roberto elRoberto = new Roberto();
	private Neo elNeo = new Neo();
	
	private Camion elC= new Camion();
	
	private Brooklyn br = new Brooklyn();
	private Matrix mx = new Matrix();
	
	private Paquete pq = new Paquete();
	private Paquete pq2 = new Paquete();
	
	public void setUp() {
	}
	
	public void testRobertoLlevaPaquete(){
		elC.setNumAcoplados(1);
		elRoberto.setViajaEn(elC);
		elRoberto.setPeso(90);
		elRoberto.setElDestino(br);
		elRoberto.setElPaquete(pq);
		pq.setPago(true);
		
		assertTrue(elRoberto.entregarPaquete(br, pq)==true);
	}
	
	public void testNeoLlevaPaquete(){
		elNeo.setElDestino(mx);
		pq2.setPago(false);
		elNeo.setElPaquete(pq2);
		
		assertTrue(elRoberto.entregarPaquete(mx, pq2)==false);
	}

}
