package Logica.General.Disparo;

import Logica.General.Visitor;

/**
 * Modela todos los disparos a realizarse en el juego.
 * @author Comisión 25 (FERRANTE, LATOUQUETTE, LÓPEZ)
 * @version 1.0
 */
public abstract class Disparo extends Visitor {
	protected int dano, velocidad, alcance, posicion_x, posicion_y;
	protected String textura;
	
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
	
	
}
