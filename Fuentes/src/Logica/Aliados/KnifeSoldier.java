package Logica.Aliados;

import Logica.General.Aliado;
import Logica.General.Visitors.ConcreteVisitorAliado;

/**
 * Modela al aliado KnifeSoldier.
 * @author Comisión 25 (FERRANTE, LATOUQUETTE, LÓPEZ)
 * @version 1.0
 */
public class KnifeSoldier extends Aliado {
	
	/**
	 * Constructor
	 * @param x Posición en el eje x del aliado
	 * @param y Posición en el eje y del aliado
	 */
	public KnifeSoldier(int x, int y) {
		// atributos físicos
		this.tamanoX = 1;
		this.tamanoY = 1;
		this.posicionX = x;
		this.posicionY = y;
		this.textura = "";
				
		//atributos lógicos
		this.alcanceAtaque = 1;
		this.fuerzaAtaque = 20;
		this.precio = 50;
		this.velocidadAtaque = 2;
		this.vidaMaxima = 100;
		this.vida = vidaMaxima;		
		
		this.visitor = new ConcreteVisitorAliado(fuerzaAtaque);
		
	}
	
}
