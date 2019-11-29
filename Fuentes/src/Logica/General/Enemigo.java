package Logica.General;

import java.awt.Rectangle;
import java.util.Random;

import Logica.General.Visitors.Visitor;
import Logica.PowerUps.*;

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
		int to_return = r.nextInt(maxMonedas) + 20;
		return to_return;
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
		if(contador_tiempo <= 0) {
			grafica.atacar();
			o.setVida(o.getVida() - fuerzaAtaque);
			contador_tiempo = velocidadAtaque * 25;
		}
	}
	
	/**
	 * Ataca a un objeto
	 * @param o El objeto a atacar
	 */
	public void atacar(Objeto o) {
		if(contador_tiempo <= 0) {
			grafica.atacar();
			o.setVida(o.getVida() - fuerzaAtaque);
			contador_tiempo = velocidadAtaque * 25;
		}
	}
	
	public void accept(Visitor v) {
		v.visitEnemigo(this);
	}

	public boolean puedeDisparar(GameObject go) {
		boolean a_retornar = false;
		
		Rectangle r_this, r_go;
		r_this = new Rectangle(this.posicionX - this.getGrafica().getLabel().getWidth()*this.tamanoX, this.posicionY, this.getGrafica().getLabel().getWidth()*this.tamanoX, this.getGrafica().getLabel().getY());
		r_go = new Rectangle(go.getPosicionX(), go.getPosicionY(), go.getGrafica().getLabel().getX(), go.getGrafica().getLabel().getY());
		
		if(r_this.intersects(r_go) && (go.getGrafica().getLabel().getX() < this.grafica.getLabel().getX())) {
			a_retornar = true;
		}
		
		return a_retornar;
	}
	
	@Override
	public void accionar() {
		contador_tiempo--;
		boolean puedeAvanzar = true;
		for(GameObject g : nivel.getListaEntidades()) {
			if (g!=null) {
				if(this.chocan(g)) {
					interactuar(g);
					puedeAvanzar = false;
				}
			}
		}
		if(puedeAvanzar)
			avanzar();
		if(vida <= 0) {
			morir();
		}
	}
	
	@Override
	public void morir() {
		nivel.setEnemigosRestantes(nivel.getEnemigosRestantes() - 1);
		nivel.eliminarObjeto(this);
		nivel.agregarMonedas(this.getMonedas());
		nivel.agregarPuntaje(puntaje);
		grafica.morir();
		soltarPowerUp();
	}
	
	// ----- MÉTODOS AUXILIARES ----- //
	
	protected void soltarPowerUp() {
		Random r = new Random();
		int indice = r.nextInt(5000);
		
		if(indice < 25) {
			new Bombardeo(this.posicionX, this.posicionY, this.nivel); 
		}else if(indice < 75) {
			new Francotirador(this.posicionX, this.posicionY, this.nivel);
		}else if(indice < 200) {
			new SanLugano(this.posicionX, this.posicionY, this.nivel);
		}else if(indice < 350) {
			new Mate(this.posicionX, this.posicionY, this.nivel);
		}else if(indice < 600) {
			new GarraCharrua(this.posicionX, this.posicionY, this.nivel);
		}
	}
}
