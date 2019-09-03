package Mapa;

import java.util.LinkedList;
import java.util.List;

import General.GameObject;

/**
 * 
 * @author Comisión 25 (FERNÁNDEZ, LATOUQUETTE, LÓPEZ)
 * @version 1.0
 */
public class Mapa {
	//Atributos de instancia
	protected Celda[][] matriz;
	protected String textura;
	
	/**
	 * Constructor de Mapa
	 * @param textura Directorio donde se ubica la textura del mapa.
	 */
	public Mapa(String textura) {
		this.textura = textura;
	}

	//GETTERS
	/**
	 * Devuelve una lista de GameObject que aparecen en el mapa.
	 * @return Lista de GameObject.
	 */
	public List<GameObject> recorrerGrilla(){
		List<GameObject> toReturn = new LinkedList<GameObject>();
		
		return toReturn;
	}
	
}
