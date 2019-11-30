package Logica.General;

import Logica.General.Visitors.Visitor;

/**
 * Modela todos los disparos a realizarse en el juego.
 * @author Comisión 25 (FERRANTE, LATOUQUETTE, LÓPEZ)
 * @version 1.0
 */
public abstract class Disparo extends GameObject {

	protected int dano, velocidad;
	protected int x_inicial, y_inicial, alcance;
	protected Nivel nivel;
	
	/**
	 * Constructor
	 * @param x Posición x desde donde se efectúa el disparo
	 * @param y Posición y desde donde se efectúa el disparo
	 * @param alcance Alcance del disparo
	 * @param dano Daño que ejerce el disparo
	 * @param velocidad Velocidad a la que viaja el disparo
	 * @param n Nivel donde se produce el disparo
	 */
	protected Disparo(int x, int y, int alcance, int dano, int velocidad, Nivel n) {
		super(n);
		posicionX = x;
		posicionY = y;
		x_inicial = x;
		y_inicial = y;
		this.alcance = alcance;
		this.dano = dano;
		this.velocidad = velocidad;
	}
	
	/**
	 * Devuelve el daño que provoca el disparo
	 * @return El daño que provoca el disparo
	 */
	public int getDano() {
		return dano;
	}
	
	/**
	 * Devuelve la velocidad del disparo
	 * @return La velocidad del disparo
	 */
	public int getVelocidad() {
		return velocidad;
	}
	
	/**
	 * Hace que el disparo avance
	 */
	public abstract void avanzar();
	

	@Override
	public abstract void accionar();

	/**
	 * Acepta un visitor.
	 * @param v Un visitor.
	 */
	@Override
	public void accept(Visitor v) {
		v.visitDisparo(this);
	}
	
	@Override
	public void morir() {
		nivel.eliminarObjeto(this);
		grafica.morir();
	}

	/**
	 * @return the nivel
	 */
	public Nivel getNivel() {
		return nivel;
	}	
	
	@Override
	public boolean invade(){
		return false;
	}
}
