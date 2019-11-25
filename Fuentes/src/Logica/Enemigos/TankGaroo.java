package Logica.Enemigos;

import GUI.Component_Custom.ImageIcon.Enemigos.TexturaTankGaroo;
import GUI.Controlador.GOGrafico.GOGrafico;
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
		
		//Grafico de GOGrafico
		this.grafica = new GOGrafico(x, y, tamanoX, tamanoY, new TexturaTankGaroo(), n.getMapa());
		
		//atributos lógicos
		this.maxMonedas = 200;
		this.velocidad = 2;
		this.velocidadAtaque = 15;
		this.vida = 500;		
		this.alcanceAtaque = 10;
		this.fuerzaAtaque = 100;
		this.puntaje = 25;
		
		visitor = new ConcreteVisitorEnemigo(this, fuerzaAtaque);
		
		n.insertarObjeto(this);
		
	}

}
