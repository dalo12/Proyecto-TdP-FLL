package Logica.General;

/**
 * Modela todos los disparos a realizarse en el juego.
 * @author Comisión 25 (FERNÁNDEZ, LATOUQUETTE, LÓPEZ)
 * @version 1.0
 */
public abstract class Disparo extends GameObject {
	protected int dano, velocidad;
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
	
	/**
	 * Impacta contra un objeto del juego y reduce su vida según corresponda
	 * @param o El objeto del juego contra el cuál impacta
	 */
	public void impactar(GameObject o) {}
}
