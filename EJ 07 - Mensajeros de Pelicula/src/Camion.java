
public class Camion implements Vehiculo{
	
	private int numAcoplados;

	public void setNumAcoplados(int numAcoplados) {
		this.numAcoplados = numAcoplados;
	}

	public int calcularPeso(int p) {
		return p+(500*numAcoplados);
	}
}
