package Logica.General.Visitors;

import Logica.General.Aliado;
import Logica.General.Enemigo;
import Logica.General.Objeto;

public class ConcreteVisitor extends Visitor {

	@Override
	public void visitEnemigo(Enemigo e) {
		e.avanzar();
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
