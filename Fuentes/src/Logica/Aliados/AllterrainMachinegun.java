package Logica.Aliados;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Logica.General.Aliado;
import Logica.General.Visitors.ConcreteVisitorAliado;

/**
 * Modela al aliado AllterrainMachinegun.
 * @author Comisión 25 (FERRANTE, LATOUQUETTE, LÓPEZ)
 * @version 1.0
 */
public class AllterrainMachinegun extends Aliado {
	
	/**
	 * Constructor
	 * @param x Posición en el eje x del aliado
	 * @param y Posición en el eje y del aliado
	 */
	public AllterrainMachinegun(int x, int y) {
		// atributos físicos
		this.tamanoX = 1;
		this.tamanoY = 2;
		this.posicionX = x;
		this.posicionY = y;
		this.textura = "";
		
		//Establece el icono del label
		this.label = new JLabel(new ImageIcon(textura));
				
		//atributos lógicos
		this.alcanceAtaque = 5;
		this.fuerzaAtaque = 30;
		this.precio = 225;
		this.velocidadAtaque = 1;
		this.vidaMaxima = 250;
		this.vida = vidaMaxima;	
		
		this.visitor = new ConcreteVisitorAliado(fuerzaAtaque);
		
	}

}
