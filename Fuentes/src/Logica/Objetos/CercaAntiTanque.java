package Logica.Objetos;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Logica.General.Objeto;
import Logica.General.Visitors.ConcreteVisitorObjeto;

/**
 * Modela a la cerca antitanque.
 * @author Comisión 25 (FERRANTE, LATOUQUETTE, LÓPEZ)
 * @version 1.0
 */
public class CercaAntiTanque extends Objeto {
	/**
	 * Constructor
	 * @param x Posición x en el mapa
	 * @param y Posición y en el mapa
	 */
	public CercaAntiTanque(int x, int y) {
		//atributos físicos
		this.posicionX = x;
		this.posicionY = y;
		this.tamanoX = 1;
		this.tamanoY = 2;		
		
		//atributos lógicos
		this.vida = 100;
		
		visitor = new ConcreteVisitorObjeto(y, "", "", y); // TODO verificar si el visitor es correcto
		
	}

}
