package Logica.Enemigos;

import Logica.General.Enemigo;
import Logica.General.Visitors.ConcreteVisitorEnemigo;

/**
 * Modela el enemigo PistolKangaroo
 * @author Comisión 25 (FERRANTE, LATOUQUETTE, LÓPEZ)
 * @version 1.0
 */
public class PistolKangaroo extends Enemigo {
	
	/**
	 * Constructor
	 * @param x Posición en el eje x del objeto
	 * @param y Posición en el eje y del objeto
	 */
	public PistolKangaroo(int x, int y) {
		//atributos físicos
		this.posicionX = x;
		this.posicionY = y;
		this.tamanoX = 1;
		this.tamanoY = 1;
		this.textura = "";
		
		//atributos lógicos
		this.maxMonedas = 50;
		this.velocidad = 25;
		this.velocidadAtaque = 5;
		this.vida = 120;		
		this.alcanceAtaque = 3;
		this.fuerzaAtaque = 45;
		this.puntaje = 25;
		
		visitor = new ConcreteVisitorEnemigo(fuerzaAtaque);
		
	}

}
