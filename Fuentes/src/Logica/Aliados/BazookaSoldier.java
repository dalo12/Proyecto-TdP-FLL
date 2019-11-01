package Logica.Aliados;

import GUI.Controlador.GOGrafico;
import Logica.General.Aliado;
import Logica.General.Nivel;
import Logica.General.Visitors.ConcreteVisitorAliado;

/**
 * Modela al aliado BazookaSoldier.
 * @author Comisión 25 (FERRANTE, LATOUQUETTE, LÓPEZ)
 * @version 1.0
 */
public class BazookaSoldier extends Aliado {
	
	/**
	 * Constructor
	 * @param x Posición en el eje x del aliado
	 * @param y Posición en el eje y del aliado
	 */
	public BazookaSoldier(int x, int y, Nivel n) {
		super(n);
		// atributos físicos
		this.tamanoX = 1;
		this.tamanoY = 1;
		this.posicionX = x;
		this.posicionY = y;
		
		String [] texturas = new String[5];
		texturas[0] = "../Texturas/Personajes/bazooka-soldier/bazooka-soldier-0.png";
		texturas[1] = "../Texturas/Personajes/bazooka-soldier/bazooka-soldier-1.gif";
		texturas[2] = texturas[3] = texturas[1];
		texturas[4] = "../Texturas/Personajes/bazooka-soldier/bazooka-soldier-4.gif";
		this.grafica = new GOGrafico(x, y, tamanoX, tamanoY, texturas, n.getMapa());
		this.grafica.getLabel().addMouseListener(new AliadoVenta(this));
		
		//atributos lógicos
		this.alcanceAtaque = 7;
		this.fuerzaAtaque = 125;
		this.precio = 175;
		this.velocidadAtaque = 10;
		this.vidaMaxima = 100;
		this.vida = vidaMaxima;		
		
		this.visitor = new ConcreteVisitorAliado(this, fuerzaAtaque);
		
	}

}
