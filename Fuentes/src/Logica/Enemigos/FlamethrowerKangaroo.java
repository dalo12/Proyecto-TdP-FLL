package Logica.Enemigos;

import GUI.Component_Custom.ImageIcon.Enemigos.TexturaFlamethrowerKangaroo;
import GUI.Controlador.GOGrafico;
import Logica.General.Enemigo;
import Logica.General.Nivel;
import Logica.General.Visitors.ConcreteVisitorEnemigo;

/**
 * Modela el enemigo FlamethrowerKangaroo
 * @author Comisión 25 (FERRANTE, LATOUQUETTE, LÓPEZ)
 * @version 1.0
 */
public class FlamethrowerKangaroo extends Enemigo {
	
	/**
	 * Constructor
	 * @param x Posición en el eje x del objeto
	 * @param y Posición en el eje y del objeto
	 */
	public FlamethrowerKangaroo(int x, int y, Nivel n) {
		super(n);
		//atributos físicos
		this.posicionX = x;
		this.posicionY = y;
		this.tamanoX = 1;
		this.tamanoY = 1;
		
		//Grafico de GOGrafico
		this.grafica = new GOGrafico(x, y, tamanoX, tamanoY, new TexturaFlamethrowerKangaroo(), n.getMapa());
		
		//atributos lógicos
		this.maxMonedas = 100;
		this.velocidad = 7;
		this.velocidadAtaque = 7;
		this.vida = 250;		
		this.alcanceAtaque = 3;
		this.fuerzaAtaque = 60;
		this.puntaje = 25;
		
		visitor = new ConcreteVisitorEnemigo(this, fuerzaAtaque);
		
		n.insertarObjeto(this);
		
	}

}
