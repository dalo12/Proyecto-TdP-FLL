package Logica.Mapa;

import Logica.General.GameObject;

public class Celda {
	//Atributos de instancia
	protected int posicion_x, posicion_y;
	protected int tamaño_x, tamaño_y;
	protected boolean ocupado;
	protected GameObject game_obj;
	
	/**
	 * .Constructor de Celda.
	 * @param pos_x Coordenada x de la celda.
	 * @param pos_y Coordenada y de la celda.
	 * @param tamaño_x Tamaño x de la celda.
	 * @param tamaño_y Tamaño y de la celda.
	 */
	public Celda(int pos_x, int pos_y, int tamaño_x, int tamaño_y) {
		this.posicion_x = pos_x;
		this.posicion_y = pos_y;
		this.tamaño_x = tamaño_x;
		this.tamaño_y = tamaño_y;
		game_obj = null;
		ocupado = false;
	}
	
	//SETTERS
	/**
	 * Ocupa la celda con un objeto del juego.
	 * @param go Objeto del juego.
	 */
	public void ocupar(GameObject go) {
		game_obj = go;
		ocupado = true;
	}
	
	/**
	 * Libera la celda del objeto que la ocupe.
	 */
	public void desocupar() {
		game_obj = null;
		ocupado = false;
	}
	
	//GETTERS
	/**
	 * Devuelve la posicion x de la celda.
	 * @return Entero que representa la posicion x
	 */
	public int getPosicionX() {
		return posicion_x;
	}
	
	/**
	 * Devuelve la posicion y de la celda.
	 * @return Entero que representa la posicion y
	 */
	public int getPosicionY() {
		return posicion_y;
	}
	
	/**
	 * Devuelve el tamaño x de la celda
	 * @return Entero que representa el tamaño x
	 */
	public int getTamañoX() {
		return tamaño_x;
	}
	
	/**
	 * Devuelve el tamaño y de la celda
	 * @return Entero que representa el tamaño y
	 */
	public int getTamañoY() {
		return tamaño_y;
	}
	
	/**
	 * Devuelve el objeto del juego insertado en la celda, en caso contrario, devuelve null.
	 * @return Objeto del juego.
	 */
	public GameObject getGameObject() {
		return game_obj;
	}
}
