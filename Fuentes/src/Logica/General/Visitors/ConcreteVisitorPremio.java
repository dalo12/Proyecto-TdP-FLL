package Logica.General.Visitors;

import Logica.General.Aliado;
import Logica.General.Disparo;
import Logica.General.Enemigo;
import Logica.General.Objeto;
import Logica.General.Premio;

public class ConcreteVisitorPremio extends Visitor {

	protected String efecto;
	protected String target;
	protected int valorEfecto;
	
	public ConcreteVisitorPremio(String efecto, String target, int valorEfecto) {
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
		// TODO Auto-generated method stub

	}

	@Override
	public void visitObjeto(Objeto objeto) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visitDisparo(Disparo disparo) {
		// Premio no intereactua con disparo.
	}

	@Override
	public void visitPremio(Premio premio) {
		// Premio no interactua con premio.
	}

}
