package Logica.General;

import java.awt.Rectangle;

import GUI.Controlador.GOGrafico.GOGrafico;
import Logica.General.Visitors.Visitor;

/**
 * Clase Abstracta GameObject: Modela todos los objetos del juego: premios, personajes y objetos.
 * @author Comisión 25 (FERRANTE, LATOUQUETTE, LÓPEZ)
 * @version 1.0
 */
public abstract class GameObject {
	protected int posicionX, posicionY, tamanoX, tamanoY;
	protected Visitor visitor;
	protected Nivel nivel;
	protected GOGrafico grafica;
	
	/**
	 * Constructor protegido
	 * @param nivel Nivel actual al cual pertenece el objeto
	 */
	protected GameObject(Nivel nivel) {
		this.nivel = nivel;
	}
	
	/**
	 * Devuelve la posición en el eje x del objeto
	 * @return la posición en el eje x del objeto
	 */
	public int getPosicionX() {
		return posicionX;
	}
	
	/**
	 * Asigna una nueva posición en el eje x del objeto
	 * @param x La nueva coordenada x del objeto
	 */
	public void setPosicionX(int x) {
		this.posicionX = x;
	}

	/**
	 * Devuelve la posición en el eje y del objeto
	 * @return la posición en el eje y del objeto
	 */
	public int getPosicionY() {
		return posicionY;
	}

	/**
	 * Asigna una nueva posicion en el eje y del objeto
	 * @param y La nueva coordenada y del objeto
	 */
	public void setPosicionY(int y) {
		this.posicionY = y;
	}

	/**
	 * Devuelve la cantidad de filas que ocupa el objeto
	 * @return La cantidad de filas que ocupa el objeto
	 */
	public int getTamanoX() {
		return tamanoX;
	}
	
	/**
	 * Asigna un nuevo tamaño de cantidad de filas que ocupa el objeto
	 * @param tamanoX El nuevo tamaño de cantidad de filas que ocupa el objeto
	 */
	public void setTamanoX(int tamanoX) {
		this.tamanoX = tamanoX;
	}
	
	/**
	 * Devuelve la cantidad de columnas que ocupa el objeto
	 * @return La cantidad de columnas que ocupa el objeto
	 */
	public int getTamanoY() {
		return tamanoY;
	}

	/**
	 * Asigna un nuevo tamaño de cantidad de columnas que ocupa el objeto
	 * @param tamanoY El nuevo tamaño de cantidad de columnas que ocupa el objeto
	 */
	public void setTamanoY(int tamanoY) {
		this.tamanoY = tamanoY;
	}
	
	/**
	 * Realiza la accion basica de este objeto, de acuerdo a su rol en el juego.
	 */
	public abstract void accionar();
	
	/**
	 * Interactua con otro objeto del juego por medio de un visitor.
	 * @param o Objeto con el cual interactuar.
	 */
	public void interactuar(GameObject o) {
		o.accept(visitor);
	}
	
	/**
	 * Acepta un visitor.
	 * @param v Un visitor.
	 */
	public abstract void accept(Visitor v);
	
	/**
	 * Elimina este objeto de la lista de entidades del juego.
	 */
	//No es lo mismo que morir()
	public void finalizar() {
		nivel.eliminarObjeto(this);
		grafica.morir();
	}

	/**
	 * @return the grafica
	 */
	public GOGrafico getGrafica() {
		return grafica;
	}

	/**
	 * @param grafica the grafica to set
	 */
	public void setGrafica(GOGrafico grafica) {
		this.grafica = grafica;
	}
	
	/**
	 * Devuelve verdadero si el objeto actual está chocando con el objeto pasado por parámetro, falso en caso contratio 
	 * @param o Objeto con el que posiblemente esté colisionando
	 * @return Verdadero si el objeto actual está chocando con el objeto pasado por parámetro, falso en caso contratio 
	 */
	public boolean chocan(GameObject o) {
		boolean a_retornar = false;
		
		if (o!=null) {
			Rectangle rthis = new Rectangle(this.posicionX, this.posicionY, this.grafica.getLabel().getWidth(), this.grafica.getLabel().getHeight());
			Rectangle ro = new Rectangle(o.getPosicionX(), o.getPosicionY(), o.getGrafica().getLabel().getWidth(), o.getGrafica().getLabel().getHeight());
			if(rthis.intersects(ro) && (o.getPosicionX() < this.posicionX)) {
				a_retornar = true;
			}
		}	
			
		return a_retornar;
	}

	
	/**
	 * Setea el nivel 
	 * @param nivel Nivel
	 */
	public void setNivel(Nivel nivel) {
		this.nivel = nivel;
	}
	
	/**
	 * @return El nivel actual en el que se encuentra el objeto
	 */
	public Nivel getNivel() {
		return this.nivel;
	}
	
	/**
	 * Método que se invoca cuando el objeto muere
	 */
	public void morir() {
		nivel.eliminarObjeto(this);
		grafica.morir();
	}
	
	/**
	 * Devuelve true si invade la torre y falso en caso contrario.
	 * @return Booleano que indica la condicion invadir
	 */
	public abstract boolean invade();
}
