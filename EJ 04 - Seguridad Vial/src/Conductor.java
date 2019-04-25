public class Conductor {
	
	private Vehiculo vehiculo;
	private boolean tieneRegistro;
	
	public boolean esSeguro() {
		return tieneRegistro && vehiculo.esSeguro();
	}
	
	public void setVehiculo(Vehiculo unVehiculo) {
		vehiculo = unVehiculo;
	}
	
	public void setTieneRegistro(boolean siTieneRegistro){
		tieneRegistro = siTieneRegistro;
	}
}