package ec.edu.upse.facsistel.ia.laberinto;

import ec.edu.upse.facsistel.ia.lejos.Estado;

public class AccionAvanzar extends AccionLaberinto {

	public AccionAvanzar(int costo) {
		super(costo);
		// TODO Auto-generated constructor stub
	}
	
	public AccionAvanzar() {
		super(5);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Estado ejecutar(Estado e) {
		super.abrirPuertos();
		super.motorDer.rotate(-90, true);
		super.motorIzq.rotate(-90, true);
		EstadoLaberinto estadoAntiguo = (EstadoLaberinto) e;
		EstadoLaberinto nuevoEstado = 
				new EstadoLaberinto(
						moverEjeX(estadoAntiguo.getPosicionX(), estadoAntiguo.getO()),
						moverEjeY(estadoAntiguo.getPosicionY(), estadoAntiguo.getO()),
						estadoAntiguo.getO(),
						estadoAntiguo);
		return nuevoEstado;
	}
	
	@Override
	protected Orientacion rotarOrientacion(Orientacion o) {
		return o;
	}
	
	private int moverEjeX(int x, Orientacion o)
	{
		int nuevaX = 0;
		switch (o) {
		case NORTE:
			nuevaX = x;
			break;
		case SUR:
			nuevaX = x;
			break;
		case ESTE:
			nuevaX = x++;
			break;
		case OESTE:
			nuevaX = x--;
			break;

		default:
			break;
		}
		return nuevaX;
	}

	private int moverEjeY(int y, Orientacion o)
	{
		int nuevaY = 0;
		switch (o) {
		case NORTE:
			nuevaY = y++;
			break;
		case SUR:
			nuevaY = y--;
			break;
		case ESTE:
			nuevaY = y;
			break;
		case OESTE:
			nuevaY = y;
			break;
		default:
			break;
		}
		return nuevaY;
	}
	
}
