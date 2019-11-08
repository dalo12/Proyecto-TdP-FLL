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
	protected Nivel nivel;
	protected int dificultad; //dificultad de la oleada
	protected static final int CANT_DERROTA = 3; //Cantidad de kangaroo que deben entrar a la torre para perder
	protected List<GameObject> invaden;
	protected int cant_objetos;
	protected boolean en_juego;
	
	public Juego() {
		dificultad = 1;		
		nivel = new Nivel(new MapaGrafico("", null), 200);
		en_juego = true;
	}
	
	/**
	 * Devuelve el nivel actual del juego en ejecución
	 * @return El nivel actual del juego en ejecución
	 */
	public Nivel getNivel() {
		return nivel;
	}
	
	/**
	 * Acciona todos los elementos del mapa
	 */
	public synchronized void accionar() {
		if(cant_objetos > nivel.getListaEntidades().size()) {
			for(GameObject g : nivel.getListaEntidades()) {
				g.setNivel(nivel);
			}
			cant_objetos = nivel.getListaEntidades().size();
		}
		
		for(GameObject g : nivel.getListaEntidades()) {		
			g.accionar();
			
			if(invade(g) && !invaden.contains(g)) {
				invaden.add(g);
			}
		}
		
		//Si me quedo sin enemigos, inserto nueva oleada
		if ((nivel.getEnemigosRestantes() == 0) && (nivel.getOleadasFaltantes()>0)) {
			nivel.insertarOleada(dificultad);
		}
		
		//Si el juego no tiene mas enemigos y no tiene mas oleadas, el juego terminó y el usuario ganó
		if ((nivel.getEnemigosRestantes()==0) && (nivel.getOleadasFaltantes()==0)) {
			//Jugador a ganado
			JOptionPane.showMessageDialog(null, "HA GANADO EL JUEGO");
			//Detiene el hilo del contador
			en_juego = false;
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
	 * Crea un nivel
	 * @param mapa Mapa del nivel
	 * @param monedas Monedas con las que se empieza el nivel
	 * @return Nuevo nivel creado
	 */
	public Nivel crearNivel(MapaGrafico mapa, int monedas) {
		nivel = new Nivel(mapa, monedas);
		invaden = new LinkedList<GameObject>();
		cant_objetos = 0;
		return nivel;
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
		boolean esta_dentro_x = o.getPosicionX() < (nivel.getMapa().getTorre().getX()+nivel.getMapa().getTorre().getWidth());
		boolean esta_dentro_arriba = o.getPosicionX() >= nivel.getMapa().getTorre().getY();
		boolean esta_dentro_abajo = (o.getPosicionY() + o.getGrafica().getLabel().getHeight()) <= (nivel.getMapa().getTorre().getY() + nivel.getMapa().getTorre().getHeight()); 
		return esta_dentro_x && esta_dentro_arriba && esta_dentro_abajo;
	}
}
