package Logica.General.Visitors;

import Logica.General.Aliado;
import Logica.General.Disparo;
import Logica.General.Enemigo;
import Logica.General.GameObject;
import Logica.General.Objeto;
import Logica.General.Premio;

public abstract class Visitor {
	
	protected GameObject gameObject;

	public abstract void visitEnemigo(Enemigo enemigo);
	
	public abstract void visitAliado(Aliado aliado);
	
	public abstract void visitObjeto(Objeto objeto);
	
	public abstract void visitDisparo(Disparo disparo);
	
	public abstract void visitPremio(Premio premio);
	
}
