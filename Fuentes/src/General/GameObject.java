package General;
/**
 * Modela todos los objetos del juego: premios, personajes y objetos.
 * @author Comisión 25 (FERNÁNDEZ, LATOUQUETTE, LÓPEZ)
 * @version 1.0
 */

public abstract class GameObject {
	protected int posicion_x, posicion_y, tamano_x, tamano_y;
	protected String textura;
	
	// MÉTODOS
	/**
	 * Devuelve la posición en el eje x del objeto
	 * @return la posición en el eje x del objeto
	 */
	public int getPosicion_x() {
		return posicion_x;
	}
	
	/**
	 * Asigna una nueva posición en el eje x del objeto
	 * @param posicion_x La nueva coordenada x del objeto
	 */
	public void setPosicion_x(int posicion_x) {
		this.posicion_x = posicion_x;
	}

	/**
	 * Devuelve la posición en el eje y del objeto
	 * @return la posición en el eje y del objeto
	 */
	public int getPosicion_y() {
		return posicion_y;
	}

	/**
	 * Asigna una nueva posicion en el eje y del objeto
	 * @param posicion_y La nueva coordenada y del objeto
	 */
	public void setPosicion_y(int posicion_y) {
		this.posicion_y = posicion_y;
	}

	/**
	 * Devuelve la cantidad de filas que ocupa el objeto
	 * @return La cantidad de filas que ocupa el objeto
	 */
	public int getTamano_x() {
		return tamano_x;
	}

	/**
	 * Asigna un nuevo tamaño de cantidad de filas que ocupa el objeto
	 * @param tamano_x El nuevo tamaño de cantidad de filas que ocupa el objeto
	 */
	public void setTamano_x(int tamano_x) {
		this.tamano_x = tamano_x;
	}
	
	/**
	 * Devuelve la cantidad de columnas que ocupa el objeto
	 * @return La cantidad de columnas que ocupa el objeto
	 */
	public int getTamano_y() {
		return tamano_y;
	}

	/**
	 * Asigna un nuevo tamaño de cantidad de columnas que ocupa el objeto
	 * @param tamano_y El nuevo tamaño de cantidad de columnas que ocupa el objeto
	 */
	public void setTamano_y(int tamano_y) {
		this.tamano_y = tamano_y;
	}

	/**
	 * Devuelve la dirección en el disco de la textura del objeto
	 * @return La dirección en el disco de la textura del objeto
	 */
	public String getTextura() {
		return textura;
	}

	/**
	 * Asigna una nueva dirección en el disco donde buscar la textura del objeto
	 * @param textura La nueva dirección en el disco donde buscar la textura del objeto
	 */
	public void setTextura(String textura) {
		this.textura = textura;
	}
}
