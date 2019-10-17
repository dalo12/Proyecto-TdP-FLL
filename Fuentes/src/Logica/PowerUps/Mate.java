package Logica.PowerUps;

import Logica.General.Enemigo;
import Logica.General.Premio;

/**
 * Modela el powerup 'Mate'
 * @author Comisión 25 (FERRANTE, LATOUQUETTE, LÓPEZ)
 * @version 1.0
 */
public class Mate extends Premio {
	
	public Mate() {
		duracionEnMapa = 10;
		duracionActivo = 120;
		activo = false;
	}

	@Override
	protected void aplicarEfecto(Enemigo enemigo) {
		// TODO Auto-generated method stub
		
	}
	
}
