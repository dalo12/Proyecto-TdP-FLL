package Logica.Objetos;

import Logica.General.Visitors.ConcreteVisitorObjeto;

/**
 * Modela el charco (objeto de mapa).
 * @author Comisión 25 (FERRANTE, LATOUQUETTE, LÓPEZ)
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
		this.duracion = 30;
		
		visitor = new ConcreteVisitorObjeto(y, "", "", y); // TODO verificar si el visitor es correcto
		
	}

}
