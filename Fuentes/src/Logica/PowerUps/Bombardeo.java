package Logica.PowerUps;

import java.awt.Color;
import java.util.Random;

import GUI.Component_Custom.ImageIcon.PowerUps.TexturaBombardeo;
import GUI.Controlador.GOGrafico.GOGraficoPremio;
import Logica.General.Enemigo;
import Logica.General.GameObject;
import Logica.General.Nivel;
import Logica.General.Premio;
import Logica.General.Visitors.ConcreteVisitorPremio;

/**
 * Modela el powerup 'Bombardeo'
 * @author Comisión 25 (FERRANTE, LATOUQUETTE, LÓPEZ)
 * @version 1.0
 */
public class Bombardeo extends Premio {
	
	public Bombardeo(int x, int y, Nivel n) {
		super(n);
		//atributos físicos
		this.posicionX = x;
		this.posicionY = y;
		this.tamanoX = 1;
		this.tamanoY = 1;
		
		//Grafico de GOGrafico
		this.grafica = new GOGraficoPremio(x, y, tamanoX, tamanoY, new TexturaBombardeo(), n.getMapa());		
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
				Random r = new Random();
				
				for(GameObject o : nivel.getListaEntidades()) {
					if(r.nextInt(20) == 7) { //el número 7 es totalmente arbitrario
						o.getGrafica().getLabel().setBackground(new Color(255, 127, 0, 50));
						o.getGrafica().getLabel().setOpaque(true);
						o.getGrafica().getLabel().setVisible(true);
						for(int i=0;i<50;i++); //para esperar?
						o.morir();
					}
				}
				
				this.morir();
			}else {
				duracionActivo--;
			}
		}
	}
	
	@Override
	protected void aplicarEfecto(Enemigo enemigo) {
		// No es aplicado sobre enemigos de manera particular
	}	

}
