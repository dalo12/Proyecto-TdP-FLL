package Logica.PowerUps;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.LinkedList;

import GUI.Component_Custom.ImageIcon.PowerUps.TexturaFrancotirador;
import GUI.Controlador.GOGrafico.GOGrafico;
import Logica.General.Enemigo;
import Logica.General.GameObject;
import Logica.General.Nivel;
import Logica.General.Premio;
import Logica.General.Visitors.ConcreteVisitorPremio;

/**
 * Modela el powerup 'Francotirador'
 * @author Comisión 25 (FERRANTE, LATOUQUETTE, LÓPEZ)
 * @version 1.0
 */
public class Francotirador extends Premio {
	
	public Francotirador(int x, int y, Nivel n) {
		super(n);
		//atributos físicos
		this.posicionX = x;
		this.posicionY = y;
		this.tamanoX = 1;
		this.tamanoY = 1;

		//Grafico de GOGrafico
		this.grafica = new GOGrafico(x, y, tamanoX, tamanoY, new TexturaFrancotirador(), n.getMapa());
		this.grafica.getLabel().addMouseListener(new PremioActivado(this));
		
		//atributos lógicos
		duracionEnMapa = 10;
		duracionActivo = 0;
		activo = false;
		
		visitor = new ConcreteVisitorPremio(null, null, null, y);
	}

	@Override
	public void accionar() {
		super.accionar();
		if(activo) {
			grafica.morir(); //para que desaparezca del mapa, pero no de la lista de entidades
			if(!ejecutado) {
				ejecutado = true;
				for(GameObject o : nivel.getListaEntidades()) {
					o.accept(visitor); //esto ocupa la lista de empoderados
				}
				
				if(!empoderados.isEmpty()) {
					GameObject a_disparar = empoderados.get(0);
					
					for(GameObject o : empoderados) {
						if(o.getPosicionX() < a_disparar.getPosicionX()) { // busco el enemigo más cerca de la base 
							a_disparar = o;
						}
					}
					
					a_disparar.getGrafica().getLabel().setBackground(new Color(255, 255, 255, 75));
					a_disparar.getGrafica().getLabel().setOpaque(true);
					a_disparar.getGrafica().getLabel().setVisible(true);
					a_disparar.morir(); //mato al enemigo más cercano a la base
				}
				this.morir(); //se termina el premio
			}else {
				duracionActivo--;
			}
		}
	}
	
	@Override
	protected void aplicarEfecto(Enemigo enemigo) {
		// No se aplica sobre enemigos de manera particular
	}
	
}
