package Logica.General;

import Logica.General.Visitors.Visitor;

/**
 * Modela los powerups
 * @author Comisión 25 (FERRANTE, LATOUQUETTE, LÓPEZ)
 * @version 1.0
 */
public abstract class Premio extends GameObject {

	protected int duracionEnMapa;
	protected int duracionActivo;
	protected boolean activo;
	
	/**
	 * Constructor protegido
	 * @param n Nivel al que pertenece el premio
	 */
	protected Premio(Nivel n) {
		super(n);
	}
	
	public void activar() {
		//TODO debe recorrer todos los objetos del juego enviando su visitor.
	}

	@Override
	public void accionar() {
		// TODO Auto-generated method stub
		
	}

	/**
	 * Acepta un visitor.
	 */
	@Override
	public void accept(Visitor v) {
		v.visitPremio(this);
	}

	/**
	 * Aplica el efecto a contener sobre un enemigo
	 * @param enemigo Enemigo
	 */
	protected abstract void aplicarEfecto(Enemigo enemigo);
	
}
