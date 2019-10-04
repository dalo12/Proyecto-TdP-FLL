package Logica.General;

import javax.swing.JLabel;

/**
 * Modela todos los objetos del juego: premios, personajes y objetos.
 * @author Comisión 25 (FERRANTE, LATOUQUETTE, LÓPEZ)
 * @version 1.0
 */

public abstract class GameObject {
	protected int posicionX, posicionY, tamanoX, tamanoY;
	protected JLabel label;
	protected String textura;
	protected String nombre;
	
	/**
	 * Devuelve la posición en el eje x del objeto
	 * @return la posición en el eje x del objeto
	 */
	public int getPosicionX() {
		return posicionX;
	}
	
	/**
	 * Asigna una nueva posición en el eje x del objeto
	 * @param x La nueva coordenada x del objeto
	 */
	public void setPosicionX(int x) {
		this.posicionX = x;
	}

	/**
	 * Devuelve la posición en el eje y del objeto
	 * @return la posición en el eje y del objeto
	 */
	public int getPosicionY() {
		return posicionY;
	}

	/**
	 * Asigna una nueva posicion en el eje y del objeto
	 * @param y La nueva coordenada y del objeto
	 */
	public void setPosicionY(int y) {
		this.posicionY = y;
	}

	/**
	 * Devuelve la cantidad de filas que ocupa el objeto
	 * @return La cantidad de filas que ocupa el objeto
	 */
	public int getTamanoX() {
		return tamanoX;
	}

	/**
	 * Asigna un nuevo tamaño de cantidad de filas que ocupa el objeto
	 * @param tamanoX El nuevo tamaño de cantidad de filas que ocupa el objeto
	 */
	public void setTamanoX(int tamanoX) {
		this.tamanoX = tamanoX;
	}
	
	/**
	 * Devuelve la cantidad de columnas que ocupa el objeto
	 * @return La cantidad de columnas que ocupa el objeto
	 */
	public int getTamanoY() {
		return tamanoY;
	}

	/**
	 * Asigna un nuevo tamaño de cantidad de columnas que ocupa el objeto
	 * @param tamanoY El nuevo tamaño de cantidad de columnas que ocupa el objeto
	 */
	public void setTamanoY(int tamanoY) {
		this.tamanoY = tamanoY;
	}

	/**
	 * Devuelve el label de este objeto.
	 * @return El label de este objeto.
	 */
	public JLabel getLabel() {
		return label;
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
	
	/**
	 * @return El nombre del objeto en cuestión
	 */
	public String getNombre() {
		return nombre;
	}	
	
	/**
	 * @return Un clon del objeto actual
	 */
	public GameObject clone() {
		return this.clone();
	}
	
}
