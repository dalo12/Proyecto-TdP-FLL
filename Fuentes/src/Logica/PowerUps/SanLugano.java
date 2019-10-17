package Logica.PowerUps;

import Logica.General.Enemigo;
import Logica.General.Premio;

/**
 * Modela el powerup 'SanLugano'
 * @author Comisión 25 (FERRANTE, LATOUQUETTE, LÓPEZ)
 * @version 1.0
 */
public class SanLugano extends Premio {
	
	public SanLugano() {
		duracionEnMapa = 10;
		duracionActivo = 240;
		activo = false;
	}

	@Override
	protected void aplicarEfecto(Enemigo enemigo) {
		// TODO Auto-generated method stub
		
	}

}
