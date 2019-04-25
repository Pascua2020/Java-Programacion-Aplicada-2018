public class Ave {
	
	private double energia;
	
	private String ubicacion;
	
	public void setEnergia(double cantEnergia) {
		energia = cantEnergia;
	}
	
	public void setUbicacion(String unaUbicacion) {
		ubicacion = unaUbicacion;
	}
		
	public double getEnergia() {
		return energia;
	}
	
	public String getUbicacion() {
		return ubicacion;
	}
	
	public void comer(double cantGramos) {
		energia = energia + cantGramos;
	}
	
	public void volar(double cantMetros) {
		energia = energia - (10 + cantMetros/2);
	}
	
	public boolean estaFeliz() {
		return energia > 100;
	}
}