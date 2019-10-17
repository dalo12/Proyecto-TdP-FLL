package Logica.General.Visitors;

import Logica.General.Aliado;
import Logica.General.Disparo;
import Logica.General.Enemigo;
import Logica.General.Objeto;
import Logica.General.Premio;

public class ConcreteVisitorDisparo extends Visitor {

	protected int damage;
	
	public ConcreteVisitorDisparo(int damage) {
		this.damage = damage;
	}
	
	@Override
	public void visitEnemigo(Enemigo enemigo) {
		// TODO Auto-generated method stub

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
		// Disparo no interactua con disparo.
	}

	@Override
	public void visitPremio(Premio premio) {
		// Disparo no interactua con premio.
	}

}
