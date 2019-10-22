package Logica.Objetos;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import GUI.Controlador.GOGrafico;
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
		
		String [] texturas = new String[5];
		texturas[0] = "../Texturas/Personajes/kangaroo/kangaroo-0.png";
		texturas[2] = "../Texturas/Personajes/pistol-soldier/pistol-soldier-1.gif";
		texturas[1] = texturas[3] = texturas[4] = texturas[2];
		this.grafica = new GOGrafico(x, y, texturas);
		
		//atributos lógicos
		this.vida = 50;
		
		visitor = new ConcreteVisitorObjeto(y, "", "", y); // TODO verificar si el visitor es correcto
		
	}

}
