package Logica.Objetos;

import GUI.Component_Custom.ImageIcon.Objetos.TexturaCercaAntiTanque;
import GUI.Controlador.GOGrafico.GOGrafico;
import Logica.General.Nivel;
import Logica.General.Objeto;
import Logica.General.Visitors.ConcreteVisitorObjeto;
import Logica.Tienda.EntidadComprable;

/**
 * Modela a la cerca antitanque.
 * @author Comisión 25 (FERRANTE, LATOUQUETTE, LÓPEZ)
 * @version 1.0
 */
public class CercaAntiTanque extends Objeto  implements EntidadComprable{
	protected int precio;
	
	/**
	 * Constructor
	 * @param x Posición x en el mapa
	 * @param y Posición y en el mapa
	 * @param n Nivel al que pertenece el objeto
	 */
	public CercaAntiTanque(int x, int y, Nivel n) {
		super(n);
		//atributos físicos
		this.posicionX = x;
		this.posicionY = y;
		this.tamanoX = 1;
		this.tamanoY = 2;		

		//Grafico de GOGrafico
		this.grafica = new GOGrafico(x, y, tamanoX, tamanoY, new TexturaCercaAntiTanque(), n.getMapa());
		
		//atributos lógicos
		this.vida = 100;
		this.precio = 120;
		
		visitor = new ConcreteVisitorObjeto(this, y, "", "", y); // TODO verificar si el visitor es correcto
		n.insertarObjeto(this);
	}
	
	@Override
	public int getPrecio() {
		return this.precio;
	}

}
