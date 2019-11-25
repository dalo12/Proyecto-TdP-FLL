package Logica.PowerUps;

import GUI.Component_Custom.ImageIcon.PowerUps.TexturaMate;
import GUI.Controlador.GOGrafico;
import Logica.General.Enemigo;
import Logica.General.Nivel;
import Logica.General.Premio;
import Logica.General.Visitors.ConcreteVisitorPremio;

/**
 * Modela el powerup 'Mate'
 * @author Comisión 25 (FERRANTE, LATOUQUETTE, LÓPEZ)
 * @version 1.0
 */
public class Mate extends Premio {
	
	public Mate(int x, int y, Nivel n) {
		super(n);
		//atributos físicos
		this.posicionX = x;
		this.posicionY = y;
		this.tamanoX = 1;
		this.tamanoY = 1;
//<<<<<<< HEAD
//		
//		String [] texturas = new String[5];
//		texturas[0] = "../Texturas/Powerups/mate/mate.gif";
//		texturas[2] = texturas[3] = texturas[4] = texturas[1] = texturas[0];
//		this.grafica = new GOGrafico(x, y, tamanoX, tamanoY, texturas, n.getMapa());
//=======
//
//		//Grafico de GOGrafico
//		this.grafica = new GOGrafico(x, y, tamanoX, tamanoY, new TexturaMate(), n.getMapa());
//>>>>>>> 179aea955a0b2b5a5c1d1651d5b68b054de77910
		
		//atributos lógicos
		duracionEnMapa = 10;
		duracionActivo = 120;
		activo = false;
		
		visitor = new ConcreteVisitorPremio(null, null, null, y);
		
		n.insertarObjeto(this);
	}

	@Override
	protected void aplicarEfecto(Enemigo enemigo) {
		// TODO Auto-generated method stub
		
	}
	
}
