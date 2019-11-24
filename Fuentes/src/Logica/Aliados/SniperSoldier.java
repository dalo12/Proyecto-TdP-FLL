package Logica.Aliados;

import GUI.Component_Custom.ImageIcon.Aliados.TexturaSniperSoldier;
import GUI.Controlador.GOGrafico;
import Logica.Disparos.DisparoAliado;
import Logica.General.Aliado;
import Logica.General.GameObject;
import Logica.General.Nivel;
import Logica.General.Visitors.ConcreteVisitorAliado;

/**
 * Modela al aliado SniperSoldier.
 * @author Comisión 25 (FERRANTE, LATOUQUETTE, LÓPEZ)
 * @version 1.0
 */
public class SniperSoldier extends Aliado {
	
	/**
	 * Constructor
	 * @param x Posición en el eje x del aliado
	 * @param y Posición en el eje y del aliado
	 */
	public SniperSoldier(int x, int y, Nivel n) {
		super(n);
		// atributos físicos
		this.tamanoX = 1;
		this.tamanoY = 1;
		this.posicionX = x;
		this.posicionY = y;
		
		//Grafico de GOGrafico
		this.grafica = new GOGrafico(x, y, tamanoX, tamanoY, new TexturaSniperSoldier(), n.getMapa());
		this.grafica.getLabel().addMouseListener(new AliadoVenta(this));
		
		//atributos lógicos
		this.alcanceAtaque = 10;
		this.fuerzaAtaque = 60;
		this.precio = 125;
		this.velocidadAtaque = 7;
		this.vidaMaxima = 50;
		this.vida = vidaMaxima;	
		
		this.visitor = new ConcreteVisitorAliado(this, fuerzaAtaque);
		
		n.insertarObjeto(this);
	
	}
	
	/**
	 * Interactua con otro objeto del juego por medio de un visitor.
	 * @param o Objeto con el cual interactuar.
	 */
	public void interactuar(GameObject o) {
		boolean dentro_de_alcance = ((posicionX + (alcanceAtaque * grafica.getLabel().getWidth())) >= o.getPosicionX());
		boolean no_esta_detras = posicionX > o.getPosicionX();
		
		if(dentro_de_alcance && no_esta_detras) {
			if(contador_tiempo == 0) {
				grafica.atacar();
				new DisparoAliado(posicionX+10, posicionY+5, alcanceAtaque * grafica.getLabel().getWidth(), fuerzaAtaque, 25,  nivel);
				contador_tiempo = velocidadAtaque * 10;
			}else {
				grafica.quieto();
			}
			//el contador_tiempo se decrementa en el accionar() de Aliado
		}
		 
	}
	
}
