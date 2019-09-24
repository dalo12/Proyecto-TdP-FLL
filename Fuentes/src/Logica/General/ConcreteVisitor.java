package Logica.General;

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
