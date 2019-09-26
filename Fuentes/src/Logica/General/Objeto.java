package Logica.General;

import Logica.General.Visitors.ConcreteVisitor;

/**
 * Modela todos los objetos (con vida, con tiempo y de mapa) del juego.
 * @author Comisión 25 (FERNÁNDEZ, LATOUQUETTE, LÓPEZ)
 * @version 1.0
 */
public abstract class Objeto extends Entidad {
	
	/**
	 * Se invoca cuando el objeto es atacado.
	 */
	public abstract void serAtacado(int ataque);
	
	/**
	 * Devuelve verdadero si el objeto sigue vivo, falso en caso contrario
	 * @return Verdadero si el objeto sigue vivo, falso en caso contrario
	 */
	public abstract boolean sigoVivo();
	
	public void accept(ConcreteVisitor v) {
		v.visitObjeto(this);
	}
	
}
