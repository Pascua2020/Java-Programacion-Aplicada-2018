import junit.framework.TestCase;

public class TestMascota  extends TestCase{
	
	Mascota tamagotchi;
	
	public void setUp() {
		tamagotchi = new Mascota();
		tamagotchi.setNivel(1);
	}

	public void testMascotaComerContenta() {
		tamagotchi.setEstadoMascota(new Contenta());
		tamagotchi.comer();
		this.assertTrue(tamagotchi.getNivel() == 2);
	}
	
	public void testMascotaComerAburridaMas80Min() {
		tamagotchi.setEstadoMascota(getAburrida(100));
		tamagotchi.comer();
		this.assertTrue(tamagotchi.getEstadoMascota().getClass() == Contenta.class);
	
	}
	
	public void testMascotaComerAburridaMenos80MIn() {
		tamagotchi.setEstadoMascota(getAburrida(50));
		tamagotchi.comer();
		this.assertTrue(tamagotchi.getEstadoMascota().getClass() == Aburrida.class);
	}
	
	public void testMascotaComerHambrienta() {
		tamagotchi.setEstadoMascota(getHabrienta());
		tamagotchi.comer();
		this.assertTrue(tamagotchi.getEstadoMascota().getClass() == Contenta.class);
		
	}
	
	public void testMascotaJugarContenta() {
		tamagotchi.setEstadoMascota(getContenta());
		tamagotchi.jugar();
		this.assertTrue(tamagotchi.getNivel() == 3);
	}
	
	public void testMascotaJugarAburrida() {
		tamagotchi.setEstadoMascota(getAburrida(5));
		tamagotchi.jugar();
		this.assertTrue(tamagotchi.getEstadoMascota().getClass() == Contenta.class);
	}
	
	public void testMascotaJugarHambrienta() {
		tamagotchi.setEstadoMascota(getHabrienta());
		tamagotchi.jugar();
		this.assertTrue(tamagotchi.getEstadoMascota().getClass() == Hambrienta.class);
	}
	
	private Estado getContenta() {
		return new Contenta();
	}

	private Estado getHabrienta() {
		Hambrienta unaHambrienta  = new Hambrienta(); 
		return unaHambrienta;
	}

	private Estado getAburrida(Integer cantidad) {
		Aburrida unAburrida = new Aburrida();
		unAburrida.setCantidadMinutos(cantidad);
		return unAburrida;
	}
}