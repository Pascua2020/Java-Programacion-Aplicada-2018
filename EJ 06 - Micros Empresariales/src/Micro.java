import java.util.ArrayList;

public class Micro {
       private int volumen;
	private int cantidadSentados;
	private int cantidadParados;
	private ArrayList<Persona> pasajeros = new ArrayList<Persona>();
	
	public boolean sePuedeSubir(Persona unaPersona) {
		return this.hayLugar() && unaPersona.seQuiereSubir(this);
	}
	
	public boolean hayLugar() {
		return this.capacidadTotal() > this.cantidadDePasajeros();
	}
	
	public int capacidadTotal() {		
		return cantidadSentados + cantidadParados;
	}
	
	public int cantidadDePasajeros() {
		return pasajeros.size();
	}
	
	public boolean puedeViajarSentado() {
		return cantidadSentados > this.cantidadDePasajeros();
	}
	
	public int cantidadDisponible() {
		return this.capacidadTotal() - this.cantidadDePasajeros();
	}
	
	public int getVolumen() {
		return volumen;
	}
	
	public void setVolumen(int unVolumen) {
		volumen = unVolumen;
	}
	
	public void setCantidadSentados(int sentados) {
		cantidadSentados =sentados;
	}
	
	public void setCantidadParados(int parados) {
		cantidadParados = parados;
	}
	
	public void subirA(Persona unaPersona) {
		if(this.sePuedeSubir(unaPersona))
		{
			pasajeros.add(unaPersona);
		}
	}
	
	public void bajarAPersona(Persona unaPersona) {
		pasajeros.remove(unaPersona);
	}
}