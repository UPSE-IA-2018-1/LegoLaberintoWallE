package ec.edu.upse.facsistel.ia.lejos;

public abstract class Estado {
	protected int id;
	protected Estado estadoPadre;
	
	public Estado(int id, Estado estadoPadre)
	{
		this.id = id;
		this.estadoPadre = estadoPadre;
	}

	public Estado getEstadoPadre() {
		return estadoPadre;
	}

	public void setEstadoPadre(Estado estadoPadre) {
		this.estadoPadre = estadoPadre;
	}

	public int getId() {
		return id;
	}
	
	
}
