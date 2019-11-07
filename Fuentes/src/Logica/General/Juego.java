package Logica.General;

import GUI.Mapa.PanelMapa;

/**
 * Modela el juego
 * @author Comisión 25 (FERRANTE, LATOUQUETTE, LÓPEZ)
 * @version 1.0
 */
public class Juego {	
	protected Nivel nivel;
	protected int dificultad; //dificultad de la oleada
	
	public Juego() {
		dificultad = 1;		
		nivel = new Nivel(null);
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
		for(GameObject g : nivel.getListaEntidades()) {
			g.setNivel(nivel);
			g.accionar();
		}
		if ((nivel.getEnemigosRestantes() == 0) && (nivel.getOleadasFaltantes()>0)) {
			nivel.insertarOleada(dificultad);
		}
	}
	
	/**
	 * Crea un nivel
	 * @param mapa Mapa del nivel
	 * @return Nuevo nivel creado
	 */
	public Nivel crearNivel(PanelMapa mapa) {
		nivel = new Nivel(mapa);
		return nivel;
	}
}
