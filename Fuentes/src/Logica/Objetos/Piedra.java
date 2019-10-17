package Logica.Objetos;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Logica.General.Objeto;
import Logica.General.Visitors.ConcreteVisitorObjeto;

/**
 * Modela a la piedra.
 * @author Comisión 25 (FERRANTE, LATOUQUETTE, LÓPEZ)
 * @version 1.0
 */
public class Piedra extends Objeto {

	/**
	 * Constructor
	 * @param x Posición x en el mapa
	 * @param y Posición y en el mapa
	 */
	public Piedra(int x, int y) {
		//atributos físicos
		this.posicionX = x;
		this.posicionY = y;
		this.tamanoX = 1;
		this.tamanoY = 1;
		this.textura = "";
		
		//Establece el icono del label
		this.label = new JLabel(new ImageIcon(textura));
		
		//atributos lógicos
		this.vida = 30;
		
		visitor = new ConcreteVisitorObjeto(y, "", "", y); // TODO verificar si el visitor es correcto
		
	}
	
}
