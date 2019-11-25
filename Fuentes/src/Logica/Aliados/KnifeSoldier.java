package Logica.Aliados;

import GUI.Component_Custom.ImageIcon.Aliados.TexturaKnifeSoldier;
import GUI.Controlador.GOGrafico.GOGrafico;
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
		super(n, 2);
		// atributos físicos
		this.tamanoX = 1;
		this.tamanoY = 1;
		this.posicionX = x;
		this.posicionY = y;
		
		//Grafico de GOGrafico
		this.grafica = new GOGrafico(x, y, tamanoX, tamanoY, new TexturaKnifeSoldier(), n.getMapa());
		this.grafica.getLabel().addMouseListener(new AliadoVenta(this));
		
		//atributos lógicos
		this.alcanceAtaque = 1;
		this.fuerzaAtaque = 20;
		this.precio = 50;
		//this.velocidadAtaque = 2;
		this.vidaMaxima = 100;
		this.vida = vidaMaxima;		
		
		this.visitor = new ConcreteVisitorAliado(this, fuerzaAtaque);
		
		n.insertarObjeto(this);
		
	}
	
}
