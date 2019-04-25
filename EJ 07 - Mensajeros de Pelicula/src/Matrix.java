
public class Matrix implements Destino{
	
	public boolean puedeEntrar(int a,Mensajero m) {
		if(m.hacerLlamada()==true)
			return true;
		else
			return false;
	}

}
