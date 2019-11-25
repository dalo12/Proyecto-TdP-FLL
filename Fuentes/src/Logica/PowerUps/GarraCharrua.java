package Logica.PowerUps;

import java.awt.Color;
import java.util.LinkedList;

import GUI.Component_Custom.ImageIcon.PowerUps.TexturaGarraCharrua;
import GUI.Controlador.GOGrafico.GOGrafico;
import Logica.General.Enemigo;
import Logica.General.GameObject;
import Logica.General.Nivel;
import Logica.General.Premio;
import Logica.General.Visitors.VisitorsPremios.VisitorGarraCharrua;
import Logica.General.Visitors.VisitorsPremios.VisitorGarraCharruaRetirar;

/**
 * Modela el powerup 'GarraCharrua'
 * @author Comisión 25 (FERRANTE, LATOUQUETTE, LÓPEZ)
 * @version 1.0
 */
public class GarraCharrua extends Premio {
	
	public GarraCharrua(int x, int y, Nivel n) {
		super(n);
		//atributos físicos
		this.posicionX = x;
		this.posicionY = y;
		this.tamanoX = 1;
		this.tamanoY = 1;

		this.grafica = new GOGrafico(x, y, tamanoX, tamanoY, new TexturaGarraCharrua(), n.getMapa());
		
		//atributos lógicos
		duracionEnMapa = 10;
		duracionActivo = 60;
		
		visitor = new VisitorGarraCharrua();
		visitor_retirar_efecto = new VisitorGarraCharruaRetirar();
		
	}
	
	@Override
	public void accionar() {
		super.accionar();
		if(activo) {
			grafica.morir(); //para que desaparezca del mapa, pero no de la lista de entidades
			if(!ejecutado) {
				ejecutado = true;
				empoderados = new LinkedList<>(nivel.getListaEntidades());
				for(GameObject o : empoderados) {
					o.accept(visitor);
				}
			}else {
				duracionActivo--;
			}
		}
		if(duracionActivo <= 0) {
			for(GameObject o : empoderados) {
				o.accept(visitor_retirar_efecto);
			}
			this.morir();
		}
	}
	
	@Override
	protected void aplicarEfecto(Enemigo enemigo) {
		enemigo.setFuerza( enemigo.getFuerza() * 2 );
		enemigo.getGrafica().getLabel().setBackground(new Color(255, 0, 0, 50));
		enemigo.getGrafica().getLabel().setOpaque(true);
	}
	
}
