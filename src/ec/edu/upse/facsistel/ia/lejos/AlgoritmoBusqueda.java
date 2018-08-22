package ec.edu.upse.facsistel.ia.lejos;

import java.util.List;

public abstract class AlgoritmoBusqueda {

	//Para ciclo abierto
	public abstract List<Accion> buscar(ProblemaBusqueda p);
	
	//Para ciclo cerrado
	public abstract Accion buscarSiguienteAccion(ProblemaBusqueda p);
	
}
