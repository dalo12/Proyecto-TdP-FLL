package Logica.General;

import Logica.General.Visitors.Visitor;

/**
 * Modela todos los disparos a realizarse en el juego.
 * @author Comisión 25 (FERRANTE, LATOUQUETTE, LÓPEZ)
 * @version 1.0
 */
public class Disparo extends GameObject {

	protected int dano, velocidad;
	
	/**
	 * Constructor
	 * @param n Nivel donde se produce el disparo
	 */
	public Disparo(int x, int y, Nivel n) {
		super(n);
		posicionX = x;
		posicionY = y;
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
	public void avanzar() {
		//TODO implementar
	}

	@Override
	public void accionar() {
		// TODO Auto-generated method stub
		
	}

	/**
	 * Acepta un visitor.
	 * @param v Un visitor.
	 */
	@Override
	public void accept(Visitor v) {
		v.visitDisparo(this);
	}
	
	
}
