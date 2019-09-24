package Logica.General.disparo;

import Logica.General.Enemigo;

/**
 * Modela los disparos a realizarse por los aliados.
 * @author Comisión 25 (FERNÁNDEZ, LATOUQUETTE, LÓPEZ)
 * @version 1.0
 */
public abstract class DisparoAliado extends Disparo {

	@Override
	public void avanzar() {
		//TODO es un ejemplo, no sé cómo se va a implementar verdaderamente a futuro
		this.posicion_x += this.velocidad;
	}
	
	/**
	 * Impacta sobre un enemigo y le quita la vida correspondiente
	 * @param o Enemigo a impactar
	 */
	public void impactar(Enemigo o) {
		o.setVida(o.getVida() - this.dano);
		/*
		if(o.getVida() <= 0) {
			o.morir();
		}
		*/
	}
}
