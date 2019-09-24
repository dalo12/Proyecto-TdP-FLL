package Logica.Mapa;

import java.util.LinkedList;
import java.util.List;

import GUI.Mapa.LabelExtendido;
import Logica.General.Entidad;

/**
 * Clase Mapa
 * @author Comisión 25 (FERNÁNDEZ, LATOUQUETTE, LÓPEZ)
 * @version 2.0
 */
public class Mapa {
	//Atributos de instancia
	protected LabelExtendido[][] matriz;
	protected int width, height;
	protected String textura;
	
	/**
	 * Constructor de Mapa
	 * @param textura Ruta hacia la textura del mapa.
	 * @param width Ancho del mapa.
	 * @param height Altura del mapa.
	 */
	public Mapa(String textura, int width, int height) {
		this.matriz = new LabelExtendido[width][height];
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
	 * Devuelve una lista de entidades que aparecen en el mapa.
	 * @return Lista de GameObject.
	 */
	public List<Entidad> recorrerGrilla(){
		List<Entidad> toReturn = new LinkedList<Entidad>();
		
		for (int i=0; i<width; i++) {
			for (int j=0; j<height; j++) {
				if (matriz[i][j]==null) {
					toReturn.add(matriz[i][j].getEntidad());
				}
			}
		}
		
		return toReturn;
	}

	/**
	 * Devuelve el conjunto de LabelExtendidos que conforma el mapa
	 * @return Devuelve un arreglo de LabelExtendidos.
	 */
	public LabelExtendido[][] getMapa(){
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