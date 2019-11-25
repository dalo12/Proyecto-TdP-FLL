package Logica.Objetos;

import GUI.Component_Custom.ImageIcon.Objetos.TexturaBomba;
import GUI.Controlador.GOGrafico.GOGrafico;
import Logica.General.Nivel;
import Logica.General.Visitors.ConcreteVisitorObjeto;
import Logica.Tienda.EntidadComprable;

/**
 * Modela la bomba (objeto de mapa).
 * @author Comisión 25 (FERRANTE, LATOUQUETTE, LÓPEZ)
 * @version 1.0
 */
public class Bomba extends ObjetoTemporal implements EntidadComprable{
	protected int precio;
	
	/**
	 * Constructor
	 * @param x Coordenada x del objeto en el mapa
	 * @param y Coordenada y del objeto en el mapa
	 * @param n Nivel en el que está el objeto
	 */
	public Bomba(int x, int y, Nivel n) {
		super(n);
		//atributos físicos
		this.posicionX = x;
		this.posicionY = y;
		this.tamanoX = 1;
		this.tamanoY = 1;

		//Grafico de GOGrafico
		this.grafica = new GOGrafico(x, y, tamanoX, tamanoY, new TexturaBomba(), n.getMapa());
		
		//atributos lógicos
		this.duracion = 30;
		this.precio = 50;
		
		visitor = new ConcreteVisitorObjeto(this, y, "", "", y); // TODO verificar si el visitor es correcto
		n.insertarObjeto(this);
	}
	
	@Override
	public int getPrecio() {
		return this.precio;
	}
	
}
