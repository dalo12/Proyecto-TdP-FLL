package Logica.Aliados;

import Logica.General.Aliado;
import Logica.General.Visitors.ConcreteVisitorAliado;
import Logica.General.Visitors.Visitor;

/**
 * Modela al aliado BazookaSoldier.
 * @author Comisión 25 (FERRANTE, LATOUQUETTE, LÓPEZ)
 * @version 1.0
 */
public class BazookaSoldier extends Aliado {
	protected static final int MAX_VIDA = 100;
	
	/**
	 * Constructor
	 * @param x Posición en el eje x del aliado
	 * @param y Posición en el eje y del aliado
	 */
	public BazookaSoldier(int x, int y) {
		// atributos físicos
		this.tamanoX = 1;
		this.tamanoY = 1;
		this.posicionX = x;
		this.posicionY = y;
		this.textura = "";
				
		//atributos lógicos
		this.nombre = "Bazooka";
		this.alcanceAtaque = 7;
		this.fuerzaAtaque = 125;
		this.precio = 175;
		this.velocidadAtaque = 10;
		this.vida = MAX_VIDA;	
		
		this.visitor = new ConcreteVisitorAliado(fuerzaAtaque);
		
	}

	//@Override
	public void accept(Visitor v) {
		// TODO Auto-generated method stub
		
	}
}
