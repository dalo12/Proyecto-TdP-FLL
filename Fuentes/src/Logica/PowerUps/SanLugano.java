package Logica.PowerUps;

import java.awt.Color;
import java.util.LinkedList;

import GUI.Component_Custom.ImageIcon.PowerUps.TexturaSanLugano;
import GUI.Controlador.GOGrafico.GOGrafico;
import Logica.General.Enemigo;
import Logica.General.GameObject;
import Logica.General.Nivel;
import Logica.General.Premio;
import Logica.General.Visitors.VisitorsPremios.VisitorSanLugano;
import Logica.General.Visitors.VisitorsPremios.VisitorSanLuganoRetirar;

/**
 * Modela el powerup 'SanLugano'
 * @author Comisión 25 (FERRANTE, LATOUQUETTE, LÓPEZ)
 * @version 1.0
 */
public class SanLugano extends Premio {
	
	public SanLugano(int x, int y, Nivel n) {
		super(n);
		//atributos físicos
		this.posicionX = x;
		this.posicionY = y;
		this.tamanoX = 1;
		this.tamanoY = 1;
		
		//Grafico de GOGrafico
		this.grafica = new GOGrafico(x, y, tamanoX, tamanoY, new TexturaSanLugano(), n.getMapa());
		
		//atributos lógicos
		duracionEnMapa = 10;
		duracionActivo = 240;
		
		visitor = new VisitorSanLugano();
		visitor_retirar_efecto = new VisitorSanLuganoRetirar();
		
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
		// TODO Falta inventar el efecto
		enemigo.getGrafica().getLabel().setBackground(new Color(0, 0, 255, 50));
	}

}
