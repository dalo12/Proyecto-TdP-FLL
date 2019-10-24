package Logica.General.Visitors;

import Logica.General.Aliado;
import Logica.General.Disparo;
import Logica.General.Enemigo;
import Logica.General.Objeto;
import Logica.General.Premio;

public class ConcreteVisitorObjeto extends Visitor {

	protected int damage;
	protected String efecto;
	protected String target;
	protected int valorEfecto;
	
	public ConcreteVisitorObjeto(Objeto o, int damage, String efecto, String target, int valorEfecto) {
		gameObject = o;
		this.damage = damage;
		this.efecto = efecto;
		this.target = target;
		this.valorEfecto = valorEfecto;
	}
	
	@Override
	public void visitEnemigo(Enemigo enemigo) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visitAliado(Aliado aliado) {
		// Objeto no interactua con aliado.
	}

	@Override
	public void visitObjeto(Objeto objeto) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visitDisparo(Disparo disparo) {
		// Objeto no interactua con disparo.
	}

	@Override
	public void visitPremio(Premio premio) {
		// Objeto no interactua con premio.
	}

}
