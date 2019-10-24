package Logica.Objetos;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Logica.General.Nivel;
import Logica.General.Visitors.ConcreteVisitorObjeto;

/**
 * Modela el charco (objeto de mapa).
 * @author Comisión 25 (FERRANTE, LATOUQUETTE, LÓPEZ)
 * @version 1.0
 */
public class Charco extends ObjetoTemporal {
	
	/**
	 * Constructor
	 * @param x Coordenada x donde se encuentra el objeto
	 * @param y Coordenada y donde se encuentra el objeto
	 * @param n Nivel donde se encuentra el objeto
	 */
	public Charco(int x, int y, Nivel n) {
		super(n);
		//atributos físicos
		this.posicionX = x;
		this.posicionY = y;
		this.tamanoX = 1;
		this.tamanoY = 1;		
		
		//atributos lógicos
		this.duracion = 30;
		
		visitor = new ConcreteVisitorObjeto(this, y, "", "", y); // TODO verificar si el visitor es correcto
		
	}

}
