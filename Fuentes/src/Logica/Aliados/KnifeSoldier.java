package Logica.Aliados;

import Logica.General.Aliado;
import Logica.General.Visitors.ConcreteVisitorAliado;
import Logica.General.Visitors.Visitor;

/**
 * Modela al aliado KnifeSoldier.
 * @author Comisión 25 (FERRANTE, LATOUQUETTE, LÓPEZ)
 * @version 1.0
 */
public class KnifeSoldier extends Aliado {
	protected static final int MAX_VIDA = 100;
	
	/**
	 * Constructor
	 * @param x Posición en el eje x del aliado
	 * @param y Posición en el eje y del aliado
	 */
	public KnifeSoldier(int x, int y) {
		// atributos físicos
		this.tamanoX = 1;
		this.tamanoY = 1;
		this.posicionX = x;
		this.posicionY = y;
		this.textura = "";
				
		//atributos lógicos
		this.nombre = "Knife";
		this.alcanceAtaque = 1;
		this.fuerzaAtaque = 20;
		this.precio = 50;
		this.velocidadAtaque = 2;
		this.vida = MAX_VIDA;	
		
		this.visitor = new ConcreteVisitorAliado(fuerzaAtaque);
		
	}

	//@Override
	public void accept(Visitor v) {
		// TODO Auto-generated method stub
		
	}
}
