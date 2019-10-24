package Logica.General;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import GUI.Mapa.LabelTablero;
import Logica.Enemigos.*;
import Logica.PowerUps.*;

/**
 * Modela los niveles
 * @author Comisión 25 (FERRANTE, LATOUQUETTE, LÓPEZ)
 * @version 2.0
 */
public class Nivel {
	protected static final int FILAS = 6;
	
	protected List<GameObject> entidades;
	protected int max_enemigos;
	protected int enemigos_restantes;
	protected LabelTablero mapa;
	
	/**
	 * Constructor
	 * @param mapa Mapa del nivel
	 */
	public Nivel(LabelTablero mapa) {
		entidades = new LinkedList<GameObject>();
		enemigos_restantes = 0;
		this.mapa = mapa;
	}
	
	/**
	 * @return the enemigos_restantes
	 */
	public int getEnemigosRestantes() {
		return enemigos_restantes;
	}
	
	/**
	 * @return El mapa del nivel
	 */
	public LabelTablero getMapa() {
		return this.mapa;
	}
	
	/**
	 * @return La lista de entidades
	 */
	public List<GameObject> getListaEntidades(){
		return this.entidades;
	}
	
	/**
	 * @param enemigos_restantes the enemigos_restantes to set
	 */
	public void setEnemigosRestantes(int n) {
		this.enemigos_restantes = n;
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

	
	// ----- MÉTODOS AUXILIARES -----
	
	/**
	 * Crea una oleada con enemigos generados totalmente al azar, con una dificultad pasada por parámetro
	 * @param dificultad Dificultad de los enemigos, entre 1..6 
	 * @return Lista de enemigos (oleada)
	 */
	protected List<Enemigo> getOleada(int dificultad){
		List<Enemigo> lista = new LinkedList<Enemigo>();
		Random r = new Random();
		int cantidad = r.nextInt(10) + 20; //genera entre 20 y 30 enemigos
		int poder = r.nextInt(100); //genera un número al azar para saber si aplicar o no un poder en el enemigo
		int distancia = 0;
		max_enemigos = cantidad;
		
		//cálculo de las coordenadas dónde colocar los enemigos
		int mapa_ancho = mapa.getSize().width;
		int mapa_alto = mapa.getSize().height;
		
		int coordenadas_y[] = new int[FILAS];
		int coordenada_x = mapa.getX() + mapa_ancho;
		int altura_fila = (int) Math.floor(mapa_alto / FILAS);
		
		coordenadas_y[0] = mapa.getY();
		for(int i=1; i<FILAS; i++) {
			coordenadas_y[i] = coordenadas_y[i-1] + altura_fila;
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