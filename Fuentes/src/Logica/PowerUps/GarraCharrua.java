package Logica.PowerUps;

import GUI.Component_Custom.ImageIcon.PowerUps.TexturaGarraCharrua;
import GUI.Controlador.GOGrafico;
import Logica.General.Enemigo;
import Logica.General.Nivel;
import Logica.General.Premio;
import Logica.General.Visitors.ConcreteVisitorPremio;

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

		//Grafico de GOGrafico
		this.grafica = new GOGrafico(x, y, tamanoX, tamanoY, new TexturaGarraCharrua(), n.getMapa());
		
		//atributos lógicos
		duracionEnMapa = 10;
		duracionActivo = 60;
		activo = false;
		
		visitor = new ConcreteVisitorPremio(null, null, null, y);
	}

	@Override
	protected void aplicarEfecto(Enemigo enemigo) {
		// TODO Auto-generated method stub
		
	}
	
}
