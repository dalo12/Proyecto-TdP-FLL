package Logica.Enemigos;

import GUI.Component_Custom.ImageIcon.Enemigos.TexturaPistolKangaroo;
import GUI.Controlador.GOGrafico;
import Logica.General.Enemigo;
import Logica.General.Nivel;
import Logica.General.Visitors.ConcreteVisitorEnemigo;

/**
 * Modela el enemigo PistolKangaroo
 * @author Comisión 25 (FERRANTE, LATOUQUETTE, LÓPEZ)
 * @version 1.0
 */
public class PistolKangaroo extends Enemigo {
	
	/**
	 * Constructor
	 * @param x Posición en el eje x del objeto
	 * @param y Posición en el eje y del objeto
	 */
	public PistolKangaroo(int x, int y, Nivel n) {
		super(n);
		//atributos físicos
		this.posicionX = x;
		this.posicionY = y;
		this.tamanoX = 1;
		this.tamanoY = 1;
		
		//Grafico de GOGrafico
		this.grafica = new GOGrafico(x, y, tamanoX, tamanoY, new TexturaPistolKangaroo(), n.getMapa());
		
		//atributos lógicos
		this.maxMonedas = 50;
		this.velocidad = 7;
		this.velocidadAtaque = 5;
		this.vida = 120;		
		this.alcanceAtaque = 3;
		this.fuerzaAtaque = 45;
		this.puntaje = 25;
		
		visitor = new ConcreteVisitorEnemigo(this, fuerzaAtaque);
		
		n.insertarObjeto(this);
		
	}

}
