package ec.edu.upse.facsistel.ia.laberinto;

import ec.edu.upse.facsistel.ia.lejos.Accion;
import ec.edu.upse.facsistel.ia.lejos.Estado;
import lejos.hardware.motor.EV3LargeRegulatedMotor;

public abstract class AccionLaberinto extends Accion {

	public AccionLaberinto(int costo) {
		super(costo);
		// TODO Auto-generated constructor stub
	}

	protected EV3LargeRegulatedMotor motorIzq;
	protected EV3LargeRegulatedMotor motorDer;
	
	@Override
	public Estado ejecutar(Estado e) {
		//Instanciar Motores
		//CErrar Puerto
		return null;
	}
	
	protected void abrirPuertos()
	{
		
	}
	
	protected void cerrarPuertos()
	{
		
	}
	
	protected abstract Orientacion rotarOrientacion(Orientacion o);

}
