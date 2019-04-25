import junit.framework.TestCase;

public class PersonaTest extends TestCase {

	private Empleado pepe = new Empleado();

	private Categoria gerente = new Categoria();
	private Categoria cadete = new Categoria();

	private Bono bonoNulo = new BonoNulo();
	private Bono bonoDependeFaltas = new BonoDependeFaltas();
	private Bono bonoAsistenciaPerfecta = new BonoAsistenciaPerfecta();
	
	public void setUp() {
		pepe.setCantFaltas(0);

		gerente.setNeto(10000);

		cadete.setNeto(15000);
	}
	
	public void testCadeteBonoNulo() {
		pepe.setCategoria(cadete);
		pepe.setCantFaltas(2);
		pepe.setBonoPresentismo(bonoAsistenciaPerfecta);
		assertTrue(pepe.sueldo() == 15000);
	}
	
	public void testCadeteBonoDependeFaltas() {
		pepe.setCategoria(cadete);
		pepe.setBonoPresentismo(bonoDependeFaltas);
		assertTrue(pepe.sueldo() == 15100);
	}
	
	public void testGerenteBonoNulo() {
		pepe.setCategoria(gerente);
		pepe.setCantFaltas(1);
		pepe.setBonoPresentismo(bonoNulo);
		assertTrue(pepe.sueldo() == 10000);
	}
	
	public void testGerenteBonoAsistenciaPerfecta() {
		pepe.setCategoria(gerente);
		pepe.setBonoPresentismo(bonoAsistenciaPerfecta);
		assertTrue(pepe.sueldo() == 11000);
	}
	
	public void testGerenteBonoDependeFaltas() {
		pepe.setCategoria(gerente);
		pepe.setCantFaltas(1);
		pepe.setBonoPresentismo(bonoDependeFaltas);
		assertTrue(pepe.sueldo()== 10050);
	}
	
	public void testCadeteBonoAsistenciaPerfecta() {
		pepe.setCategoria(cadete);
		pepe.setBonoPresentismo(bonoAsistenciaPerfecta);
		assertTrue(pepe.sueldo() == 16000);
	}
	
	
}