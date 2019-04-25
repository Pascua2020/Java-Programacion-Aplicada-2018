
public class Neo implements Mensajero{
	
	private Destino elDestino;
	
	private Paquete elPaquete;
	
	public boolean hacerLlamada() {
		return true;
	}
	
	public int getPeso() {
		return 0;
	}
	
	
	public boolean entregarPaquete(Destino d,Paquete p) {
		if(d.puedeEntrar(0, this)==true && p.isPago()==true)
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

	

}
