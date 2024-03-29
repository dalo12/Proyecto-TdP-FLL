package Logica.General.Visitors;

import Logica.General.Aliado;
import Logica.General.Disparo;
import Logica.General.Enemigo;
import Logica.General.Objeto;
import Logica.General.Premio;
import Logica.PowerUps.CampoProtector;

public class ConcreteVisitorDisparoAliado extends Visitor {

	protected Disparo gameObject;
	
	/**
	 * Constructor
	 * @param o Disparo del cual se desprende el visitor
	 */
	public ConcreteVisitorDisparoAliado(Disparo o) {
		gameObject = o;
	}
	
	@Override
	public void visitEnemigo(Enemigo enemigo) {
		enemigo.setVida(enemigo.getVida() - gameObject.getDano());
		if (enemigo.getVida()<=0) {
			enemigo.morir();
		}
		gameObject.morir();
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
		// TODO Auto-generated method stub

	}

	@Override
	public void visitPremio(Premio premio) {
		// TODO Auto-generated method stub

	}
	
	@Override
	public void visitCampoProtector(CampoProtector campo) {
		// TODO Auto-generated method stub
	}

}
