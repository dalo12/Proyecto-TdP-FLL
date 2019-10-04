package Logica.General.Visitors;

import Logica.General.Aliado;
import Logica.General.Disparo;
import Logica.General.Enemigo;
import Logica.General.Objeto;
import Logica.General.Premio;

public class ConcreteVisitorAliado extends Visitor {

	@Override
	public void visitEnemigo(Enemigo enemigo) {
		// TODO Auto-generated method stub

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

}
