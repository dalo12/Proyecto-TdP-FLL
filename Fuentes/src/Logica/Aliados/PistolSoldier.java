package Logica.Aliados;

import GUI.Controlador.GOGrafico;
import Logica.Disparos.DisparoAliado;
import Logica.General.Aliado;
import Logica.General.GameObject;
import Logica.General.Nivel;
import Logica.General.Visitors.ConcreteVisitorAliado;

/**
 * Modela al aliado PistolSoldier.
 * @author Comisión 25 (FERRANTE, LATOUQUETTE, LÓPEZ)
 * @version 1.0
 */
public class PistolSoldier extends Aliado {
	
	/**
	 * Constructor
	 * @param x Posición en el eje x del aliado
	 * @param y Posición en el eje y del aliado
	 */
	public PistolSoldier(int x, int y, Nivel n) {
		super(n);
		// atributos físicos
		this.tamanoX = 1;
		this.tamanoY = 1;
		this.posicionX = x;
		this.posicionY = y;
		
		String [] texturas = new String[5];
		texturas[0] = "../Texturas/Personajes/pistol-soldier/pistol-soldier-0.png";
		texturas[1] = "../Texturas/Personajes/pistol-soldier/pistol-soldier-1.gif";
		texturas[2] = texturas[3] = texturas[1]; 
		texturas[4] = "../Texturas/Personajes/pistol-soldier/pistol-soldier-4.gif";
		this.grafica = new GOGrafico(x, y, tamanoX, tamanoY, texturas, n.getMapa());
		this.grafica.getLabel().addMouseListener(new AliadoVenta(this));
		
		//atributos lógicos
		this.alcanceAtaque = 4;
		this.fuerzaAtaque = 30;
		this.precio = 75;
		this.velocidadAtaque = 3;
		this.vidaMaxima = 90;
		this.vida = vidaMaxima;	
		
		this.visitor = new ConcreteVisitorAliado(this, fuerzaAtaque);
		
		n.insertarObjeto(this);
		
	}
	
	/**
	 * Interactua con otro objeto del juego por medio de un visitor.
	 * @param o Objeto con el cual interactuar.
	 */
	public void interactuar(GameObject o) {
		if((posicionX + (alcanceAtaque * grafica.getLabel().getWidth())) <= o.getPosicionX() && posicionY == o.getPosicionY()) {
			if(contador_tiempo == 0) {
				grafica.atacar();
				new DisparoAliado(posicionX, posicionY, alcanceAtaque * grafica.getLabel().getWidth(), fuerzaAtaque, 5,  nivel);
				contador_tiempo = velocidadAtaque * 250;
			}else {
				grafica.quieto();
			}
			//el contador_tiempo se decrementa en el accionar() de Aliado
		}
		 
	}
	
}
