/**
 * 
 */
package Logica.General.disparo;

import Logica.General.Aliado;
import Logica.General.Objeto;

/**
 * Modela los disparos a realizarse por los enemigos.
 * @author Comisión 25 (FERNÁNDEZ, LATOUQUETTE, LÓPEZ)
 * @version 1.0
 */
public abstract class DisparoEnemigo extends Disparo {

	@Override
	public void avanzar() {
		//TODO es un ejemplo, no sé cómo se va a implementar verdaderamente a futuro
		this.posicion_x -= this.velocidad;
	}
	
	/**
	 * Impacta contra un aliado, restándole la vida correspondiente
	 * @param o El aliado contra el cuál ser impactado
	 */
	public void impactar(Aliado o) {
		o.setVida(o.getVida() - this.dano);
		/*
		if(o.getVida() <= 0) {
			o.morir();
		}
		*/
	}
	
	/**
	 * Impacta contra un objeto, restándole la vida correspondiente
	 * @param o
	 */
	public void impactar(Objeto o) {
		o.serAtacado(this.dano);
	}

}
