package Logica.General;

import Logica.General.Visitors.Visitor;

/**
 * Modela todos los aliados (es decir, los personajes elegibles por el jugador) del juego.
 * @author Comisión 25 (FERRANTE, LATOUQUETTE, LÓPEZ)
 * @version 1.0
 */
public abstract class Aliado extends Personaje {
	
	protected int precio;
	protected int vidaMaxima;

	/**
	 * Devuelve el precio del aliado
	 * @return El precio del aliado
	 */
	public int getPrecio() {
		return precio;
	}

	/**
	 * Asigna un nuevo precio al aliado
	 * @param precio El nuevo precio a asignar
	 */
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	/**
	 * Se invoca al vender al aliado. En caso de que el aliado tenga toda su vida, al venderlo devuelve 
	 * todo su precio en monedas. En caso contrario, devuelve solamente la mitad de su precio.
	 * @return La cantidad de monedas correspondiente
	 */
	public int vender() {
		int valor = precio;
		if(vida < vidaMaxima) {
			valor = valor / 2;
		}
		return valor;
	}
	
	/**
	 * Ataca a un enemigo
	 * @param a El enemigo a atacar
	 */
	public void atacar(Enemigo o) {
		o.setVida(o.getVida() - fuerzaAtaque);
	}
	
	/**
	 * Acepta un visitor.
	 */
	public void accept(Visitor v) {
		v.visitAliado(this);
	}

	@Override
	public void accionar() {
		// TODO Auto-generated method stub
		
	}
}
