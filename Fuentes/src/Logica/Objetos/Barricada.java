package Logica.Objetos;

import Logica.General.Objeto;
import Logica.General.Visitors.ConcreteVisitorObjeto;

/**
 * Modela a la barricada.
 * @author Comisión 25 (FERRANTE, LATOUQUETTE, LÓPEZ)
 * @version 1.0
 */
public class Barricada extends Objeto {
	
	/**
	 * Constructor
	 * @param x Posición x en el mapa
	 * @param y Posición y en el mapa
	 */
	public Barricada(int x, int y) {
		//atributos físicos
		this.posicionX = x;
		this.posicionY = y;
		this.tamanoX = 1;
		this.tamanoY = 1;
		this.textura = "";
		
		//atributos lógicos
		this.nombre = "Barricada";
		this.vida = 50;
		
		visitor = new ConcreteVisitorObjeto(y, nombre, nombre, y); // TODO verificar si el visitor es correcto
		
	}

	
}
