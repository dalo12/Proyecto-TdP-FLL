package Logica.Aliados;

import Logica.General.Aliado;
import Logica.General.Enemigo;
import Logica.General.Personaje;

/**
 * Modela al aliado Pistol soldier.
 * @author Comisión 25 (FERNÁNDEZ, LATOUQUETTE, LÓPEZ)
 * @version 1.0
 */
public class PistolSoldier extends Aliado {
	protected static final int MAX_VIDA = 100;
	
	/**
	 * Constructor
	 * @param x Posición en el eje x del aliado
	 * @param y Posición en el eje y del aliado
	 */
	public PistolSoldier(int x, int y) {
		// atributos físicos
		this.tamano_x = 1;
		this.tamano_y = 1;
		this.posicion_x = x;
		this.posicion_y = y;
		this.textura = "pistol-soldier-1.gif";
				
		//atributos lógicos
		this.alcance_ataque = 2;
		this.fuerza_ataque = 10;
		this.precio = 25;
		this.velocidad_ataque = 1;
		this.vida = MAX_VIDA;		
	}
}
