package GUI.GraficosDeObjetos.GEnemigos;

import javax.swing.ImageIcon;

import GUI.GraficosDeObjetos.GOGrafico;

/**
 * Clase que representa la parte gráfica del Kangaroo
 * @author Comisión 25 (FERRANTE, LATOUQUETTE, LÓPEZ)
 */
public class GKangaroo extends GOGrafico {
	
	/**
	 * Contructor
	 * @param x Coordenada x del objeto lógico
	 * @param y Coordenada y del objeto lógico
	 */
	public GKangaroo(int x, int y) {
		super(x, y);
		
		texturas = new ImageIcon[5];
		texturas[0] = new ImageIcon("../Texturas/Personajes/kangaroo/kangaroo-0.png");
		texturas[2] = texturas[1] = texturas[4] = texturas[0];
		texturas[3] = new ImageIcon("../../Texturas/Personajes/kangaroo/kangaroo-1.gif");
		
		label.setIcon(texturas[0]);
	}
	
	@Override
	public void serAtacado() {
		label.setIcon(texturas[3]);
	}

	@Override
	public void atacar() {
		label.setIcon(texturas[1]);
	}

	@Override
	public void avanzar(int x, int y) {
		label.setIcon(texturas[2]);
	}

	@Override
	public void morir() {
		label.setIcon(texturas[4]);
	}

}
