package Logica.Aliados;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Logica.General.Aliado;
import Logica.General.Visitors.ConcreteVisitorAliado;

/**
 * Modela al aliado SniperSoldier.
 * @author Comisión 25 (FERRANTE, LATOUQUETTE, LÓPEZ)
 * @version 1.0
 */
public class SniperSoldier extends Aliado {
	
	/**
	 * Constructor
	 * @param x Posición en el eje x del aliado
	 * @param y Posición en el eje y del aliado
	 */
	public SniperSoldier(int x, int y) {
		// atributos físicos
		this.tamanoX = 1;
		this.tamanoY = 1;
		this.posicionX = x;
		this.posicionY = y;
		this.textura = "";
		
		//Establece el icono del label
		this.label = new JLabel(new ImageIcon(textura));
				
		//atributos lógicos
		this.alcanceAtaque = 10;
		this.fuerzaAtaque = 60;
		this.precio = 125;
		this.velocidadAtaque = 7;
		this.vidaMaxima = 50;
		this.vida = vidaMaxima;	
		
		this.visitor = new ConcreteVisitorAliado(fuerzaAtaque);
		
	}
	
}
