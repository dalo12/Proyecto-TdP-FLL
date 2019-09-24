package Logica.General;

import java.util.List;

/**
 * Modela los powerups
 * @author Comisión 25 (FERRANTE, LATOUQUETTE, LÓPEZ)
 * @version 1.0
 */
public abstract class Premio extends GameObject {
	protected int duracion;
	
	/**
	 * Aplica el efecto del powerup en un cada uno de las entidades de la lista
	 * @param lista Lista de entidades a la que aplicar el efecto
	 */
	public abstract void aplicarEfecto(List<Entidad> lista);
	
	/**
	 * Aplica el efecto del powerup en una entidad en especial
	 * @param e Entidad a la que aplicar el efecto
	 */
	public abstract void aplicarEfecto(Entidad e);
}
