public class Persona {
  private Personalidad personalidad;
  
  public boolean seQuiereSubir(Micro unMicro) {
	  return personalidad.quiereSubirA(unMicro);
  }
  
  public void setPersonalidad(Personalidad unaPersonalidad) {
	  personalidad = unaPersonalidad;
  }
}