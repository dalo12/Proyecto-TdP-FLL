package Logica.Mapa;

import Logica.General.GameObject;

public class CeldaAliado extends Celda {
	//Atributos de instancia
	private GameObject go;
	
	/**
	 * Constructor de CeldaAliado
	 * @param pos_x Posición en eje x.
	 * @param pos_y Posición en eje y.
	 */
	public CeldaAliado(int pos_x, int pos_y) {
		posicion_x = pos_x;
		posicion_y = pos_y;
		go = null;
	}
	
	@Override
	public void ocupar(GameObject go) {
		this.go = go;
	}

	@Override
	public GameObject desocupar() {
		GameObject toReturn = this.go;
		this.go = null;
		return toReturn;
	}

	@Override
	public boolean estaOcupado() {
		return go!=null;
	}

	@Override
	public GameObject getObjeto() {
		return go;
	}

}
