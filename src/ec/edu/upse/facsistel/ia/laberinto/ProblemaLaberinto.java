package ec.edu.upse.facsistel.ia.laberinto;

import ec.edu.upse.facsistel.ia.lejos.Estado;
import ec.edu.upse.facsistel.ia.lejos.ProblemaBusqueda;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.internal.ev3.EV3Port;

public class ProblemaLaberinto extends ProblemaBusqueda {

	
	
	public ProblemaLaberinto()
	{
		super.estadoInicial = new EstadoLaberinto(0, 0, Orientacion.NORTE, null);
		
		AccionAvanzar avanzar = new AccionAvanzar();
		AccionRotarDerecha rotarDerecha = new AccionRotarDerecha();
		AccionRotarIzquierda rotarIzquierda = new AccionRotarIzquierda();
		super.listaAcciones.add(avanzar);
		super.listaAcciones.add(rotarIzquierda);
		super.listaAcciones.add(rotarDerecha);
	}
	
	@Override
	public boolean esMeta(Estado e) {
		EV3ColorSensor sensorColor = new EV3ColorSensor(SensorPort.S2);
		if(sensorColor.getColorID()==5)
		{
			sensorColor.close();
			return true;
		}
		sensorColor.close();
		return false;
	}

}
