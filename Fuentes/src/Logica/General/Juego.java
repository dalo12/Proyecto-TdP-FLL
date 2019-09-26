package Logica.General;
import java.util.LinkedList;
import java.util.List;

import Logica.Aliados.*;
import Logica.Objetos.*;

/**
 * Modela el juego
 * @author Comisión 25 (FERRANTE, LATOUQUETTE, LÓPEZ)
 * @version 1.0
 */
public class Juego {	
	protected Nivel nivel[];
	protected Visitor visitor;
	protected List<GameObject> lista;
	//temporal
	protected GameObject enemigo; 
	protected int nivel_actual;
	//Atributos para tienda
	protected int monedas;
	protected int puntaje;
	
	public Juego(GameObject e) {
		enemigo = e;
		
		nivel = new Nivel[2];
		nivel_actual = 0;
		
		monedas = 0;
		puntaje = 0;
		
		/*
		 * Agrego lista de aliados seleccionables al nivel 1
		 */
		List<GameObject> lista_aliados_1 = new LinkedList<GameObject>();
		lista_aliados_1.add(new KnifeSoldier(0,0));
		lista_aliados_1.add(new PistolSoldier(0,0));
		lista_aliados_1.add(new SniperSoldier(0,0));
		lista_aliados_1.add(new CercaAntiTanque(0,0));
		nivel[0] = new Nivel(lista_aliados_1);
		
		/*
		 * Agrego lista de aliados seleccionables al nivel 2
		 */
		List<GameObject> lista_aliados_2 = new LinkedList<GameObject>();
		lista_aliados_2.add(new KnifeSoldier(0,0));
		lista_aliados_2.add(new PistolSoldier(0,0));
		lista_aliados_2.add(new SniperSoldier(0,0));
		lista_aliados_2.add(new BazookaSoldier(0,0));
		lista_aliados_2.add(new AllterrainMachinegun(0,0));
		lista_aliados_2.add(new CercaAntiTanque(0,0));
		nivel[1] = new Nivel(lista_aliados_2);
	}
	
	/**
	 * Devuelve el nivel actual del juego en ejecución
	 * @return El nivel actual del juego en ejecución
	 */
	public Nivel getNivelActual() {
		return nivel[nivel_actual];
	}
	
	//temporal
	public void moverenemigo() {
		enemigo.setPosicion_x(enemigo.getPosicion_x() - 10);
	}
	
	public GameObject getEnemigo() {
		return enemigo;
	}
	
	public void mover() {
//		for(GameObject g : lista)
			
	}
	
	public void insertarAliado() {
		
	}
	
	public void insertarEnemigo() {
		
	}

	public int getMonedas() {
		return monedas;
	}
	
	public int getPuntaje() {
		return puntaje;
	}
	
	public Enemigo removerEnemigo() {
		Enemigo toReturn = (Enemigo) enemigo;
		
		monedas = monedas + toReturn.getMonedas();
		puntaje = puntaje + toReturn.getPuntaje();
		
		enemigo = null;
		return toReturn;
	}
}
