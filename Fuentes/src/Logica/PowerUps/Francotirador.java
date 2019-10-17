package Logica.PowerUps;

import Logica.General.Enemigo;
import Logica.General.Premio;

/**
 * Modela el powerup 'Francotirador'
 * @author Comisión 25 (FERRANTE, LATOUQUETTE, LÓPEZ)
 * @version 1.0
 */
public class Francotirador extends Premio {
	
	public Francotirador() {
		duracionEnMapa = 10;
		duracionActivo = 0;
		activo = false;
	}

	@Override
	protected void aplicarEfecto(Enemigo enemigo) {
		// TODO Auto-generated method stub
		
	}
	
}
