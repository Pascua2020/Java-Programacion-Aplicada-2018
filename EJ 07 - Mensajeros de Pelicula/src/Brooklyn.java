
public class Brooklyn implements Destino{
	
	public boolean puedeEntrar(int a,Mensajero m) {
		if(m.getPeso()<1000)
			return true;
		else
			return false;
	}

}