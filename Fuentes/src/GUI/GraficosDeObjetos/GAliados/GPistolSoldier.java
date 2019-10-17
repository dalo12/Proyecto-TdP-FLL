package GUI.GraficosDeObjetos.GAliados;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import GUI.GraficosDeObjetos.GOGrafico;

/**
 * Clase que representa la parte gráfica del PistolSoldier
 * @author Comisión 25 (FERRANTE, LATOUQUETTE, LÓPEZ)
 */
public class GPistolSoldier extends GOGrafico {
	
	/**
	 * Constructor
	 * @param x Coordenada x del objeto lógico
	 * @param y Coordenada y del objeto lógico
	 */
	public GPistolSoldier(int x, int y) {
		super(x, y);
		
		texturas = new ImageIcon[5];
		
		//texturas[0] = "../../../../Texturas/Personajes/pistol-soldier/pistol-soldier-0";
		texturas[0] = new ImageIcon("../Texturas/Personajes/pistol-soldier/pistol-soldier-0.png");
		texturas[1] = new ImageIcon("../../Texturas/Personajes/pistol-soldier/pistol-soldier-1.gif");
		texturas[2] = texturas[3] = texturas[4] = texturas[0];
		
		label.setIcon(texturas[0]);
		label.setBounds(x, y, ANCHO, ALTO);
	}
	
	@Override
	public void serAtacado() {
		label.setIcon(texturas[0]);
	}

	@Override
	public void atacar() {
		label.setIcon(texturas[1]);
	}

	@Override
	public void avanzar(int x, int y) {
		//No hago nada
	}

	@Override
	public void morir() {
		label.setIcon(texturas[4]);
	}

}
