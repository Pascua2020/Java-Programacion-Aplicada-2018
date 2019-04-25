public class Raton {
	private double peso;
	private double posicion;
	
	public void setPeso(double unPeso) {
		peso = unPeso;
	}
	
	public double velocidad() {
		return 10 - peso;
	}
	
	public double getPosicion() {
		return posicion;
	}
	
	public void setPosicion(double unaPosicion) {
		posicion = unaPosicion;
	}
}