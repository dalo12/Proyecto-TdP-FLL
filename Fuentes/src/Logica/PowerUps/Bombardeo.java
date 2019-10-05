package Logica.PowerUps;

import Logica.General.Premio;

/**
 * Modela el powerup 'Bombardeo'
 * @author Comisión 25 (FERRANTE, LATOUQUETTE, LÓPEZ)
 * @version 1.0
 */
public class Bombardeo extends Premio {
	
	public Bombardeo() {
		duracionEnMapa = 10;
		duracionActivo = 0;
		activo = false;
	}

}
