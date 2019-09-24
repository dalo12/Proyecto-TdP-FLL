package Logica.Mapa;

import Logica.General.GameObject;

public abstract class Celda {
	//Atributos de instancia
	protected int posicion_x, posicion_y;
	
	//SETTERS
	/**
	 * Ocupa la celda con un objeto del juego.
	 * @param go Objeto del juego.
	 */
	public void ocupar(GameObject go) {}
	
	/**
	 * Libera la celda del objeto que la ocupe.
	 * @return Objeto del juego.
	 */
	public abstract GameObject desocupar();
	
	//GETTERS
	/**
	 * Verifica si la celda está ocupada o libre.
	 * @return True si está ocupada o False en caso contrario.
	 */
	public abstract boolean estaOcupado();
	
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
	 * Devuelve el objeto del juego insertado en la celda, en caso contrario, devuelve null.
	 * @return Objeto del juego.
	 */
	public abstract GameObject getObjeto();
}
