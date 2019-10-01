package Logica.Aliados;

import Logica.General.Aliado;
import Logica.General.Visitors.Visitor;

/**
 * Modela al aliado Pistol soldier.
 * @author Comisión 25 (FERNÁNDEZ, LATOUQUETTE, LÓPEZ)
 * @version 1.0
 */
public class SniperSoldier extends Aliado {
	protected static final int MAX_VIDA = 50;
	
	/**
	 * Constructor
	 * @param x Posición en el eje x del aliado
	 * @param y Posición en el eje y del aliado
	 */
	public SniperSoldier(int x, int y) {
		// atributos físicos
		this.tamano_x = 1;
		this.tamano_y = 1;
		this.posicion_x = x;
		this.posicion_y = y;
		this.textura = "";
				
		//atributos lógicos
		this.nombre = "Sniper";
		this.alcance_ataque = 10;
		this.fuerza_ataque = 60;
		this.precio = 125;
		this.velocidad_ataque = 7;
		this.vida = MAX_VIDA;		
	}

	//@Override
	public void accept(Visitor v) {
		// TODO Auto-generated method stub
		
	}
}
