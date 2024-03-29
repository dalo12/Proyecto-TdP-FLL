/**
 * 
 */
package Logica.Disparos;

import java.awt.Rectangle;

import GUI.Component_Custom.ImageIcon.Disparos.TexturaDisparoEnemigo;
import GUI.Controlador.GOGrafico.GOGraficoDisparo;
import Logica.General.Disparo;
import Logica.General.GameObject;
import Logica.General.Nivel;
import Logica.General.Visitors.ConcreteVisitorDisparo;

/**
 * Modela los disparos a por los enemigos realizarse en el juego.
 * @author Comisión 25 (FERRANTE, LATOUQUETTE, LÓPEZ)
 * @version 1.0
 */
public class DisparoEnemigo extends Disparo {

	/**
	 * Constructor
	 * @param x Posición x desde donde se efectúa el disparo
	 * @param y Posición y desde donde se efectúa el disparo
	 * @param alcance Alcance del disparo
	 * @param dano Daño que ejerce el disparo
	 * @param velocidad Velocidad a la que viaja el disparo
	 * @param n Nivel donde se produce el disparo
	 */
	public DisparoEnemigo(int x, int y, int alcance, int dano, int velocidad, Nivel n) {
		super(x, y, alcance, dano, velocidad, n);
		//Grafico de GOGrafico
		this.grafica = new GOGraficoDisparo(x, y, 50, 50, new TexturaDisparoEnemigo(), n.getMapa());
		
		//Agrego el disparo a la lista de entidades
		nivel = n;
		nivel.insertarObjeto(this);
	}
	
	@Override
	public void avanzar() {
		if(posicionX < x_inicial - alcance) {
			morir();
		}else {
			posicionX -= velocidad;
			grafica.avanzar(posicionX, posicionY);
		}
	}

	@Override
	public void accionar() {
		Rectangle r_yo = grafica.getLabel().getBounds();
		for(GameObject g : nivel.getListaEntidades()) {
			Rectangle r_g = g.getGrafica().getLabel().getBounds();
			
			if(r_yo.intersects(r_g)) {
				g.accept(new ConcreteVisitorDisparo(this, dano));
			}
		}
		avanzar();
	}

}
