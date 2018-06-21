package proa.abstarctFactory;

public class DesingFactory implements ServicioFactory{
	@Override
	public ServicioInformatico crearServicio() {
		return new ServicioDesing();
	}
}
