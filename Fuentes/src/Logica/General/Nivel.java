package Logica.General;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import Logica.Enemigos.*;
import Logica.Mapa.Mapa;
import Logica.PowerUps.*;

/**
 * Modela los niveles
 * @author Comisión 25 (FERRANTE, LATOUQUETTE, LÓPEZ)
 * @version 2.0
 */
public class Nivel {
	protected Mapa mapa;
	
	public Nivel() {
	}
	
	/**
	 * Crea una oleada con enemigos generados totalmente al azar, con una dificultad pasada por parámetro
	 * @param dificultad Dificultad de los enemigos, entre 0..5 
	 * @return Lista de enemigos (oleada)
	 */
	public List<Enemigo> getOleada(int dificultad){
		List<Enemigo> lista = new LinkedList<Enemigo>();
		Random r = new Random();
		int cantidad = r.nextInt(10) + 20; //genera entre 20 y 30 enemigos
		int poder = r.nextInt(100); //genera un número al azar para saber si aplicar o no un poder en el enemigo
		int distancia = 0;
		int coordenadas_y[] = new int[6];
		int coordenada_x = 1000; //TODO: en un futuro debe capturarla del mapa
 		//lleno el arreglo de coordenadas "y" TODO: en un futuro tiene que capturarlas del mapa
		coordenadas_y[0] = 100;
		coordenadas_y[1] = 200;
		coordenadas_y[2] = 300;
		coordenadas_y[3] = 400;
		coordenadas_y[4] = 500;
		coordenadas_y[5] = 600;
		
		/*
		 * Generamos los enemigos totalmente al azar
		 */
		for(int i=0; i<=cantidad; i++) {
			int j = r.nextInt(5); //para saber en qué coordenada "y" poner el enemigo
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