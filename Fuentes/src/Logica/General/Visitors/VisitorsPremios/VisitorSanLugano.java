package Logica.General.Visitors.VisitorsPremios;

import java.awt.Color;

import Logica.General.Aliado;
import Logica.General.Disparo;
import Logica.General.Enemigo;
import Logica.General.Objeto;
import Logica.General.Premio;
import Logica.General.Visitors.Visitor;
import Logica.PowerUps.CampoProtector;

public class VisitorSanLugano extends Visitor {

	@Override
	public void visitEnemigo(Enemigo enemigo) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visitAliado(Aliado aliado) {
		aliado.getGrafica().getLabel().setBackground(new Color(0, 0, 255, 50));
		aliado.getGrafica().getLabel().setOpaque(true);
		new CampoProtector(aliado);
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
