package Logica.General;

import java.util.Random;

import Logica.General.Visitors.Visitor;

/**
 * Modela todos los enemigos del juego.
 * @author Comisión 25 (FERRANTE, LATOUQUETTE, LÓPEZ)
 * @version 1.0
 */
public abstract class Enemigo extends Personaje {

	protected int velocidad, maxMonedas, puntaje;

	/**
	 * Constructor protegido
	 * @param n Nivel al que pertenece el enemigo
	 */
	protected Enemigo(Nivel n) {
		super(n);
	}
	
	/**
	 * Devuelve la velocidad del enemigo
	 * @return La velocidad del enemigo
	 */
	public int getVelocidad() {
		return velocidad;
	}

	/**
	 * Asigna una nueva velocidad de avance al enemigo
	 * @param velocidad La nueva velocidad de avance al enemigo
	 */
	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	/**
	 * Devuelve la cantidad de monedas que el enemigo entrega al morir
	 * @return Las monedas que el enemigo entrega al morir
	 */
	public int getMonedas() {
		Random r = new Random();
		return r.nextInt(maxMonedas) + 10;
	}

	/**
	 * Devuelve el puntaje que el enemigo entrega al ser destruído
	 * @return El puntaje que el enemigo entrega al ser destruído
	 */
	public int getPuntaje() {
		return puntaje;
	}

	/**
	 * Asigna un nuevo puntaje que el enemigo entrega al ser destruído
	 * @param puntaje El nuevo puntaje que el enemigo entrega al ser destruído
	 */
	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}
	
	/**
	 * Hace que el enemigo avance en el mapa
	 */
	public void avanzar() {
		this.posicionX -= this.velocidad;
		grafica.avanzar(posicionX, posicionY);
	}

	/**
	 * Ataca a un aliado (o sea, pesonaje del jugador)
	 * @param a El aliado a atacar
	 */
	public void atacar(Aliado o) {
		o.setVida(o.getVida() - fuerzaAtaque);
	}
	
	/**
	 * Ataca a un objeto
	 * @param o El objeto a atacar
	 */
	public void atacar(Objeto o) {
		o.setVida(o.getVida() - fuerzaAtaque);
	}
	
	public void accept(Visitor v) {
		v.visitEnemigo(this);
	}

	@Override
	public void accionar() {
		boolean puedeAvanzar = true;
		for(GameObject g : nivel.getListaEntidades()) {
//			if(this.chocan(g)) {
			//if(g.getGrafica().getLabel().getX() + g.getGrafica().getLabel().getWidth() == this.grafica.getLabel().getX()) {	
			if((g.getPosicionX() < (posicionX - alcanceAtaque)) ) {//&& g.getPosicionX() < posicionX) {
				interactuar(g);
				//puedeAvanzar = false;
			}
		}
		if(puedeAvanzar)
			avanzar();
	}
	
}
