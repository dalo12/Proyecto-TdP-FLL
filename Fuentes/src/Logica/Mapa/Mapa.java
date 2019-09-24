package Logica.Mapa;

import java.util.LinkedList;
import java.util.List;

import Logica.General.GameObject;

/**
 * Clase Mapa
 * @author Comisión 25 (FERNÁNDEZ, LATOUQUETTE, LÓPEZ)
 * @version 2.0
 */
public class Mapa {
	//Atributos de instancia
	protected Celda[][] matriz;
	protected int width, height;
	protected String textura;
	
	/**
	 * Constructor de Mapa
	 * @param textura Ruta hacia la textura del mapa.
	 * @param width Ancho del mapa.
	 * @param height Altura del mapa.
	 */
	public Mapa(String textura, int width, int height) {
		this.matriz = new Celda[width][height];
		this.height = height;
		this.width = width;
		this.textura = textura;
		
		for (int i=0; i<width; i++) {
			for (int j=0; j<height; j++) {
				matriz[i][j] = null;
			}
		}
	}

	//GETTERS
	/**
	 * Devuelve una lista de GameObject que aparecen en el mapa.
	 * @return Lista de GameObject.
	 */
	public List<GameObject> recorrerGrilla(){
		List<GameObject> toReturn = new LinkedList<GameObject>();
		
		for (int i=0; i<width; i++) {
			for (int j=0; j<height; j++) {
				if (matriz[i][j].estaOcupado()) {
					toReturn.add(matriz[i][j].getObjeto());
				}
			}
		}
		
		return toReturn;
	}

	/**
	 * Devuelve el conjunto de celdas que conforma el mapa
	 * @return Devuelve un arreglo de celdas.
	 */
	public Celda[][] getMapa(){
		return matriz;
	}

	/**
	 * Devuelve el ancho del mapa.
	 * @return Devuelve el ancho del mapa.
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * Devuelve el alto del mapa.
	 * @return Devuelve el alto del mapa.
	 */
	public int getHeight() {
		return height;
	}
	
	/**
	 * Devuelve la textura del mapa.
	 * @return Ruta de la imagen de textura.
	 */
	public String getTextura() {
		return textura;
	}
}