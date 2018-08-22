package ec.edu.upse.facsistel.ia.lejos;

public abstract class Accion {

	protected int costo;
	
	public Accion(int costo)
	{
		this.costo = costo; 
	}
	
	public abstract Estado ejecutar(Estado e);
	
}
