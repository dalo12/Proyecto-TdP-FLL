package Logica.General;

/**
 * Modela los powerups
 * @author Comisión 25 (FERRANTE, LATOUQUETTE, LÓPEZ)
 * @version 1.0
 */
public abstract class Premio extends GameObject {
	
	protected int duracionEnMapa;
	protected int duracionActivo;
	protected boolean activo;
	
	public void activar() {
		//TODO debe recorrer todos los objetos del juego enviando su visitor.
	}
	
}
