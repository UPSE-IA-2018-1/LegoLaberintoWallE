package ec.edu.upse.facsistel.ia.lejos;

import java.util.List;

public abstract class ProblemaBusqueda {
	protected Estado estadoInicial;
	protected int costoRuta;
	protected List<Accion> listaAcciones;
	//private Estado estadoMeta;
	
	public abstract boolean esMeta(Estado e);
}
