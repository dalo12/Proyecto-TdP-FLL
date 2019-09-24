package Logica.Disparos;

import Logica.General.Disparo.DisparoAliado;

public class BalaAliado extends DisparoAliado {
	
	/**
	 * Contructor
	 * @param x Posición x del que efectúa el disparo
	 * @param y Posición y del que efectúa el disparo
	 * @param dano Daño que efectúa el disparador
	 * @param vel Velocidad del disparo
	 */
	public BalaAliado(int x, int y, int dano, int vel, int alcance) {
		//atributos físicos
		this.posicion_x = x;
		this.posicion_x_original = x;
		this.posicion_y = y;
		this.tamano_x = 1;
		this.tamano_y = 1;
		this.textura = "";
		
		//atributos lógicos
		this.dano = dano;
		this.velocidad = 10; //TODO Asignar nueva velocidad después
		this.alcance = alcance;
	}
	
	public void avanzar() {
		this.posicion_x += velocidad;
		if(posicion_x >= posicion_x_original + alcance) {
			//TODO destruir disparo
		}
	}
}
