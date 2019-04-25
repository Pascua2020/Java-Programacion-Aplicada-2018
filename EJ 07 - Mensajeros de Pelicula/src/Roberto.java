
public class Roberto implements Mensajero{

	private Destino elDestino;
	
	private Paquete elPaquete;
	
	private int peso;
	
	private Vehiculo viajaEn;
	
	public boolean hacerLlamada() {
		return false;
	}
	
	
	public boolean entregarPaquete(Destino d,Paquete p) {
		if(d.puedeEntrar(peso, this)==true && p.isPago()==true)
			return true;
		else
			return false;
	}

	public void setElDestino(Destino elDestino) {
		this.elDestino = elDestino;
	}

	public void setElPaquete(Paquete elPaquete) {
		this.elPaquete = elPaquete;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public void setViajaEn(Vehiculo viajaEn) {
		this.viajaEn = viajaEn;
	}

	
}
