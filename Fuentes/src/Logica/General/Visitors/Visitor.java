package Logica.General.Visitors;

import Logica.General.Aliado;
import Logica.General.Disparo;
import Logica.General.Enemigo;
import Logica.General.Objeto;
import Logica.General.Premio;

public abstract class Visitor {

	public abstract void visitEnemigo(Enemigo enemigo);
	
	public abstract void visitAliado(Aliado aliado);
	
	public abstract void visitObjeto(Objeto objeto);
	
	public abstract void visitObjeto(Disparo disparo);
	
	public abstract void visitObjeto(Premio premio);
	
}
