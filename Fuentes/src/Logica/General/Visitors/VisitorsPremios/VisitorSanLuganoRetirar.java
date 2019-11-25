package Logica.General.Visitors.VisitorsPremios;

import java.awt.Color;

import Logica.General.Aliado;
import Logica.General.Disparo;
import Logica.General.Enemigo;
import Logica.General.Objeto;
import Logica.General.Premio;
import Logica.General.Visitors.Visitor;

public class VisitorSanLuganoRetirar extends Visitor {
	
	
	@Override
	public void visitEnemigo(Enemigo enemigo) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visitAliado(Aliado aliado) {
		aliado.getGrafica().getLabel().setOpaque(false);
		aliado.getGrafica().getLabel().setBackground(null);
		//aliado.getGrafica().getLabel().setBackground(new Color(0,0,0,0)); //si salta NullPointerException, descomentar esa línea y borrar la de arriba
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

}
