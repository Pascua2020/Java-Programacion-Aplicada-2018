public class Gato {

	private double energia;
	private double posicion;
	
	public void setEnergia(double unaEnergia) {
		energia = unaEnergia;
	}
	
	public boolean puedeAtraparA(Raton unRaton) {
		return this.velocidad()> unRaton.velocidad();
	}
	
	public double velocidad() {
		return 5 + (energia / 10);
	}
	
	public double getEnergia() {
		return energia;		
	}

	public void correrA(Raton unRaton) {
		energia =  energia - (0.5*this.velocidad()*this.distanciaA(unRaton));
		posicion = unRaton.getPosicion();
	}
	
	public double distanciaA(Raton unRaton) {
		return Math.abs(unRaton.getPosicion() - posicion);
	}
	
	public void setPosicion(double unaPosicion) {
		posicion = unaPosicion;
	}
	
	
	public double getPosicion() {
		return posicion;
	}

}