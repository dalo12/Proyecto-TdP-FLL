package Logica.Objetos;

import java.util.LinkedList;
import java.util.List;

import GUI.Component_Custom.ImageIcon.Objetos.TexturaBomba;
import GUI.Controlador.GOGrafico.GOGrafico;
import Logica.General.GameObject;
import Logica.General.Nivel;
import Logica.General.Visitors.ConcreteVisitorObjeto;
import Logica.General.Visitors.VisitorBomba;
import Logica.Tienda.EntidadComprable;

/**
 * Modela la bomba (objeto de mapa).
 * @author Comisión 25 (FERRANTE, LATOUQUETTE, LÓPEZ)
 * @version 1.0
 */
public class Bomba extends ObjetoTemporal implements EntidadComprable{
	protected int precio;
	protected int dano;
	protected boolean movido_x, movido_y;
	
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
		movido_x = false;
		movido_y = false;

		//Grafico de GOGrafico
		this.grafica = new GOGrafico(x, y, tamanoX, tamanoY, new TexturaBomba(), n.getMapa());
		
		//atributos lógicos
		this.duracion = 30;
		this.precio = 50;
		this.dano = 100;
		
		visitor = new VisitorBomba(this); // TODO verificar si el visitor es correcto

		n.insertarObjeto(this);
	}
	
	@Override
	public int getPrecio() {
		return this.precio;
	}
	
	/**
	 * @return El daño que hace la bomba al explotar
	 */
	public int getDano() {
		return this.dano;
	}
	
	@Override
	public void accionar() {
		if(movido_x && movido_y) {
			//Daña objetos que están en sus caudrantes al rededor
			for(GameObject o : nivel.getListaEntidades()) {
				boolean rango_x = this.posicionX-100 < o.getPosicionX() && this.posicionX+100 > o.getPosicionX();
				boolean rango_y = this.posicionY-100 < o.getPosicionY() && this.posicionY+100 > o.getPosicionY();
				
				if(rango_x && rango_y) {
					o.accept(this.visitor);
				}
			}
			this.morir();
		}
	}
	
	@Override
	public void setPosicionX(int x) {
		this.posicionX = x;
		this.movido_x = true;
	}
	
	@Override
	public void setPosicionY(int y) {
		this.posicionY = y;
		this.movido_y = true;
	}
	
}
