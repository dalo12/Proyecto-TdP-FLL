package Logica.Objetos;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import GUI.Controlador.GOGrafico;
import Logica.General.Nivel;
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
	public CercaAntiTanque(int x, int y, Nivel n) {
		super(n);
		//atributos físicos
		this.posicionX = x;
		this.posicionY = y;
		this.tamanoX = 1;
		this.tamanoY = 2;		
		
		String [] texturas = new String[5];
		texturas[0] = "../Texturas/Personajes/kangaroo/kangaroo-0.png";
		texturas[2] = "../Texturas/Personajes/pistol-soldier/pistol-soldier-1.gif";
		texturas[1] = texturas[3] = texturas[4] = texturas[2];
		this.grafica = new GOGrafico(x, y, texturas, n.getMapa());
		
		//atributos lógicos
		this.vida = 100;
		
		visitor = new ConcreteVisitorObjeto(this, y, "", "", y); // TODO verificar si el visitor es correcto
		
	}

}
