package ec.edu.upse.facsistel.ia.laberinto;

import ec.edu.upse.facsistel.ia.lejos.Accion;
import lejos.hardware.lcd.LCD;
import lejos.utility.Delay;

public class LejosTest1 {

	public static void main(String[] args) {
		
		ProblemaLaberinto pLaberinto = new ProblemaLaberinto();
		EstadoLaberinto eLaberinto = null;
		do{
		 AlgoritmoBusquedaLaberinto abl = new AlgoritmoBusquedaLaberinto();
		 Accion a = abl.buscarSiguienteAccion(pLaberinto);
		 eLaberinto = (EstadoLaberinto) a.ejecutar(eLaberinto);
		 }while(!pLaberinto.esMeta(eLaberinto));
	}
	
}
