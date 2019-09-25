package Logica.General.Disparo;

import Logica.General.Aliado;
import Logica.General.Enemigo;
import Logica.General.Objeto;

/**
 * Modela los disparos a realizarse por los aliados.
 * @author Comisión 25 (FERNÁNDEZ, LATOUQUETTE, LÓPEZ)
 * @version 1.0
 */
public class DisparoAliado extends Disparo {

	@Override
	public void avanzar() {
		//TODO es un ejemplo, no sé cómo se va a implementar verdaderamente a futuro
		this.posicion_x += this.velocidad;
	}

	@Override
	public void visitEnemigo(Enemigo e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitAliado(Aliado a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitObjeto(Objeto o) {
		// TODO Auto-generated method stub
		
	}
	
	
}
