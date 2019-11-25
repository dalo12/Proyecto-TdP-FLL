package GUI.Component_Custom.ImageIcon.Enemigos;

import javax.swing.ImageIcon;
import GUI.Component_Custom.ImageIcon.TexturaGameObject;

public class TexturaKnifeKangaroo extends TexturaGameObject {

	/**
	 * Constructor de TexturaKnifeKangaroo
	 */
	public TexturaKnifeKangaroo(){
		this.objeto_quieto = new ImageIcon("../Texturas/Personajes/kangaroo/kangaroo-0.png");
		this.objeto_atacando = new ImageIcon("../Texturas/Personajes/kangaroo/kangaroo-0.png");
		this.objeto_atacado = new ImageIcon("../Texturas/Personajes/kangaroo/kangaroo-0.png");
		this.objeto_avanzando = new ImageIcon("../Texturas/Personajes/kangaroo/kangaroo-0.png");
		this.objeto_muriendo = new ImageIcon("../Texturas/Personajes/kangaroo/kangaroo-0.png");
	}
	
}
