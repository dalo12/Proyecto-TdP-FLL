package Logica.Objetos;

import GUI.Component_Custom.ImageIcon.Objetos.TexturaBarricada;
import GUI.Controlador.GOGrafico.GOGrafico;
import Logica.General.Nivel;
import Logica.General.Objeto;
import Logica.General.Visitors.ConcreteVisitorObjeto;
import Logica.Tienda.EntidadComprable;

/**
 * Modela a la barricada.
 * @author Comisión 25 (FERRANTE, LATOUQUETTE, LÓPEZ)
 * @version 1.0
 */
public class Barricada extends Objeto implements EntidadComprable {
	protected int precio;
	
	/**
	 * Constructor
	 * @param x Posición x en el mapa
	 * @param y Posición y en el mapa
	 * @param n Nivel al que pertenece la barricada
	 */
	public Barricada(int x, int y, Nivel n) {
		super(n);
		//atributos físicos
		this.posicionX = x;
		this.posicionY = y;
		this.tamanoX = 1;
		this.tamanoY = 1;
		
		//Grafico de GOGrafico
		this.grafica = new GOGrafico(x, y, tamanoX, tamanoY, new TexturaBarricada(), n.getMapa());
		
		//atributos lógicos
		this.vida = 50;
		this.precio = 100;
		
		visitor = new ConcreteVisitorObjeto(this, y, "", "", y); // TODO verificar si el visitor es correcto
		n.insertarObjeto(this);
	}
	
	@Override
	public int getPrecio() {
		return this.precio;
	}

}
