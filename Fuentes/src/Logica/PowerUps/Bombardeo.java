package Logica.PowerUps;

import GUI.Component_Custom.ImageIcon.PowerUps.TexturaBombardeo;
<<<<<<< HEAD
import GUI.Controlador.GOGrafico;
=======
import GUI.Controlador.GOGrafico.GOGrafico;
>>>>>>> 7c5aa846ff90347e88a05ed548e71ac55c669a57
import Logica.General.Enemigo;
import Logica.General.Nivel;
import Logica.General.Premio;
import Logica.General.Visitors.ConcreteVisitorPremio;

/**
 * Modela el powerup 'Bombardeo'
 * @author Comisión 25 (FERRANTE, LATOUQUETTE, LÓPEZ)
 * @version 1.0
 */
public class Bombardeo extends Premio {
	
	public Bombardeo(int x, int y, Nivel n) {
		super(n);
		//atributos físicos
		this.posicionX = x;
		this.posicionY = y;
		this.tamanoX = 1;
		this.tamanoY = 1;
//<<<<<<< HEAD
//		
//		String [] texturas = new String[5];
//		texturas[0] = "../Texturas/Powerups/bombardeo/bombardeo.gif";
//		texturas[2] = texturas[3] = texturas[4] = texturas[1] = texturas[0];
//		this.grafica = new GOGrafico(x, y, tamanoX, tamanoY, texturas, n.getMapa());
//=======
//
//		//Grafico de GOGrafico
//		this.grafica = new GOGrafico(x, y, tamanoX, tamanoY, new TexturaBombardeo(), n.getMapa());
//>>>>>>> 179aea955a0b2b5a5c1d1651d5b68b054de77910
		
		//Grafico de GOGrafico
		this.grafica = new GOGrafico(x, y, tamanoX, tamanoY, new TexturaBombardeo(), n.getMapa());
		//atributos lógicos
		duracionEnMapa = 10;
		duracionActivo = 0;
		activo = false;
		
		visitor = new ConcreteVisitorPremio(null, null, null, y);
		
		n.insertarObjeto(this);
	}

	@Override
	protected void aplicarEfecto(Enemigo enemigo) {
		// TODO Auto-generated method stub
		
	}

}
