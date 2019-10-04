package Logica.Enemigos;

import Logica.General.Enemigo;
import Logica.General.Visitors.Visitor;

/**
 * Modela el enemigo Kangaroo
 * @author Comisión 25 (FERNÁNDEZ, LATOUQUETTE, LÓPEZ)
 * @version 1.0
 */
public class TankGaroo extends Enemigo {
	
	/**
	 * Constructor
	 * @param x Posición en el eje x del objeto
	 * @param y Posición en el eje y del objeto
	 */
	public TankGaroo(int x, int y) {
		//atributos físicos
		this.posicionX = x;
		this.posicionY = y;
		this.tamanoX = 1;
		this.tamanoY = 1;
		this.textura = "";
		
		//atributos lógicos
		this.tope_monedas = 200;
		this.velocidad = 25;
		this.velocidad_ataque = 15;
		this.vida = 500;		
		this.alcance_ataque = 10;
		this.fuerza_ataque = 100;
		this.puntaje = 25;
	}

	@Override
	public void accept(Visitor v) {
		// TODO Auto-generated method stub
		
	}
}
