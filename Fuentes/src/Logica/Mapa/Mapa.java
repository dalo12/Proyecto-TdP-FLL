package Logica.Mapa;

import java.util.LinkedList;
import java.util.List;

import GUI.Mapa.LabelPersonaje;
import Logica.General.Entidad;

/**
 * Clase Mapa
 * @author Comisión 25 (FERNÁNDEZ, LATOUQUETTE, LÓPEZ)
 * @version 2.0
 */
public class Mapa {
	//Atributos de instancia
	protected LabelPersonaje[][] matriz;
	protected int width, height;
	protected String textura;
	protected int[][] limites;
	
	/**
	 * Constructor de Mapa
	 * @param textura Ruta hacia la textura del mapa.
	 * @param width Ancho del mapa.
	 * @param height Altura del mapa.
	 */
	public Mapa(String textura, int width, int height) {
		this.matriz = new LabelPersonaje[height][width];
		this.height = height;
		this.width = width;
		this.textura = textura;
		
		for (int i=0; i<height; i++) {
			for (int j=0; j<width; j++) {
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
	public LabelPersonaje[][] getMapa(){
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
	
	/**
	 * Asigna los límites derechos desde donde surgen los enemigos
	 * @param l Matriz de ix2 con la primera componente con las coordenadas x de los límites
	 * y la segunda componente con las coordenadas y de los límites
	 */
	public void setLimites(int[][] l) {
		this.limites = l;
	}
	
	/**
	 * Retorna los límites derechos desde donde surgen los enemigos
	 * @return Un arreglo de ix2 con la primera componente con la coordenada x y la segunda componente
	 * con la coordenada y de los límites
	 */
	public int[][] getLimites(){
		return limites;
	}
}