package Logica.Aliados;

import Logica.General.Aliado;
import Logica.General.Visitors.Visitor;

/**
 * Modela al aliado Pistol soldier.
 * @author Comisión 25 (FERNÁNDEZ, LATOUQUETTE, LÓPEZ)
 * @version 1.0
 */
public class PistolSoldier extends Aliado {
	protected static final int MAX_VIDA = 90;
	
	/**
	 * Constructor
	 * @param x Posición en el eje x del aliado
	 * @param y Posición en el eje y del aliado
	 */
	public PistolSoldier(int x, int y) {
		// atributos físicos
		this.tamanoX = 1;
		this.tamanoY = 1;
		this.posicionX = x;
		this.posicionY = y;
		this.textura = "/Img/pistol-soldier-1.png";
				
		//atributos lógicos
		this.nombre = "Pistol";
		this.alcance_ataque = 4;
		this.fuerza_ataque = 30;
		this.precio = 75;
		this.velocidad_ataque = 3;
		this.vida = MAX_VIDA;		
	}

	//@Override
	public void accept(Visitor v) {
		// TODO Auto-generated method stub
		
	}
}
