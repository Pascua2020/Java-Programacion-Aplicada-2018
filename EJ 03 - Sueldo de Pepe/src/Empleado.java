public class Empleado {
	private Categoria categoria;
	private int cantFaltas;
	private Bono bonoPresentismo;	
	
	public void setCantFaltas(int faltas) {
		cantFaltas = faltas;
	}
	
	public void setBonoPresentismo(Bono unBono) {
		bonoPresentismo = unBono;
	}
	
	public void setCategoria(Categoria unaCategoria) {
		categoria = unaCategoria;
	}
	
	public double sueldo() {
		return categoria.getNeto() + bonoPresentismo.monto(cantFaltas);
	};
}