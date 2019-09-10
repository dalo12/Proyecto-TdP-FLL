package Logica.Enemigos;

import Logica.General.Aliado;
import Logica.General.Enemigo;
import Logica.General.Objeto;
import Logica.General.Personaje;

/**
 * Modela el enemigo Kangaroo
 * @author Comisión 25 (FERNÁNDEZ, LATOUQUETTE, LÓPEZ)
 * @version 1.0
 */
public class Kangaroo extends Enemigo {
	
	/**
	 * Constructor
	 * @param x Posición en el eje x del objeto
	 * @param y Posición en el eje y del objeto
	 */
	public Kangaroo(int x, int y) {
		//atributos físicos
		this.posicion_x = x;
		this.posicion_y = y;
		this.tamano_x = 1;
		this.tamano_y = 1;
		this.textura = "/Img/kangaroo-1.gif";
		
		//atributos lógicos
		this.tope_monedas = 15;
		this.velocidad = 25;
		this.velocidad_ataque = 3;
		this.vida = 100;		
		this.alcance_ataque = 1;
		this.fuerza_ataque = 7;
		this.puntaje = 25;
	}
}
