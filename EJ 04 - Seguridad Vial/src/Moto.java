public class Moto implements Vehiculo {
    private int velocidad;
    private int cantEspejos;
    
	public boolean esSeguro() {
		return velocidad <= 160 && cantEspejos >= 2;
	}
	
	public void setVelocidad(int cantVelocidad) {
		velocidad = cantVelocidad;
	}
	
	public void setCantEspejos(int espejos) {
		cantEspejos = espejos;
	}
}