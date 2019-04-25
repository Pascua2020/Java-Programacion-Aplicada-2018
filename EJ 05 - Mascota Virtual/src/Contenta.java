public class Contenta implements Estado {

	@Override
	public void comer(Mascota unaMascota) {
		unaMascota.incrementarNivel(1);
	}

	@Override
	public void jugar(Mascota unaMascota) {
		unaMascota.incrementarNivel(2);
	}

	public boolean puedeJugar() {
		return true;
	}
}