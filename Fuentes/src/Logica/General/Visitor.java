package Logica.General;

public abstract class Visitor {

	public abstract void visitEnemigo(Enemigo e);
	
	public abstract void visitAliado(Aliado a);
	
	public abstract void visitObjeto(Objeto o);
	
}
