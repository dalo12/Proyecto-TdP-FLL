package Logica.Objetos;

import Logica.General.Visitors.Visitor;

/**
 * Modela a la cerca antitanque.
 * @author Comisión 25 (FERNÁNDEZ, LATOUQUETTE, LÓPEZ)
 * @version 1.0
 */
public class CercaAntiTanque extends ObjetoVida {
	/**
	 * Constructor
	 * @param x Posición x en el mapa
	 * @param y Posición y en el mapa
	 */
	public CercaAntiTanque(int x, int y) {
		//atributos físicos
		this.posicionX = x;
		this.posicionY = y;
		this.tamanoX = 1;
		this.tamanoY = 2;
		this.textura = "";
		
		//atributos lógicos
		this.nombre = "Cerca Anti-tanque";
		this.vida = 100;
	}
	
	@Override
	public void serAtacado(int ataque) {
		vida -= ataque;
	}

	@Override
	public boolean sigoVivo() {
		return vida > 0;
	}

	@Override
	public void accept(Visitor v) {
		// TODO Auto-generated method stub
		
	}

}
