package Logica.Objetos;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

<<<<<<< HEAD
=======
import GUI.Controlador.GOGrafico;
>>>>>>> d31a5ad05fd86de7e93babbeb83f6421542faed1
import Logica.General.Nivel;
import Logica.General.Visitors.ConcreteVisitorObjeto;

/**
 * Modela el charco (objeto de mapa).
 * @author Comisión 25 (FERRANTE, LATOUQUETTE, LÓPEZ)
 * @version 1.0
 */
public class Charco extends ObjetoTemporal {
	
<<<<<<< HEAD
	/**
	 * Constructor
	 * @param x Coordenada x donde se encuentra el objeto
	 * @param y Coordenada y donde se encuentra el objeto
	 * @param n Nivel donde se encuentra el objeto
	 */
=======
>>>>>>> d31a5ad05fd86de7e93babbeb83f6421542faed1
	public Charco(int x, int y, Nivel n) {
		super(n);
		//atributos físicos
		this.posicionX = x;
		this.posicionY = y;
		this.tamanoX = 1;
		this.tamanoY = 1;		
		
		String [] texturas = new String[5];
		texturas[0] = "../Texturas/Personajes/kangaroo/kangaroo-0.png";
		texturas[2] = "../Texturas/Personajes/pistol-soldier/pistol-soldier-1.gif";
		texturas[1] = texturas[3] = texturas[4] = texturas[2];
		this.grafica = new GOGrafico(x, y, texturas, n.getMapa());
		
		//atributos lógicos
		this.duracion = 30;
		
		visitor = new ConcreteVisitorObjeto(this, y, "", "", y); // TODO verificar si el visitor es correcto
		
	}

}
