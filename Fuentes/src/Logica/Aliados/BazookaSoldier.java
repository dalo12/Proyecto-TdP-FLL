package Logica.Aliados;

import Logica.General.Aliado;
import Logica.General.Enemigo;
import Logica.General.Personaje;

/**
 * Modela al aliado Pistol soldier.
 * @author Comisión 25 (FERNÁNDEZ, LATOUQUETTE, LÓPEZ)
 * @version 1.0
 */
public class BazookaSoldier extends Aliado {
	protected static final int MAX_VIDA = 100;
	
	/**
	 * Constructor
	 * @param x Posición en el eje x del aliado
	 * @param y Posición en el eje y del aliado
	 */
	public BazookaSoldier(int x, int y) {
		// atributos físicos
		this.tamano_x = 1;
		this.tamano_y = 1;
		this.posicion_x = x;
		this.posicion_y = y;
		this.textura = "";
				
		//atributos lógicos
		this.alcance_ataque = 7;
		this.fuerza_ataque = 125;
		this.precio = 175;
		this.velocidad_ataque = 10;
		this.vida = MAX_VIDA;		
	}
}
