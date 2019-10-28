package Logica.Aliados;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import GUI.Controlador.GOGrafico;
import Logica.General.Aliado;
import Logica.General.Nivel;
import Logica.General.Visitors.ConcreteVisitorAliado;

/**
 * Modela al aliado KnifeSoldier.
 * @author Comisión 25 (FERRANTE, LATOUQUETTE, LÓPEZ)
 * @version 1.0
 */
public class KnifeSoldier extends Aliado {
	/**
	 * Constructor
	 * @param x Posición en el eje x del aliado
	 * @param y Posición en el eje y del aliado
	 */
	public KnifeSoldier(int x, int y, Nivel n) {
		super(n);
		// atributos físicos
		this.tamanoX = 1;
		this.tamanoY = 1;
		this.posicionX = x;
		this.posicionY = y;
		
		String [] texturas = new String[5];
		texturas[0] = "../Texturas/Personajes/knife-soldier/knife-soldier-0.png";
		texturas[1] = "../Texturas/Personajes/knife-soldier/knife-soldier-1.gif";
		texturas[2] = texturas[3] =  texturas[1];
		texturas[4] = "../Texturas/Personajes/knife-soldier/knife-soldier-4.gif";
		this.grafica = new GOGrafico(x, y, texturas, n.getMapa());
		
		//atributos lógicos
		this.alcanceAtaque = 1;
		this.fuerzaAtaque = 20;
		this.precio = 50;
		this.velocidadAtaque = 2;
		this.vidaMaxima = 100;
		this.vida = vidaMaxima;		
		
		this.visitor = new ConcreteVisitorAliado(this, fuerzaAtaque);
		
	}
	
}
