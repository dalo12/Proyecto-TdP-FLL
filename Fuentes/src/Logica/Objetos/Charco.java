package Logica.Objetos;

import GUI.Component_Custom.ImageIcon.Objetos.TexturaCharco;
import GUI.Controlador.GOGrafico;
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
<<<<<<< HEAD
		
		String [] texturas = new String[5];
		texturas[0] = "../Texturas/Objetos/puddle/puddle.png";
		texturas[1] = texturas[2] = texturas[3] = texturas[4] = texturas[0];
		this.grafica = new GOGrafico(x, y, tamanoX, tamanoY, texturas, n.getMapa());
=======

		//Grafico de GOGrafico
		this.grafica = new GOGrafico(x, y, tamanoX, tamanoY, new TexturaCharco(), n.getMapa());
>>>>>>> 179aea955a0b2b5a5c1d1651d5b68b054de77910
		
		//atributos lógicos
		this.duracion = 30;
		
		visitor = new ConcreteVisitorObjeto(this, y, "", "", y); // TODO verificar si el visitor es correcto
		
	}

}
