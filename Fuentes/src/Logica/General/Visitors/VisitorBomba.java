package Logica.General.Visitors;

import Logica.General.Aliado;
import Logica.General.Disparo;
import Logica.General.Enemigo;
import Logica.General.Objeto;
import Logica.General.Premio;
import Logica.Objetos.Bomba;
import Logica.PowerUps.CampoProtector;

/**
 * Visitor de Bomba
 * @author Comisión 25 (FERRANTE, LATOUQUETTE, LÓPEZ)
 * @version 1.0
 */
public class VisitorBomba extends Visitor {
	protected Bomba fuente;
	
	public VisitorBomba(Bomba b) {
		fuente = b;
	}
	
	@Override
	public void visitEnemigo(Enemigo enemigo) {
		enemigo.setVida( enemigo.getVida() - fuente.getDano() );
	}

	@Override
	public void visitAliado(Aliado aliado) {
		aliado.setVida( aliado.getVida() - fuente.getDano() );
	}

	@Override
	public void visitObjeto(Objeto objeto) {
		objeto.setVida( objeto.getVida() - fuente.getDano());
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
