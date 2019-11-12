package Logica.Enemigos;

import GUI.Controlador.GOGrafico;
import Logica.General.Enemigo;
import Logica.General.Nivel;
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
	public BoxKangaroo(int x, int y, Nivel n) {
		super(n);
		//atributos físicos
		this.posicionX = x;
		this.posicionY = y;
		this.tamanoX = 1;
		this.tamanoY = 1;
		
		String [] texturas = new String[5];
		texturas[1] = "../Texturas/Personajes/box-kangaroo/box-kangaroo-1.gif";
		texturas[3] = "../Texturas/Personajes/box-kangaroo/box-kangaroo-3.gif";
		texturas[2] = texturas[0] = texturas[4] = texturas[1];
		this.grafica = new GOGrafico(x, y, tamanoX, tamanoY, texturas, n.getMapa());
		
		//atributos lógicos
		this.maxMonedas = 25;
		this.velocidad = 7;
		this.velocidadAtaque = 1;
		this.vida = 100;		
		this.alcanceAtaque = 1;
		this.fuerzaAtaque = 15;
		this.puntaje = 25;
		
		visitor = new ConcreteVisitorEnemigo(this, fuerzaAtaque);
		
		n.insertarObjeto(this);
	}
	
}
