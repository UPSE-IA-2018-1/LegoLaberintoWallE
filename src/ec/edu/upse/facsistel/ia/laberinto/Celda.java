package ec.edu.upse.facsistel.ia.laberinto;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Celda {
	private int x;
	private int y;
	private boolean paredDelante = false;
	private boolean paredDerecha = false;
	private boolean paredIzquierda = false;
	private boolean paredAtras = false;
	
	public Celda(int x, int y, boolean paredDelante, boolean paredDerecha, boolean paredIzquierda)
	{
		this.x = x;
		this.y = y;
		this.paredAtras = false;
		this.paredDelante = paredDelante;
		this.paredDerecha = paredDerecha;
		this.paredIzquierda = paredIzquierda;
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public boolean isParedDelante() {
		return paredDelante;
	}
	public void setParedDelante(boolean paredDelante) {
		this.paredDelante = paredDelante;
	}
	public boolean isParedDerecha() {
		return paredDerecha;
	}
	public void setParedDerecha(boolean paredDerecha) {
		this.paredDerecha = paredDerecha;
	}
	public boolean isParedIzquierda() {
		return paredIzquierda;
	}
	public void setParedIzquierda(boolean paredIzquierda) {
		this.paredIzquierda = paredIzquierda;
	}
	public boolean isParedAtras() {
		return paredAtras;
	}
	public void setParedAtras(boolean paredAtras) {
		this.paredAtras = paredAtras;
	}

	@Override
	public String toString() {
		String paredAImprimir = getParedParaImpresion();
		System.out.print(paredAImprimir);
		return paredAImprimir;
	}
	
	public String getParedParaImpresion()
	{
		String celda = new String();;
		if(paredIzquierda)
		{
			celda = "|";
		}
		if(paredDelante)
		{
			celda = celda + "‾";
		}
		if(paredDerecha)
		{
			celda = celda + "|";
		}
		if(paredAtras)
		{
			celda = celda + "_";
		}
		return celda;
	}
	
	
}
