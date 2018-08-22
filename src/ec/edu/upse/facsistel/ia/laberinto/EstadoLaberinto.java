package ec.edu.upse.facsistel.ia.laberinto;

import ec.edu.upse.facsistel.ia.lejos.Estado;

public class EstadoLaberinto extends Estado {

	private int posicionX;
	private int posicionY;
	private Orientacion o;
	
	private boolean paredDelante = false;
	private boolean paredDerecha = false;
	private boolean paredIzquierda = false;
	
	public EstadoLaberinto(int posicionX, int posicionY, Orientacion o, Estado estadoPadre) {
		super(estadoPadre.getId()+1, estadoPadre);
		this.posicionX = posicionX;
		this.posicionY = posicionY;
		this.o = o;
	}

	public int getPosicionX() {
		return posicionX;
	}

	public void setPosicionX(int posicionX) {
		this.posicionX = posicionX;
	}

	public int getPosicionY() {
		return posicionY;
	}

	public void setPosicionY(int posicionY) {
		this.posicionY = posicionY;
	}

	public Orientacion getO() {
		return o;
	}

	public void setO(Orientacion o) {
		this.o = o;
	}

	public boolean isParedDelante() {
		return paredDelante;
	}

	public boolean isParedDerecha() {
		return paredDerecha;
	}

	public boolean isParedIzquierda() {
		return paredIzquierda;
	}
	
	
	
	
	
}
