package ec.edu.upse.facsistel.ia.laberinto;

import java.util.ArrayList;
import java.util.List;

public class MapaLaberinto {

	
	List<Celda> mapa = new ArrayList<Celda>();
	
	public Celda buscarCelda(int x, int y)
	{
		for(Celda c: mapa)
		{
			if(c.getX()==x && c.getY()==y)
			{return c;}
		}
		return null;
	}
	
	public void transformarEstadoMapaOrientacionNorte(EstadoLaberinto e)
	{
		Celda celdaExistente = buscarCelda(e.getPosicionX(), e.getPosicionY());
		switch (e.getO()) {
		case NORTE:
			
			if(celdaExistente==null)
			{
			Celda c1 = new Celda(e.getPosicionX(), e.getPosicionY(), e.isParedDelante(), 
					e.isParedDerecha(), e.isParedIzquierda());
			mapa.add(c1);
			}else {
				Celda c1 = new Celda(e.getPosicionX(), e.getPosicionY(), e.isParedDelante(), 
						e.isParedDerecha(), e.isParedIzquierda());
				c1.setParedAtras(celdaExistente.isParedAtras());
				mapa.add(c1);
					
			}
			break;
		case SUR:
			if(celdaExistente==null)
			{

				Celda c2 = new Celda(e.getPosicionX(), e.getPosicionY(),
						false,
						e.isParedIzquierda(), e.isParedIzquierda());
				c2.setParedAtras(e.isParedDelante());
				mapa.add(c2);
			}else {
				Celda c2 = new Celda(e.getPosicionX(), e.getPosicionY(),
						celdaExistente.isParedDelante(),
						e.isParedIzquierda(), e.isParedIzquierda());
				c2.setParedAtras(e.isParedDelante());
				mapa.add(c2);
					
			}
			
			break;
		case ESTE:
			
			break;
		case OESTE:
			
			break;
		default:
			break;
		}
	}
	
	public void imprimirMapa()
	{
		int limiteSuperior = buscarLimiteSuperior();
		int limiteIzquierdo = buscarLimiteIzquierdo();
		int limiteInferior = buscarLimiteInferior();
		int limiteDerecho = buscarLimiteDerecho();
		
		int xActual = limiteIzquierdo;
		int yActual = limiteSuperior;
		do	
		{
			Celda celdaImprimir = buscarCelda(xActual, yActual);
			if(celdaImprimir!=null)
			{
				System.out.print(celdaImprimir);
			}else {
				System.out.print("?");
			}
					if(yActual == limiteDerecho)
						System.out.print("\n");
			
		}while(xActual == limiteDerecho && yActual == limiteInferior);
		
	}
	
	private int buscarLimiteIzquierdo()
	{
		int limiteIzq = 0;
		for(Celda c: mapa)
		{
			if(c.getX()<limiteIzq)
			{
				limiteIzq = c.getX();
			}
		}
		return limiteIzq;
	}
	
	private int buscarLimiteDerecho()
	{
		int limiteDer = 0;
		for(Celda c: mapa)
		{
			if(c.getX()>limiteDer)
			{
				limiteDer = c.getX();
			}
		}
		return limiteDer;
	}
	
	private int buscarLimiteSuperior()
	{
		int limiteSuperior = 0;
		for(Celda c: mapa)
		{
			if(c.getY()>limiteSuperior)
			{
				limiteSuperior = c.getY();
			}
		}
		return limiteSuperior;
	}
	
	private int buscarLimiteInferior()
	{
		int limiteInferior = 0;
		for(Celda c: mapa)
		{
			if(c.getY()<limiteInferior)
			{
				limiteInferior = c.getY();
			}
		}
		return limiteInferior;
	}
}
