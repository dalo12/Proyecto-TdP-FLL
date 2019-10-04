package Logica.Aliados;

import Logica.General.Aliado;
import Logica.General.Visitors.Visitor;

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
		this.tamanoX = 1;
		this.tamanoY = 2;
		this.posicionX = x;
		this.posicionY = y;
		this.textura = "";
				
		//atributos lógicos
		this.nombre = "Allterrain Machinegun";
		this.alcance_ataque = 5;
		this.fuerza_ataque = 30;
		this.precio = 225;
		this.velocidad_ataque = 1;
		this.vida = MAX_VIDA;		
	}

	//@Override
	public void accept(Visitor v) {
		// TODO Auto-generated method stub
		
	}
}
