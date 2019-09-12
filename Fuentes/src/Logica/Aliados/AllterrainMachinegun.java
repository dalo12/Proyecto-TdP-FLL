package Logica.Aliados;

import Logica.General.Aliado;
import Logica.General.Enemigo;
import Logica.General.Personaje;

/**
 * Modela al aliado Pistol soldier.
 * @author Comisión 25 (FERNÁNDEZ, LATOUQUETTE, LÓPEZ)
 * @version 1.0
 */
public class AllterrainMachinegun extends Aliado {
	protected static final int MAX_VIDA = 250;
	
	/**
	 * Constructor
	 * @param x Posición en el eje x del aliado
	 * @param y Posición en el eje y del aliado
	 */
	public AllterrainMachinegun(int x, int y) {
		// atributos físicos
		this.tamano_x = 1;
		this.tamano_y = 2;
		this.posicion_x = x;
		this.posicion_y = y;
		this.textura = "";
				
		//atributos lógicos
		this.alcance_ataque = 5;
		this.fuerza_ataque = 30;
		this.precio = 225;
		this.velocidad_ataque = 1;
		this.vida = MAX_VIDA;		
	}
}
