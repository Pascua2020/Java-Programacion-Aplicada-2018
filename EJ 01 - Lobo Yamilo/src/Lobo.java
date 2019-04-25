public class Lobo {

	private double calorias;
		
	public double calorias() {
		return calorias;
	}
	
	public void setCalorias(double cantCalorias) {
		calorias = cantCalorias;
	}
	
	public void comer(Chancho animal) {
		calorias = calorias + (animal.peso()/10);
	}
	
	public Boolean estaGordo() {
		return calorias > 200;
	}
	
	public Boolean estaSaludable() {
		return calorias > 20 && calorias < 150;
	}
	
	public void correr(double tiempo) {
		calorias = calorias - (2*tiempo);
	}
}
