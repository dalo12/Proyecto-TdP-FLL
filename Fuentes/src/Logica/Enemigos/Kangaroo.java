package Logica.Enemigos;

import GUI.Controlador.GOGrafico;
import Logica.General.Enemigo;
import Logica.General.Nivel;
import Logica.General.Visitors.ConcreteVisitorEnemigo;

/**
 * Modela el enemigo Kangaroo
 * @author Comisión 25 (FERRANTE, LATOUQUETTE, LÓPEZ)
 * @version 1.0
 */
public class Kangaroo extends Enemigo {
	
	/**
	 * Constructor
	 * @param x Posición en el eje x del objeto
	 * @param y Posición en el eje y del objeto
	 */
	public Kangaroo(int x, int y, Nivel n) {
		super(n);
		//atributos físicos
		this.posicionX = x;
		this.posicionY = y;
		this.tamanoX = 1;
		this.tamanoY = 1;
		
		String [] texturas = new String[5];
		texturas[0] = "../Texturas/Personajes/kangaroo/kangaroo-0.png";
		texturas[1] = "../Texturas/Personajes/kangaroo/kangaroo-1.gif";
		texturas[2] = texturas[3] = texturas[4] = texturas[1];
		this.grafica = new GOGrafico(x, y, tamanoX, tamanoY, texturas, n.getMapa());
		
		//atributos lógicos
		this.maxMonedas = 15;
		this.velocidad = 10;
		this.velocidadAtaque = 3;
		this.vida = 100;		
		this.alcanceAtaque = 1;
		this.fuerzaAtaque = 7;
		this.puntaje = 25;
		
		visitor = new ConcreteVisitorEnemigo(this, fuerzaAtaque);
		
		n.getListaEntidades().add(this);
		
	}

}
