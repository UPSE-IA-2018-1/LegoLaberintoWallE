package ec.edu.upse.facsistel.ia.laberinto;

import ec.edu.upse.facsistel.ia.lejos.Estado;

public class AccionRotarIzquierda extends AccionLaberinto {

	public AccionRotarIzquierda(int costo) {
		super(costo);
		// TODO Auto-generated constructor stub
	}
	
	public AccionRotarIzquierda() {
		super(3);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Estado ejecutar(Estado e) {
		super.abrirPuertos();
		super.motorDer.rotate(-90, true);
		super.motorIzq.rotate(90, true);
		EstadoLaberinto estadoAntiguo = (EstadoLaberinto) e;
		EstadoLaberinto nuevoEstado = 
				new EstadoLaberinto(estadoAntiguo.getPosicionX(), 
						estadoAntiguo.getPosicionY(), 
						rotarOrientacion(estadoAntiguo.getO()), 
						estadoAntiguo);
		return nuevoEstado;
	}
	
	@Override
	protected Orientacion rotarOrientacion(Orientacion o) {
		Orientacion orientacionNueva = null;
		switch (o) {
		case NORTE:
			orientacionNueva = Orientacion.OESTE;
			break;
		case SUR:
			orientacionNueva = Orientacion.ESTE;
			break;
		case ESTE:
			orientacionNueva = Orientacion.NORTE;
			break;
		case OESTE:
			orientacionNueva = Orientacion.SUR;
			break;
		}
		return orientacionNueva;
	}

}
