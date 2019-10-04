package Logica.General.Visitors;

import Logica.General.Aliado;
import Logica.General.Disparo;
import Logica.General.Enemigo;
import Logica.General.Objeto;
import Logica.General.Premio;

public class ConcreteVisitorEnemigo extends Visitor {

	protected int damage;
	
	public ConcreteVisitorEnemigo(int damage) {
		this.damage = damage;
	}
	
	@Override
	public void visitEnemigo(Enemigo enemigo) {
		// Enemigo no interactua con enemigo.
	}

	@Override
	public void visitAliado(Aliado aliado) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visitObjeto(Objeto objeto) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visitDisparo(Disparo disparo) {
		// Enemigo no interactua con disparo.
	}

	@Override
	public void visitPremio(Premio premio) {
		// Enemigo no interactua con premio.
	}

}
