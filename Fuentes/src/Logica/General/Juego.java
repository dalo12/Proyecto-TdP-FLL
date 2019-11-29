package Logica.General;

import java.util.LinkedList;
import java.util.List;

import javax.swing.JOptionPane;

import GUI.Mapa.MapaGrafico;

/**
 * Modela el juego
 * @author Comisión 25 (FERRANTE, LATOUQUETTE, LÓPEZ)
 * @version 1.0
 */
public class Juego {	
	protected Nivel niveles[];
	protected int dificultad; //dificultad de la oleada
	protected static final int CANT_DERROTA = 5; //Cantidad de kangaroo que deben entrar a la torre para perder
	protected List<GameObject> invaden;
	protected int cant_objetos;
	protected boolean en_juego;
	protected int nro_nivel;
	
	public Juego() {
		dificultad = 1;	
		nro_nivel = 0;
		invaden = new LinkedList<GameObject>();
		niveles = new Nivel[3];
		
		//pseudo creación de niveles (luego se sobreescriben)
		niveles[0] = new Nivel(new MapaGrafico("", null), 200);
		niveles[1] = new Nivel(new MapaGrafico("", null), 500);
		niveles[2] = new Nivel(new MapaGrafico("", null), 1000);
		
		en_juego = true;
	}
	
	/**
	 * Devuelve el nivel actual del juego en ejecución
	 * @return El nivel actual del juego en ejecución
	 */
	public Nivel getNivel() {
		return niveles[nro_nivel];
	}
	
	/**
	 * Crea los niveles del juego
	 * @param mapa Mapa que contendrán los niveles
	 */
	public void crearNiveles(MapaGrafico mapa) {
		niveles[0] = new Nivel(mapa, 200);
		niveles[1] = new Nivel(mapa, 500);
		niveles[2] = new Nivel(mapa, 1000);
	}
	
	/**
	 * Acciona todos los elementos del mapa
	 */
	public synchronized void accionar() {
		if(cant_objetos > niveles[nro_nivel].getListaEntidades().size()) {
			for(GameObject g : niveles[nro_nivel].getListaEntidades()) {
				g.setNivel(niveles[nro_nivel]);
			}
			cant_objetos = niveles[nro_nivel].getListaEntidades().size();
		}
		
		for(GameObject g : niveles[nro_nivel].getListaEntidades()) {		
			g.accionar();
			
			//Esto es para verificar si algún enemigo llegó a la torre
			if(invade(g) && !invaden.contains(g)) {
				invaden.add(g);
			}
		}
		//Cuando termino la iteración sobre la lista, agrego y borro los objetos que debo
		//(si esto lo permito en medio de la iteración, se rompe todo)
		niveles[nro_nivel].getListaEntidades().addAll(niveles[nro_nivel].getAAnadir());
		niveles[nro_nivel].getListaEntidades().removeAll(niveles[nro_nivel].getABorrar());
		//Si no vacío las listas, añade infinitamente los mismos objetos que ya estaban antes
		niveles[nro_nivel].vaciarAAnadir();
		niveles[nro_nivel].vaciarABorrar();
		
		//Si me quedo sin enemigos, inserto nueva oleada
		if ((niveles[nro_nivel].getEnemigosRestantes() == 0) && (niveles[nro_nivel].getOleadasFaltantes()>0)) {
			niveles[nro_nivel].insertarOleada(dificultad);
			dificultad++;
		}
		
		//Si el nivel no tiene más enemigos y no tiene mas oleadas, el nivel terminó y el usuario ganó el nivel
		if ((niveles[nro_nivel].getEnemigosRestantes()==0) && (niveles[nro_nivel].getOleadasFaltantes()==0)) {
			JOptionPane.showMessageDialog(null, "HA GANADO EL NIVEL! Haz click en 'Aceptar' para pasar al próximo nivel");
			nro_nivel++;
			invaden = new LinkedList<GameObject>();
			//Si no hay más niveles, el usuario ganó el juego
			if(nro_nivel == niveles.length) {
				//Jugador a ganado
				JOptionPane.showMessageDialog(null, "HA GANADO EL JUEGO");
				//Detiene el hilo del contador
				en_juego = false;
			}
		}else {
			//Sino, si entraron al menos CANT_DERROTA enemigos en la torre, el juego terminó y el usuario perdió
			if(invaden.size() >= CANT_DERROTA) { //Si entraron al menos CANT_DERROTA kangaroo en la torre, el jugador pierde
				//Jugador ha perdido
				JOptionPane.showMessageDialog(null, "JUEGO PERDIDO");
				//Detiene el hilo del contador
				en_juego = false;
			}		
		}
				
	}

	/**
	 * @return the en_juego
	 */
	public boolean isEnJuego() {
		return en_juego;
	}

	/**
	 * @param en_juego the en_juego to set
	 */
	public void setEnJuego(boolean en_juego) {
		this.en_juego = en_juego;
	}
	
	/**
	 * @param o Objeto del juego (personaje u objeto) a verificar si está invadiendo la torre
	 * @return Verdadero si el objeto entró a la torre, falso en caso contrario
	 */
	protected boolean invade(GameObject o) {
		boolean esta_dentro_x = o.getPosicionX() < (niveles[nro_nivel].getMapa().getTorre().getX()+niveles[nro_nivel].getMapa().getTorre().getWidth());
		boolean esta_dentro_arriba = o.getPosicionX() >= niveles[nro_nivel].getMapa().getTorre().getY();
		boolean esta_dentro_abajo = (o.getPosicionY() + o.getGrafica().getLabel().getHeight()) <= (niveles[nro_nivel].getMapa().getTorre().getY() + niveles[nro_nivel].getMapa().getTorre().getHeight()); 
		return esta_dentro_x && esta_dentro_arriba && esta_dentro_abajo;
	}
	
	/**
	 * Devuelve las vidas que posee el castillo.
	 * @return Entero que representa las vidas
	 */
	public int getVidas() {
		if ((CANT_DERROTA - invaden.size())>0) {
			return (CANT_DERROTA - invaden.size());
		}
		else {
			return 0;
		}
	}
}
