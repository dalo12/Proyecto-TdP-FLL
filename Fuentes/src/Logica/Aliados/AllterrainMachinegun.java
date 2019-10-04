package Logica.Aliados;

import Logica.General.Aliado;
import Logica.General.Visitors.ConcreteVisitorAliado;
import Logica.General.Visitors.Visitor;

/**
 * Modela al aliado AllterrainMachinegun.
 * @author Comisión 25 (FERRANTE, LATOUQUETTE, LÓPEZ)
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
		this.alcanceAtaque = 5;
		this.fuerzaAtaque = 30;
		this.precio = 225;
		this.velocidadAtaque = 1;
		this.vida = MAX_VIDA;	
		
		this.visitor = new ConcreteVisitorAliado(fuerzaAtaque);
		
	}

}
