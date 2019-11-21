package Logica.Tienda;

/**
 * Modela entidades comprables que serán usadas en la tienda.
 * @author Comisión 25 (FERRANTE, LATOUQUETTE, LÓPEZ)
 * @version 1.0
 */
public interface EntidadComprable {
	
	/**
	 * @return El precio del objeto, para colocarlo en la tienda
	 */
	public int getPrecio();
	
	/**
	 * Mata a la entidad (porque es necesario crearla al principio para extraer su precio, pero luego
	 * conviene que muera)
	 */
	public void morir();
}
