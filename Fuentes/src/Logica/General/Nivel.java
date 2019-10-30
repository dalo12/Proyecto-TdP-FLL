package Logica.General;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import GUI.Mapa.PanelMapa;
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
	protected PanelMapa mapa;
	
	protected int oleadas_faltantes;
	
	/**
	 * Constructor
	 * @param mapa Mapa del nivel
	 */
	public Nivel(PanelMapa mapa) {
	//public Nivel(LabelTablero mapa) {
		oleadas_faltantes=3;
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
	public PanelMapa getMapa() {
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
		oleadas_faltantes--;
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
		enemigos_restantes = max_enemigos;
		
		//cálculo de las coordenadas dónde colocar los enemigos
		int mapa_ancho = mapa.getTablero().getSize().width;
		//int mapa_alto = mapa.getTablero().getSize().height;
		
		int coordenadas_y[] = mapa.getTablero().getPosicionesY();
		int coordenada_x = mapa.getTablero().getX() + mapa_ancho;
		
		/*
		 * Generamos los enemigos totalmente al azar
		 */
		for(int i=0; i<=cantidad; i++) {
			int j = r.nextInt(coordenadas_y.length); //para saber en qué coordenada "y" poner el enemigo
			int dif = r.nextInt(dificultad * 10); //dif es la nueva dificultad de los enemigos
											// se generan enemigos tan difíciles entre 0..dificultad
			
			if(dif >= 45) {
				lista.add(new TankGaroo(coordenada_x+distancia, coordenadas_y[j], this));
			}else if(dif >= 40) {
				lista.add(new FlamethrowerKangaroo(coordenada_x+distancia, coordenadas_y[j], this));
			}else if(dif >= 30) {
				lista.add(new KnifeKangaroo(coordenada_x+distancia, coordenadas_y[j], this));
			}else if(dif >= 16) {
				lista.add(new PistolKangaroo(coordenada_x+distancia, coordenadas_y[j], this));
			}else if(dif >= 7) {
				lista.add(new BoxKangaroo(coordenada_x+distancia, coordenadas_y[j], this));
			}else if(dif < 7) {
				lista.add(new Kangaroo(coordenada_x+distancia, coordenadas_y[j], this));
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
						Premio p = new Mate(0,0,this);
						p.aplicarEfecto(lista.get(lista.size() - 1));
						break;
					}
					case 1:{
						Premio p = new SanLugano(0,0,this);
						p.aplicarEfecto(lista.get(lista.size() - 1));
						break;						
					}
					case 2:{
						Premio p = new GarraCharrua(0,0,this);
						p.aplicarEfecto(lista.get(lista.size() - 1));
						break;
					}					
				}
			}
		}
		
		return lista;
	}
	
	/**
	 * Devuelve la cantidad de oleadas faltantes
	 * @return Cantidad de oleadas
	 */
	public int getOleadasFaltantes() {
		return oleadas_faltantes;
	}
}