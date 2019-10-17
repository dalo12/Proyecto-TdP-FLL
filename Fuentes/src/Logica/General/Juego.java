package Logica.General;
import java.util.LinkedList;
import java.util.List;

import Logica.Aliados.*;
import Logica.General.Visitors.Visitor;
import Logica.Objetos.*;
import Logica.Tienda.Aliados.ButtonAllterrainMachinegun;
import Logica.Tienda.Aliados.ButtonBazookaSoldier;
import Logica.Tienda.Aliados.ButtonKnifeSoldier;
import Logica.Tienda.Aliados.ButtonPersonaje;
import Logica.Tienda.Aliados.ButtonPistolSoldier;
import Logica.Tienda.Aliados.ButtonSniperSoldier;
import Logica.Tienda.Objetos.ButtonCercaAntiTanque;

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
		List<ButtonPersonaje> lista_botones_1 = new LinkedList<ButtonPersonaje>();
		
		lista_aliados_1.add(new KnifeSoldier(0,0));
		lista_aliados_1.add(new PistolSoldier(0,0));
		lista_aliados_1.add(new SniperSoldier(0,0));
		lista_aliados_1.add(new CercaAntiTanque(0,0));
		
		lista_botones_1.add(new ButtonKnifeSoldier());
		lista_botones_1.add(new ButtonPistolSoldier());
		lista_botones_1.add(new ButtonSniperSoldier());
		lista_botones_1.add(new ButtonCercaAntiTanque());
		
		nivel[0] = new Nivel(lista_aliados_1, lista_botones_1);
		
		/*
		 * Agrego lista de aliados seleccionables al nivel 2
		 */
		List<GameObject> lista_aliados_2 = new LinkedList<GameObject>();
		List<ButtonPersonaje> lista_botones_2 = new LinkedList<ButtonPersonaje>();
		
		lista_aliados_2.add(new KnifeSoldier(0,0));
		lista_aliados_2.add(new PistolSoldier(0,0));
		lista_aliados_2.add(new SniperSoldier(0,0));
		lista_aliados_2.add(new BazookaSoldier(0,0));
		lista_aliados_2.add(new AllterrainMachinegun(0,0));
		lista_aliados_2.add(new CercaAntiTanque(0,0));
		
		lista_botones_2.add(new ButtonKnifeSoldier());
		lista_botones_2.add(new ButtonPistolSoldier());
		lista_botones_2.add(new ButtonSniperSoldier());
		lista_botones_2.add(new ButtonBazookaSoldier());
		lista_botones_2.add(new ButtonAllterrainMachinegun());
		lista_botones_2.add(new ButtonCercaAntiTanque());
		
		nivel[1] = new Nivel(lista_aliados_2, lista_botones_2);
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
		enemigo.setPosicionX(enemigo.getPosicionX() - 4);
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
