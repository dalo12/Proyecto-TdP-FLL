package Logica.PowerUps;

import java.awt.Color;
import java.util.LinkedList;

import GUI.Component_Custom.ImageIcon.PowerUps.TexturaMate;
import GUI.Controlador.GOGrafico.GOGraficoPremio;
import Logica.General.Enemigo;
import Logica.General.GameObject;
import Logica.General.Nivel;
import Logica.General.Premio;
import Logica.General.Visitors.VisitorsPremios.VisitorMate;
import Logica.General.Visitors.VisitorsPremios.VisitorMateRetirar;

/**
 * Modela el powerup 'Mate'
 * @author Comisión 25 (FERRANTE, LATOUQUETTE, LÓPEZ)
 * @version 1.0
 */
public class Mate extends Premio {
	
	public Mate(int x, int y, Nivel n) {
		super(n);
		//atributos físicos
		this.posicionX = x;
		this.posicionY = y;
		this.tamanoX = 1;
		this.tamanoY = 1;
		
		//Grafico de GOGrafico
		this.grafica = new GOGraficoPremio(x, y, tamanoX, tamanoY, new TexturaMate(), n.getMapa());
		this.grafica.getLabel().addMouseListener(new PremioActivado(this));	
		
		//atributos lógicos
		duracionEnMapa = 10;
		duracionActivo = 120;
		
		visitor = new VisitorMate();
		visitor_retirar_efecto = new VisitorMateRetirar();
		
			
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
		enemigo.setAlcance(enemigo.getAlcance() * 2);
		enemigo.getGrafica().getLabel().setBackground(new Color(0, 255, 0, 50));
		enemigo.getGrafica().getLabel().setOpaque(true);
	}
	
}
