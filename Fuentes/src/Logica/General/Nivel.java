package Logica.General;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import GUI.Mapa.Coordenada;
import GUI.Mapa.MapaGrafico;
import Logica.Enemigos.*;
import Logica.Objetos.Charco;
import Logica.Objetos.Piedra;
import Logica.PowerUps.*;

/**
 * Clase Nivel: Modela los niveles
 * @author Comisión 25 (FERRANTE, LATOUQUETTE, LÓPEZ)
 * @version 2.0
 */
public class Nivel {
	protected static final int FILAS = 6;
	protected static final int COLUMNAS = 10;
	//a_añadir y a_borrar se utilizan para agregar y borrar elementos de la lista mientras ésta se está recorriendo
	protected List<GameObject> entidades, a_anadir, a_borrar; 
	protected int max_enemigos;
	protected int enemigos_restantes;
	protected MapaGrafico mapa;
	protected int monedas, puntaje;
	protected int oleadas_faltantes;
	
	/**
	 * Constructor
	 * @param mapa Mapa del nivel
	 * @param monedas Monedas con las que se empezará el nivel
	 */
	public Nivel(MapaGrafico mapa, int monedas) {
		this.monedas = monedas;
		puntaje = 0;
		
		oleadas_faltantes=3;
		entidades = new LinkedList<GameObject>();
		a_borrar = new LinkedList<GameObject>();
		a_anadir = new LinkedList<GameObject>();
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
	public MapaGrafico getMapa() {
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
		
		//Aparece una piedra o un charco en el mapa		
		//primero, reconstruyo el tablero para saber dónde meter el objeto		
		boolean hay_alguien = false;
		Random r = new Random();
		int cont = 0; //cuenta la cantidad de veces que trato de buscar un lugar para el objeto
		int coord_x = 0;
		int coord_y = 0;
		
		do {
			hay_alguien = false;
			int pos_random_x = r.nextInt(mapa.getTablero().getWidth());
			int pos_random_y = r.nextInt(mapa.getTablero().getHeight());
			Coordenada coord = mapa.getTablero().getCoordenadaCercana(pos_random_x, pos_random_y);
			
			coord_x = mapa.getTablero().getX() + coord.getX();
			coord_y = mapa.getTablero().getY() + coord.getY();
			
			//me fijo si no hay otro objeto en esas mismas coordenadas
			for(GameObject e : entidades) {
				if(e.getPosicionX() == coord_x && e.getPosicionY() == coord_y) {
					hay_alguien = true;
					break;
				}
			}
			cont++;
		}while(hay_alguien && cont < 20); //si busco un lugar para el objeto más de 20 veces, me rindo
		
		if(!hay_alguien) {
			if(r.nextInt(200) % 2 == 0) {
				//piedra
				entidades.add(new Piedra(coord_x, coord_y, this));
			}else {
				//charco
				entidades.add(new Charco(coord_x, coord_y, this));
			}
		}
		
	}
	
	/**
	 * Devuelve la cantidad de oleadas faltantes
	 * @return Cantidad de oleadas
	 */
	public int getOleadasFaltantes() {
		return oleadas_faltantes;
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
	 * Agrega monedas al total de monedas del nivel
	 * @param m Cantidad de monedas
	 */
	public void agregarMonedas(int m) {
		this.monedas = monedas + m;
	}
	
	/**
	 * Agrega puntos al puntaje total del usuario
	 * @param p Cantidad de puntos
	 */
	public void agregarPuntaje(int p) {
		this.puntaje = puntaje + p;
	}

	/**
	 * Sirve para eliminar un objeto del nivel. Es la manera correcta de eliminar un objeto en la lista
	 * de entidades
	 * @param o Objeto a eliminar
	 */
	public void eliminarObjeto(GameObject o) {
		a_borrar.add(o);
	}

	/**
	 * Sirve para insertar un objeto en el nivel. Es la manera correcta de insertar un objeto en la lista
	 * de entidades
	 * @param o Objeto a insertar
	 */
	public void insertarObjeto(GameObject o) {
		a_anadir.add(o);
	}

	/**
	 * @return the a_anadir
	 */
	public List<GameObject> getAAnadir() {
		return a_anadir;
	}

	/**
	 * @return the a_borrar
	 */
	public List<GameObject> getABorrar() {
		return a_borrar;
	}
	
	/**
	 * Vacía la lista de objetos a añadir
	 */
	public void vaciarAAnadir() {
		a_anadir = new LinkedList<GameObject>();
	}
	
	/**
	 * Vacía la lista de objetos a borrar
	 */
	public void vaciarABorrar() {
		a_borrar = new LinkedList<GameObject>();
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
		
		//int coordenadas_y[] = mapa.getTablero().getPosicionesY();
		int coordenadas_y[] = new int[FILAS];
		int coordenada_x = mapa.getTablero().getX() + mapa_ancho;
		
		coordenadas_y[0] = mapa.getTablero().getY();
		for(int i=1; i<FILAS; i++) {
			coordenadas_y[i] = coordenadas_y[i-1] + mapa.getTablero().getAlturaDeDivision();
		}
		
		//Generamos los enemigos totalmente al azar
		for(int i=0; i<=cantidad; i++) {
			int j = r.nextInt(coordenadas_y.length); //para saber en qué coordenada "y" poner el enemigo
			//dif es la nueva dificultad de los enemigos
			int dif = r.nextInt(dificultad * 10); // se generan enemigos tan difíciles entre 0..dificultad
			
			if(i == 1) {
				distancia = mapa.getHeight();
			}else if(i == 3) {
				distancia = distancia + (distancia / 2);
			}else if(i == 10) {
		    	distancia = distancia + (distancia / 4);
		    }else if(i == 20) {
				distancia = distancia + (distancia / 8);
			}
			
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
			
			//Cada tanto los enemigos se alejan 
			distancia += 10;
			//Cada tanto aparece un enemigo con un powerup implementado sobre si
			//el número 5 es totalmente arbitrario
			if(poder == 5) {
				//porque 3 son los powerups
				switch(i % 3) {
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
	
}