package Logica.Aliados;

import GUI.Component_Custom.ImageIcon.Aliados.TexturaAllterrainMachinegun;
import GUI.Controlador.GOGrafico.GOGrafico;
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
		super(n, 1);
		// atributos físicos
		this.tamanoX = 2;
		this.tamanoY = 2;
		this.posicionX = x;
		this.posicionY = y;
		//Grafico de GOGrafico
		this.grafica = new GOGrafico(x, y, tamanoX, tamanoY, new TexturaAllterrainMachinegun(), n.getMapa());
		this.grafica.getLabel().addMouseListener(new AliadoVenta(this));
		
		//atributos lógicos
		this.alcanceAtaque = 5;
		this.fuerzaAtaque = 30;
		this.precio = 225;
		//this.velocidadAtaque = 1;
		this.vidaMaxima = 250;
		this.vida = vidaMaxima;	
		
		this.visitor = new ConcreteVisitorAliado(this, fuerzaAtaque);
		
		n.insertarObjeto(this);
	}

}
