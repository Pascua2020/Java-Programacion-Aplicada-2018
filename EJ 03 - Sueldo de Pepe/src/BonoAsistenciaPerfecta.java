public class BonoAsistenciaPerfecta implements Bono {

	public double monto(int faltas) {
		if(faltas == 0) {
			return 1000;
		}
		return 0;
	}
}