public class Hambrienta implements Estado {

	@Override
	public void comer(Mascota unaMascota) {
		unaMascota.poneteContenta();
	}

	@Override
	public void jugar(Mascota unaMascota) {	}
	
	public boolean puedeJugar() {
		return false;
	}
}