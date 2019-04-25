public class Fiaca implements Personalidad{

	public boolean quiereSubirA(Micro unMicro) {
		return unMicro.puedeViajarSentado();
	}
}