package Logica.PowerUps;

import Logica.General.Enemigo;
import Logica.General.Premio;

/**
 * Modela el powerup 'GarraCharrua'
 * @author Comisión 25 (FERRANTE, LATOUQUETTE, LÓPEZ)
 * @version 1.0
 */
public class GarraCharrua extends Premio {
	
	public GarraCharrua() {
		duracionEnMapa = 10;
		duracionActivo = 60;
		activo = false;
	}

	@Override
	protected void aplicarEfecto(Enemigo enemigo) {
		// TODO Auto-generated method stub
		
	}
	
}
