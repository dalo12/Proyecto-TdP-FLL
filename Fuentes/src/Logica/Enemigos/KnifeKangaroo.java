package Logica.Enemigos;

import GUI.Component_Custom.ImageIcon.Enemigos.TexturaKnifeKangaroo;
import GUI.Controlador.GOGrafico.GOGrafico;
import Logica.General.Enemigo;
import Logica.General.Nivel;
import Logica.General.Visitors.ConcreteVisitorEnemigo;

/**
 * Modela el enemigo KnifeKangaroo
 * @author Comisión 25 (FERRANTE, LATOUQUETTE, LÓPEZ)
 * @version 1.0
 */
public class KnifeKangaroo extends Enemigo {
	
	/**
	 * Constructor
	 * @param x Posición en el eje x del objeto
	 * @param y Posición en el eje y del objeto
	 */
	public KnifeKangaroo(int x, int y, Nivel n) {
		super(n);
		//atributos físicos
		this.posicionX = x;
		this.posicionY = y;
		this.tamanoX = 1;
		this.tamanoY = 1;
		
		//Grafico de GOGrafico
		this.grafica = new GOGrafico(x, y, tamanoX, tamanoY, new TexturaKnifeKangaroo(), n.getMapa());
		
		//atributos lógicos
		this.maxMonedas = 30;
		this.velocidad = 7;
		this.velocidadAtaque = 4;
		this.vida = 90;		
		this.alcanceAtaque = 1;
		this.fuerzaAtaque = 30;
		this.puntaje = 25;
		
		visitor = new ConcreteVisitorEnemigo(this, fuerzaAtaque);
		
		n.insertarObjeto(this);
		
	}

}
