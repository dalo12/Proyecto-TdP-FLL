package Logica.General.Visitors;

import Logica.General.Aliado;
import Logica.General.Disparo;
import Logica.General.Enemigo;
import Logica.General.Objeto;
import Logica.General.Premio;
import Logica.PowerUps.CampoProtector;

public class ConcreteVisitorDisparo extends Visitor {

	protected Disparo gameObject;
	protected int damage;
	
	public ConcreteVisitorDisparo(Disparo o, int damage) {
		gameObject = o;
		this.damage = damage;
	}
	
	@Override
	public void visitEnemigo(Enemigo enemigo) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visitAliado(Aliado aliado) {
		aliado.setVida(aliado.getVida() - 1);
		if (aliado.getVida()<=0) {
			aliado.morir();
		}
		gameObject.morir();
	}

	@Override
	public void visitObjeto(Objeto objeto) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visitDisparo(Disparo disparo) {
		// Disparo no interactua con disparo.
	}

	@Override
	public void visitPremio(Premio premio) {
		// Disparo no interactua con premio.
	}
	
	@Override
	public void visitCampoProtector(CampoProtector campo) {
		// TODO Auto-generated method stub
	}
}
