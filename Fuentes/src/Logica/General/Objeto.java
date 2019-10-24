package Logica.General;

import Logica.General.Visitors.Visitor;

/**
 * Modela todos los objetos (con vida, con tiempo y de mapa) del juego.
 * @author Comisión 25 (FERRANTE, LATOUQUETTE, LÓPEZ)
 * @version 1.0
 */
public abstract class Objeto extends GameObject {
	
	protected Objeto(Nivel n) {
		super(n);
	}
	
	protected int vida;
	
	/**
	 * Asigna la vida de este objeto.
	 * @param v Un entero que representa el valor de vida a asignar.
	 */
	public void setVida(int v) {
		vida = v;
	}
	
	/**
	 * Devuelve la vida actual del objeto.
	 * @return La vida actual del objeto.
	 */
	public int getVida() {
		return vida;
	}
	
	/**
	 * Acepta un visitor.
	 */
	public void accept(Visitor v) {
		v.visitObjeto(this);
	}

	@Override
	public void accionar() {
		// TODO Auto-generated method stub
		
	}
	
}
