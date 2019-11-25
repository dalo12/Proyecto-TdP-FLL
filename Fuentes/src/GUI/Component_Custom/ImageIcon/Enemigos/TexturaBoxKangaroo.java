package GUI.Component_Custom.ImageIcon.Enemigos;

import javax.swing.ImageIcon;
import GUI.Component_Custom.ImageIcon.TexturaGameObject;

public class TexturaBoxKangaroo extends TexturaGameObject {

	/**
	 * Constructor de TexturaBoxKangaroo
	 */
	public TexturaBoxKangaroo(){
		this.objeto_quieto = new ImageIcon("../Texturas/Personajes/box-kangaroo/box-kangaroo-0.png");
		this.objeto_atacando = new ImageIcon("../Texturas/Personajes/box-kangaroo/box-kangaroo-3.png");
		this.objeto_avanzando = new ImageIcon("../Texturas/Personajes/box-kangaroo/box-kangaroo-3.png");
		this.objeto_atacado = new ImageIcon("../Texturas/Personajes/box-kangaroo/box-kangaroo-3.png");
		this.objeto_muriendo = new ImageIcon("../Texturas/Personajes/box-kangaroo/box-kangaroo-4.png");
	}
	
}
