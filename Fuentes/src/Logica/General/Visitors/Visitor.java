package Logica.General.Visitors;

import Logica.General.Aliado;
import Logica.General.Enemigo;
import Logica.General.Objeto;

public abstract class Visitor {

	public abstract void visitEnemigo(Enemigo e);
	
	public abstract void visitAliado(Aliado a);
	
	public abstract void visitObjeto(Objeto o);
	
}
