package Logica.Enemigos;

import Logica.General.Enemigo;
import Logica.General.Visitor;

/**
 * Modela el enemigo Kangaroo
 * @author Comisión 25 (FERNÁNDEZ, LATOUQUETTE, LÓPEZ)
 * @version 1.0
 */
public class PistolKangaroo extends Enemigo {
	
	/**
	 * Constructor
	 * @param x Posición en el eje x del objeto
	 * @param y Posición en el eje y del objeto
	 */
	public PistolKangaroo(int x, int y) {
		//atributos físicos
		this.posicion_x = x;
		this.posicion_y = y;
		this.tamano_x = 1;
		this.tamano_y = 1;
		this.textura = "";
		
		//atributos lógicos
		this.tope_monedas = 50;
		this.velocidad = 25;
		this.velocidad_ataque = 5;
		this.vida = 120;		
		this.alcance_ataque = 3;
		this.fuerza_ataque = 45;
		this.puntaje = 25;
	}

	@Override
	public void accept(Visitor v) {
		// TODO Auto-generated method stub
		
	}
}
