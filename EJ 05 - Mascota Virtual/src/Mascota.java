
public class Mascota {

	private Integer nivel;
	private Estado estadoMascota;

	public Integer getNivel() {
		return nivel;
	}

	public void setNivel(Integer nivel) {
		this.nivel = nivel;
	}

	public Estado getEstadoMascota() {
		return estadoMascota;
	}

	public void setEstadoMascota(Estado estadoMascota) {
		this.estadoMascota = estadoMascota;
	}

	public void comer() {
		estadoMascota.comer(this);
	}

	public void incrementarNivel(Integer cantidad) {
		nivel = nivel + cantidad;
	}

	public void poneteContenta() {
		this.setEstadoMascota(new Contenta());
	}

	public void jugar() {
		estadoMascota.jugar(this);
	}
	
	public boolean puedeJugar() {
		return estadoMascota.puedeJugar();
	}
}