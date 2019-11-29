package Logica.General.Visitors;

import Logica.General.Aliado;
import Logica.General.Disparo;
import Logica.General.Enemigo;
import Logica.General.Objeto;
import Logica.General.Premio;
import Logica.PowerUps.CampoProtector;

public class ConcreteVisitorAliado extends Visitor {

	protected Aliado gameObject;
	protected int damage;
	
	public ConcreteVisitorAliado(Aliado o, int damage) {
		gameObject = o;
		this.damage = damage;
	}
	
	@Override
	public void visitEnemigo(Enemigo enemigo) {
		gameObject.atacar(enemigo);
	}

	@Override
	public void visitAliado(Aliado aliado) {
		// Aliado no interactua con aliado.
	}

	@Override
	public void visitObjeto(Objeto objeto) {
		// Aliado no interactua con objeto.
	}

	@Override
	public void visitDisparo(Disparo disparo) {
		// Aliado no interactua con disparo.
	}

	@Override
	public void visitPremio(Premio premio) {
		// Aliado no interactua con premio.
	}
	
	@Override
	public void visitCampoProtector(CampoProtector campo) {
		boolean coinciden_x = gameObject.getPosicionX() == campo.getPosicionX();
		boolean coinciden_y = gameObject.getPosicionY() == campo.getPosicionY();
		
		if(!coinciden_x || !coinciden_y) {
			gameObject.morir();
		}
	}

}
