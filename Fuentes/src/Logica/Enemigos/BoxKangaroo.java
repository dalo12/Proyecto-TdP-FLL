package Logica.Enemigos;

import Logica.General.Enemigo;
import Logica.General.Visitors.ConcreteVisitorEnemigo;

/**
 * Modela el enemigo BoxKangaroo
 * @author Comisión 25 (FERRANTE, LATOUQUETTE, LÓPEZ)
 * @version 1.0
 */
public class BoxKangaroo extends Enemigo {
	
	/**
	 * Constructor
	 * @param x Posición en el eje x del objeto
	 * @param y Posición en el eje y del objeto
	 */
	public BoxKangaroo(int x, int y) {
		//atributos físicos
		this.posicionX = x;
		this.posicionY = y;
		this.tamanoX = 1;
		this.tamanoY = 1;
		this.textura = "";
		
		//atributos lógicos
		this.maxMonedas = 25;
		this.velocidad = 25;
		this.velocidadAtaque = 1;
		this.vida = 100;		
		this.alcanceAtaque = 1;
		this.fuerzaAtaque = 15;
		this.puntaje = 25;
		
		visitor = new ConcreteVisitorEnemigo(fuerzaAtaque);
		
	}
	
}
