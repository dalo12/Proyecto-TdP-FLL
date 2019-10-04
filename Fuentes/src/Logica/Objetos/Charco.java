package Logica.Objetos;

import Logica.General.Visitors.Visitor;

/**
 * Modela al charco (objeto de mapa).
 * @author Comisión 25 (FERNÁNDEZ, LATOUQUETTE, LÓPEZ)
 * @version 1.0
 */
public class Charco extends ObjetoTemporal {
	
	public Charco(int x, int y) {
		//atributos físicos
		this.posicionX = x;
		this.posicionY = y;
		this.tamanoX = 1;
		this.tamanoY = 1;
		this.textura = "";
		
		//atributos lógicos
		this.tiempo = 30;
	}
	
	@Override
	public void serAtacado(int ataque) {
		// Si soy atacado, no hago nada
	}

	@Override
	public boolean sigoVivo() {
		return tiempo > 0;
	}

	@Override
	public void accept(Visitor v) {
		// TODO Auto-generated method stub
		
	}

}
