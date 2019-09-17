package Logica.Mapa;

import java.util.LinkedList;
import java.util.List;

import Logica.General.Enemigo;
import Logica.General.GameObject;

public class CeldaEnemigo extends Celda {
	//Atributos de instancia
	private List<Enemigo> listaEnemigo;
	
	/**
	 * Constructor de CeldaEnemigo
	 * @param pos_x Posición en eje x.
	 * @param pos_y Posición en eje y.
	 */
	public CeldaEnemigo(int pos_x, int pos_y) {
		posicion_x = pos_x;
		posicion_y = pos_y;
		listaEnemigo = new LinkedList<Enemigo>();
	}
	
	/**
	 * Ocupa la celda con un objeto del juego.
	 * @param go Enemigo del juego.
	 */
	public void ocupar(Enemigo go) {
		listaEnemigo.add(go);
	}

	@Override
	public Enemigo desocupar() {
		Enemigo toReturn = listaEnemigo.remove(0);
		return toReturn;
	}

	@Override
	public boolean estaOcupado() {
		return !listaEnemigo.isEmpty();
	}

	@Override
	public GameObject getObjeto() {
		return listaEnemigo.get(0);
	}

}
