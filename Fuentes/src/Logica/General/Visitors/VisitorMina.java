package Logica.General.Visitors;

import Logica.General.Aliado;
import Logica.General.Disparo;
import Logica.General.Enemigo;
import Logica.General.Objeto;
import Logica.General.Premio;
import Logica.Objetos.Mina;
import Logica.PowerUps.CampoProtector;

public class VisitorMina extends Visitor {
	protected Mina fuente;
	
	public VisitorMina(Mina m) {
		fuente = m;
	}
	
	@Override
	public void visitEnemigo(Enemigo enemigo) {
		enemigo.morir();
		fuente.morir();
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
