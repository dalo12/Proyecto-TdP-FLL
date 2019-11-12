package Logica.Enemigos;

import GUI.Controlador.GOGrafico;
import Logica.General.Enemigo;
import Logica.General.Nivel;
import Logica.General.Visitors.ConcreteVisitorEnemigo;

/**
 * Modela el enemigo TankGaroo
 * @author Comisión 25 (FERRANTE, LATOUQUETTE, LÓPEZ)
 * @version 1.0
 */
public class TankGaroo extends Enemigo {
	
	/**
	 * Constructor
	 * @param x Posición en el eje x del objeto
	 * @param y Posición en el eje y del objeto
	 */
	public TankGaroo(int x, int y, Nivel n) {
		super(n);
		//atributos físicos
		this.posicionX = x;
		this.posicionY = y;
		this.tamanoX = 1;
		this.tamanoY = 1;
		
		String [] texturas = new String[5];
		texturas[0] = "../Texturas/Personajes/tank-garoo/tank-garoo-0.png";
		texturas[4] = "../Texturas/Personajes/tank-garoo/tank-garoo-4.gif";
		texturas[2] = texturas[3] = texturas[1] = texturas[0];
		this.grafica = new GOGrafico(x, y, tamanoX, tamanoY, texturas, n.getMapa());
		
		//atributos lógicos
		this.maxMonedas = 200;
		this.velocidad = 25;
		this.velocidadAtaque = 15;
		this.vida = 500;		
		this.alcanceAtaque = 10;
		this.fuerzaAtaque = 100;
		this.puntaje = 25;
		
		visitor = new ConcreteVisitorEnemigo(this, fuerzaAtaque);
		
		n.insertarObjeto(this);
		
	}

}
