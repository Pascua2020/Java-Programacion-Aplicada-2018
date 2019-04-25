public class Moderado implements Personalidad {
		
	private int cantMinimaLugaresLibres; 
	
	public boolean quiereSubirA(Micro unMicro) {		
		return cantMinimaLugaresLibres <= unMicro.cantidadDisponible();
	}
	
	public void setCantMinimaLugaresLibres(int cantLugares) {
		cantMinimaLugaresLibres = cantLugares;
	}
}