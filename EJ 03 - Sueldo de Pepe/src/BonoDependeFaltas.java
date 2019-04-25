public class BonoDependeFaltas implements Bono {

	public double monto(int faltas) {
		if(faltas == 0) {
			return 100;
		}
		if(faltas == 1) {
			return 50;
		}
		return 0;
	}
}