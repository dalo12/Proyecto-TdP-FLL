package Logica.General;

import java.util.Random;

/**
 * Modela todos los enemigos del juego.
 * @author Comisión 25 (FERRANTE, LATOUQUETTE, LÓPEZ)
 * @version 1.0
 */
public abstract class Enemigo extends Personaje {
	protected int velocidad, tope_monedas, puntaje;

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
		return r.nextInt(tope_monedas);
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
		this.posicion_x += this.velocidad;
	}


	/**
	 * Ataca a un aliado (o sea, pesonaje del jugador)
	 * @param a El aliado a atacar
	 */
	public void atacar(Aliado o) {
		if(this.esperar_atacar == 0) {
			o.setVida(o.getVida() - fuerza_ataque);
			esperar_atacar = 500 * velocidad_ataque;
		}else {
			esperar_atacar--;
		}
	}
	
	/**
	 * Ataca a un objeto
	 * @param o El objeto a atacar
	 */
	public void atacar(Objeto o) {
		if(this.esperar_atacar == 0) {
			o.serAtacado(fuerza_ataque);
			esperar_atacar = 500 * velocidad_ataque;
		}else {
			esperar_atacar--;
		}
	}
	
	@Override
	public void actuar() {
		avanzar();
		//atacar();
	}
}
