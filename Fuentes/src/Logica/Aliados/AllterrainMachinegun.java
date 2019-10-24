package Logica.Aliados;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import GUI.Controlador.GOGrafico;
import Logica.General.Aliado;
import Logica.General.Nivel;
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
	public AllterrainMachinegun(int x, int y, Nivel n) {
		super(n);
		// atributos físicos
		this.tamanoX = 1;
		this.tamanoY = 2;
		this.posicionX = x;
		this.posicionY = y;
		
		String [] texturas = new String[5];
		texturas[0] = "../Texturas/Personajes/pistol-soldier/pistol-soldier-0.png";
		texturas[1] = "../Texturas/Personajes/pistol-soldier/pistol-soldier-1.gif";
		texturas[2] = texturas[3] = texturas[4] = texturas[1];
		this.grafica = new GOGrafico(x, y, texturas, n.getMapa());
		
		//atributos lógicos
		this.alcanceAtaque = 5;
		this.fuerzaAtaque = 30;
		this.precio = 225;
		this.velocidadAtaque = 1;
		this.vidaMaxima = 250;
		this.vida = vidaMaxima;	
		
		this.visitor = new ConcreteVisitorAliado(this, fuerzaAtaque);
		
	}

}
