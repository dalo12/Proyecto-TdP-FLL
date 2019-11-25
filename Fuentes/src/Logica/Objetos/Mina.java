package Logica.Objetos;

import GUI.Component_Custom.ImageIcon.Objetos.TexturaMina;
import GUI.Controlador.GOGrafico.GOGrafico;
import Logica.General.Nivel;
import Logica.General.Visitors.ConcreteVisitorObjeto;
import Logica.Tienda.EntidadComprable;

/**
 * Modela la mina (objeto de mapa).
 * @author Comisión 25 (FERRANTE, LATOUQUETTE, LÓPEZ)
 * @version 1.0
 */
public class Mina extends ObjetoTemporal implements EntidadComprable{
	protected int precio;
	
	/**
	 * Constructor
	 * @param x Coordenada x donde está el objeto
	 * @param y Coordenada y donde está el objeto
	 * @param n Nivel en donde está el objeto
	 */
	public Mina(int x, int y, Nivel n) {
		super(n);
		//atributos físicos
		this.posicionX = x;
		this.posicionY = y;
		this.tamanoX = 1;
		this.tamanoY = 1;
		
		//Grafico de GOGrafico
		this.grafica = new GOGrafico(x, y, tamanoX, tamanoY, new TexturaMina(), n.getMapa());
		
		//atributos lógicos
		this.duracion = 30;
		this.precio = 75;
		
		visitor = new ConcreteVisitorObjeto(this, y, "", "", y); // TODO verificar si el visitor es correcto
		n.insertarObjeto(this);
	}
	
	@Override
	public int getPrecio() {
		return this.precio;
	}
	
}
