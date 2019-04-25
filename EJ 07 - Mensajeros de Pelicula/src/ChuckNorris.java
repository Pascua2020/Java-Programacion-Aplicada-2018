
public class ChuckNorris implements Mensajero{
	
	private Destino elDestino;
	
	private Paquete elPaquete;
	
	private int peso=900;
	
	public boolean hacerLlamada() {
		return true;
	}
	
	public boolean entregarPaquete(Destino d,Paquete p) {
		if(d.puedeEntrar(peso, this)==true && p.isPago()==true)
			return true;
		else
			return false;
	}
	
	// Getters y Setters
	
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

	

}
