public class Aburrida implements Estado {

	private Integer cantidadMinutos;

	public Integer getCantidadMinutos() {
		return cantidadMinutos;
	}

	public void setCantidadMinutos(Integer cantidadMinutos) {
		this.cantidadMinutos = cantidadMinutos;
	}

	@Override
	public void comer(Mascota unaMascota) {
		if (cantidadMinutos > 80) {
			unaMascota.poneteContenta();
		}

	}

	@Override
	public void jugar(Mascota unaMascota) {
		unaMascota.poneteContenta();
		
	}
	
	public boolean  puedeJugar() {
		return true;
	}

	}