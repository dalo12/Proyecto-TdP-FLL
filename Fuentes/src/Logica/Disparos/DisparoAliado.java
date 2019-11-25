/**
 * 
 */
package Logica.Disparos;

import java.awt.Rectangle;

import GUI.Component_Custom.ImageIcon.Disparos.TexturaDisparoAliado;
import GUI.Controlador.GOGrafico;
import Logica.General.Disparo;
import Logica.General.GameObject;
import Logica.General.Nivel;
import Logica.General.Visitors.ConcreteVisitorDisparoAliado;
import Logica.General.Visitors.Visitor;

/**
 * Modela los disparos a por los aliados realizarse en el juego.
 * @author Comisión 25 (FERRANTE, LATOUQUETTE, LÓPEZ)
 * @version 1.0
 */
public class DisparoAliado extends Disparo {
	
	/**
	 * Constructor
	 * @param x Posición x desde donde se efectúa el disparo
	 * @param y Posición y desde donde se efectúa el disparo
	 * @param alcance Alcance del disparo
	 * @param dano Daño que ejerce el disparo
	 * @param velocidad Velocidad a la que viaja el disparo
	 * @param n Nivel donde se produce el disparo
	 */
	public DisparoAliado(int x, int y, int alcance, int dano, int velocidad, Nivel n) {
		super(x, y, alcance, dano, velocidad, n);
		
		//Grafico de GOGrafico
		this.grafica = new GOGrafico(x, y, 7, 7, new TexturaDisparoAliado(), n.getMapa());
		
		//Agrego el disparo a la lista de entidades
		nivel = n;
		nivel.insertarObjeto(this);
	}
	
	/**
	 * Devuelve el daño que provoca el disparo
	 * @return El daño que provoca el disparo
	 */
	public int getDano() {
		return dano;
	}
	
	/**
	 * Devuelve la velocidad del disparo
	 * @return La velocidad del disparo
	 */
	public int getVelocidad() {
		return velocidad;
	}
	
	/**
	 * Hace que el disparo avance
	 */
	public void avanzar() {
		if(posicionX > x_inicial + alcance) {
			morir();
		}else {
			posicionX += velocidad;
			grafica.avanzar(posicionX, posicionY);
		}
	}

	@Override
	public void accionar() {
		Rectangle r_yo = grafica.getLabel().getBounds();
		
		for(GameObject g : nivel.getListaEntidades()) {
			Rectangle r_g = g.getGrafica().getLabel().getBounds();
			
			if(r_yo.intersects(r_g)) {
//				System.out.println("r_yo: ( " + r_yo.getX() + " , " + r_yo.getY() + " )");
//				System.out.println("r_g: ( " + r_g.getX() + " , " + r_g.getY() + " )");
				g.accept(new ConcreteVisitorDisparoAliado(this));
				break;
			}
			
		}
		avanzar();
	}

	/**
	 * Acepta un visitor.
	 * @param v Un visitor.
	 */
	@Override
	public void accept(Visitor v) {
		v.visitDisparo(this);
	}
	
	@Override
	public void morir() {
		grafica.morir();
		nivel.eliminarObjeto(this);
	}
}
