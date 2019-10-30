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
	//Atributos para tienda
	protected int monedas;
	protected int puntaje;
	
	public Juego() {
		dificultad = 1;
		monedas = 0;
		puntaje = 0;
		
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
	public Nivel crearNivel(PanelMapa mapa) {
		nivel = new Nivel(mapa);
		return nivel;
	}
}
