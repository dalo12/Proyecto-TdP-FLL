package Logica.PowerUps;

import GUI.Controlador.GOGrafico;
import Logica.General.Enemigo;
import Logica.General.Nivel;
import Logica.General.Premio;
import Logica.General.Visitors.ConcreteVisitorEnemigo;
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
		
		String [] texturas = new String[5];
		texturas[0] = "../Texturas/Personajes/kangaroo/kangaroo-0.png";
		texturas[1] = "../Texturas/Personajes/kangaroo/kangaroo-1.gif";
		texturas[2] = texturas[3] = texturas[4] = texturas[1];
		this.grafica = new GOGrafico(x, y, tamanoX, tamanoY, texturas, n.getMapa());
		
		//atributos lógicos
		duracionEnMapa = 10;
		duracionActivo = 0;
		activo = false;
		
		visitor = new ConcreteVisitorPremio(null, null, null, y);
	}

	@Override
	protected void aplicarEfecto(Enemigo enemigo) {
		// TODO Auto-generated method stub
		
	}

}
