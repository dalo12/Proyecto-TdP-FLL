package Logica.General;
import java.util.LinkedList;
import java.util.List;

import GUI.Mapa.LabelTablero;
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
	protected Nivel nivel;
	protected int dificultad; //dificultad de la oleada
	//Atributos para tienda
	protected int monedas;
	protected int puntaje;
	
	public Juego() {
		dificultad = 1;
		monedas = 0;
		puntaje = 0;
		
		/*
		 * Agrego lista de aliados seleccionables al nivel 1
		 */
//		List<GameObject> lista_aliados_1 = new LinkedList<GameObject>();
//		List<ButtonPersonaje> lista_botones_1 = new LinkedList<ButtonPersonaje>();
//		
//		lista_aliados_1.add(new KnifeSoldier(0,0));
//		lista_aliados_1.add(new PistolSoldier(0,0));
//		lista_aliados_1.add(new SniperSoldier(0,0));
//		lista_aliados_1.add(new CercaAntiTanque(0,0));
//		
//		lista_botones_1.add(new ButtonKnifeSoldier());
//		lista_botones_1.add(new ButtonPistolSoldier());
//		lista_botones_1.add(new ButtonSniperSoldier());
//		lista_botones_1.add(new ButtonCercaAntiTanque());
//		
		
		nivel = new Nivel(null);
		/*
//		 * Agrego lista de aliados seleccionables al nivel 2
//		 */
//		List<GameObject> lista_aliados_2 = new LinkedList<GameObject>();
//		List<ButtonPersonaje> lista_botones_2 = new LinkedList<ButtonPersonaje>();
//		
//		lista_aliados_2.add(new KnifeSoldier(0,0));
//		lista_aliados_2.add(new PistolSoldier(0,0));
//		lista_aliados_2.add(new SniperSoldier(0,0));
//		lista_aliados_2.add(new BazookaSoldier(0,0));
//		lista_aliados_2.add(new AllterrainMachinegun(0,0));
//		lista_aliados_2.add(new CercaAntiTanque(0,0));
//		
//		lista_botones_2.add(new ButtonKnifeSoldier());
//		lista_botones_2.add(new ButtonPistolSoldier());
//		lista_botones_2.add(new ButtonSniperSoldier());
//		lista_botones_2.add(new ButtonBazookaSoldier());
//		lista_botones_2.add(new ButtonAllterrainMachinegun());
//		lista_botones_2.add(new ButtonCercaAntiTanque());
//		
//		nivel[1] = new Nivel(lista_aliados_2, lista_botones_2);
	}
	
	/**
	 * Devuelve el nivel actual del juego en ejecución
	 * @return El nivel actual del juego en ejecución
	 */
	public Nivel getNivel() {
		return nivel;
	}
	
	/**
	 * @return Las monedas que dispone el usuario
	 */
	public int getMonedas() {
		return monedas;
	}
	
	/**
	 * @return El puntaje que dispone el usuario
	 */
	public int getPuntaje() {
		return puntaje;
	}
	
	/**
	 * Acciona todos los elementos del mapa
	 */
	public void accionar() {
		for(GameObject g : nivel.getListaEntidades()) {
			g.accionar();
//			for(GameObject o : nivel.getListaEntidades()) {
//				if(g != o && !g.chocan(o)) {
//					g.accionar();
//				}
//			}
		}
		if(nivel.getEnemigosRestantes() == 0) {
			nivel.insertarOleada(dificultad);
		}
	}
	
	/**
	 * Asigna un nuevo valor a las monedas que dispone el usuario
	 * @param m Nueva cantidad de monedas
	 */
	public void setMonedas(int m) {
		this.monedas = m;
	}
	
	/**
	 * Asigna un nuevo valor al puntake del usuario
	 * @param p Nuevo puntaje
	 */
	public void setPuntaje(int p) {
		this.puntaje = p;
	}
	
	/**
	 * Inserta un aliado u objeto en el nivel (de manera lógica)
	 * @param a Aliado a insertar
	 */
	public void insertarAliado(GameObject a) {
		nivel.insertarObjeto(a);
	}
	
	/**
	 * Crea un nivel
	 * @param mapa Mapa del nivel
	 * @return Nuevo nivel creado
	 */
	public Nivel crearNivel(LabelTablero mapa) {
		nivel = new Nivel(mapa);
		return nivel;
	}
	
//	public Enemigo removerEnemigo() {
//		Enemigo toReturn = (Enemigo) enemigo;
//		
//		monedas = monedas + toReturn.getMonedas();
//		puntaje = puntaje + toReturn.getPuntaje();
//		
//		enemigo = null;
//		return toReturn;
//	}
}
