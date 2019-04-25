public class Claustrofobico implements Personalidad{

	public boolean quiereSubirA(Micro unMicro) {
		return unMicro.getVolumen() > 120;
	}
}