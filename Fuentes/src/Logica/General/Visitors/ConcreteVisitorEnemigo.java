package Logica.General.Visitors;

import Logica.General.Aliado;
import Logica.General.Disparo;
import Logica.General.Enemigo;
import Logica.General.Objeto;
import Logica.General.Premio;

public class ConcreteVisitorEnemigo extends Visitor {

	protected Enemigo gameObject;
	protected int damage;
	
	public ConcreteVisitorEnemigo(Enemigo o, int damage) {
		gameObject = o;
		this.damage = damage;
	}
	
	@Override
	public void visitEnemigo(Enemigo enemigo) {
		// Enemigo no interactua con enemigo.
	}

	@Override
	public void visitAliado(Aliado aliado) {
		gameObject.atacar(aliado);
		
	}

	@Override
	public void visitObjeto(Objeto objeto) {
		gameObject.atacar(objeto);
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
