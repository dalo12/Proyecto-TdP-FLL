package Logica.Aliados;

import Logica.General.Aliado;
import Logica.General.Visitors.ConcreteVisitorAliado;
import Logica.General.Visitors.Visitor;

/**
 * Modela al aliado PistolSoldier.
 * @author Comisión 25 (FERRANTE, LATOUQUETTE, LÓPEZ)
 * @version 1.0
 */
public class PistolSoldier extends Aliado {
	protected static final int MAX_VIDA = 90;
	
	/**
	 * Constructor
	 * @param x Posición en el eje x del aliado
	 * @param y Posición en el eje y del aliado
	 */
	public PistolSoldier(int x, int y) {
		// atributos físicos
		this.tamanoX = 1;
		this.tamanoY = 1;
		this.posicionX = x;
		this.posicionY = y;
		this.textura = "/Img/pistol-soldier-1.png";
				
		//atributos lógicos
		this.nombre = "Pistol";
		this.alcanceAtaque = 4;
		this.fuerzaAtaque = 30;
		this.precio = 75;
		this.velocidadAtaque = 3;
		this.vida = MAX_VIDA;		
		
		this.visitor = new ConcreteVisitorAliado(fuerzaAtaque);
		
	}

	//@Override
	public void accept(Visitor v) {
		// TODO Auto-generated method stub
		
	}
}
