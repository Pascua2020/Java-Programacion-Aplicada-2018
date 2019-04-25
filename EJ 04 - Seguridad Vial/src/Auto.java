public class Auto implements Vehiculo{
	
	private boolean tieneRuedaAuxilio; 
	private int plusVelocidad;
	
	public void setTieneRuedaAuxilio(boolean tieneRuedaAux) {
		tieneRuedaAuxilio = tieneRuedaAux;
	}
	
	public void setPlusVelocidad(int plusVelo) {
		plusVelocidad = plusVelo;
	}
	
	public boolean esSeguro() {
		return tieneRuedaAuxilio && (this.velocidad() <= 140);
	}

	public int velocidad() {
		return 100 + plusVelocidad;
	}
}
