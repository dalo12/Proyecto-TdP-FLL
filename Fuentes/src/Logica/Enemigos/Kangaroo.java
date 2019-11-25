package Logica.Enemigos;

import GUI.Component_Custom.ImageIcon.Enemigos.TexturaKangaroo;
import GUI.Controlador.GOGrafico.GOGrafico;
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
		
		//Grafico de GOGrafico
		this.grafica = new GOGrafico(x, y, tamanoX, tamanoY, new TexturaKangaroo(), n.getMapa());
		
		//atributos lógicos
		this.maxMonedas = 15;
		this.velocidad = 5;
		this.velocidadAtaque = 3;
		this.vida = 100;		
		this.alcanceAtaque = 1;
		this.fuerzaAtaque = 7;
		this.puntaje = 25;
		
		visitor = new ConcreteVisitorEnemigo(this, fuerzaAtaque);
		
		n.insertarObjeto(this);
		
	}

}
