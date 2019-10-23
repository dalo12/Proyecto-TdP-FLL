package Logica.General;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import Logica.Enemigos.*;
import Logica.PowerUps.*;
import Logica.Tienda.Aliados.ButtonPersonaje;

/**
 * Modela los niveles
 * @author Comisión 25 (FERRANTE, LATOUQUETTE, LÓPEZ)
 * @version 2.0
 */
public class Nivel {
	protected List<ButtonPersonaje> botones_aliados;
	protected List<GameObject> entidades;
//	protected int max_enemigos;
//	protected int enemigos_restantes;
	
	/**
	 * Constructor
	 * @param aliados Posibles aliados que se pueden insertar?
	 * @param botones_aliados Botones de los aliados que se pueden insertar
	 */
	public Nivel(List<GameObject> aliados, List<ButtonPersonaje> botones_aliados) {
		this.botones_aliados = botones_aliados;
		
		entidades = new LinkedList<GameObject>();
	}
	
	
	/**
	 * @return La lista de los aliados y objectos que el jugador puede seleccionar para colocar en el mapa
	 */
	public List<ButtonPersonaje> getPersonajesSeleccionables() {
		return botones_aliados;
	}	
	
	/**
	 * Inserta una oleada de enemigos en la lista de entidades
	 * @param dificultad La dificultad de la oleada a insertar
	 */
	public void insertarOleada(int dificultad) {
		for(Enemigo e : this.getOleada(dificultad)) {
			entidades.add(e);
		}
	}
	
	/**
	 * Insertar un objeto en la lista de entidades
	 * @param o Objeto a insertar
	 */
	public void insertarObjeto(GameObject o) {
		entidades.add(o);
	}
	
	/**
	 * @return La lista de entidades
	 */
	public List<GameObject> getListaEntidades(){
		return this.entidades;
	}
	
	/**
	 * Crea una oleada con enemigos generados totalmente al azar, con una dificultad pasada por parámetro
	 * @param dificultad Dificultad de los enemigos, entre 0..5 
	 * @return Lista de enemigos (oleada)
	 */
	protected List<Enemigo> getOleada(int dificultad){
		List<Enemigo> lista = new LinkedList<Enemigo>();
		Random r = new Random();
		int cantidad = r.nextInt(10) + 20; //genera entre 20 y 30 enemigos
		int poder = r.nextInt(100); //genera un número al azar para saber si aplicar o no un poder en el enemigo
		int distancia = 0;
//		max_enemigos = cantidad;
		
		int[][] limites = new int[10][6];
		
		int coordenadas_y[] = new int[limites[0].length];
		int coordenada_x = limites[0][0];
		
		for(int i=0; i<limites[0].length; i++) {
			coordenadas_y[i] = limites[i][1];
		}
		
		/*
		 * Generamos los enemigos totalmente al azar
		 */
		for(int i=0; i<=cantidad; i++) {
			int j = r.nextInt(coordenadas_y.length-1); //para saber en qué coordenada "y" poner el enemigo
			int dif = r.nextInt(dificultad); //dif es la nueva dificultad de los enemigos
											// se generan enemigos tan difíciles entre 0..dificultad
			
			switch(dif) {
				case 0:{
					lista.add(new Kangaroo(coordenada_x+distancia, coordenadas_y[j]));
					break;
				}
				case 1:{
					lista.add(new BoxKangaroo(coordenada_x+distancia, coordenadas_y[j]));
					break;
				}
				case 2:{
					lista.add(new KnifeKangaroo(coordenada_x+distancia, coordenadas_y[j]));
					break;
				}
				case 3:{
					lista.add(new PistolKangaroo(coordenada_x+distancia, coordenadas_y[j]));
					break;
				}
				case 4:{
					lista.add(new FlamethrowerKangaroo(coordenada_x+distancia, coordenadas_y[j]));
					break;
				}
				default:{
					lista.add(new TankGaroo(coordenada_x+distancia, coordenadas_y[j]));
					break;
				}
			}
			
			/*
			 * Cada tanto los enemigos se alejan 
			 */
			distancia += 10;
			if(i % 7 == 0) {
				distancia += 200; //los números 7 y 200 es totalmente arbitrario.
				/*
				 * Cada 7 enemigos, los enemigos se alejan del mapa, para que no aparezcan 30 monos de golpe
				 */
			}
			
			/*
			 * Cada tanto aparece un enemigo con un powerup implementado sobre si 
			 */
			if(poder == 5) { //el número 5 es totalmente arbitrario
				switch(i % 3) { //porque 3 son los powerups
					case 0:{
						Premio p = new Mate();
						p.aplicarEfecto(lista.get(lista.size() - 1));
						break;
					}
					case 1:{
						Premio p = new SanLugano();
						p.aplicarEfecto(lista.get(lista.size() - 1));
						break;						
					}
					case 2:{
						Premio p = new GarraCharrua();
						p.aplicarEfecto(lista.get(lista.size() - 1));
						break;
					}					
				}
			}
		}
		
		return lista;
	}
}