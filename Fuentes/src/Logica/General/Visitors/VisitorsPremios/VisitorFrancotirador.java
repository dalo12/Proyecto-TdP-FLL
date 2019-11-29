package Logica.General.Visitors.VisitorsPremios;

import Logica.General.Aliado;
import Logica.General.Disparo;
import Logica.General.Enemigo;
import Logica.General.Objeto;
import Logica.General.Premio;
import Logica.General.Visitors.Visitor;
import Logica.PowerUps.CampoProtector;
import Logica.PowerUps.Francotirador;

public class VisitorFrancotirador extends Visitor {
	Francotirador fuente;
	
	public VisitorFrancotirador(Francotirador f) {
		fuente = f;
	}
	
	@Override
	public void visitEnemigo(Enemigo enemigo) {
		fuente.getEmpoderados().add(enemigo);
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
