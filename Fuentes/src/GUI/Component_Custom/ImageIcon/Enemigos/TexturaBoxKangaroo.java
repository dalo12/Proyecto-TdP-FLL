package GUI.Component_Custom.ImageIcon.Enemigos;

import javax.swing.ImageIcon;
import GUI.Component_Custom.ImageIcon.TexturaGameObject;

public class TexturaBoxKangaroo extends TexturaGameObject {

	/**
	 * Constructor de TexturaBoxKangaroo
	 */
	public TexturaBoxKangaroo(){
		this.objeto_quieto = new ImageIcon(TexturaBoxKangaroo.class.getResource("/Recursos/Personajes/box-kangaroo/box-kangaroo-0.png"));
		this.objeto_atacando = new ImageIcon(TexturaBoxKangaroo.class.getResource("/Recursos/Personajes/box-kangaroo/box-kangaroo-1.gif"));
		this.objeto_avanzando = new ImageIcon(TexturaBoxKangaroo.class.getResource("/Recursos/Personajes/box-kangaroo/box-kangaroo-2.gif"));
		this.objeto_atacado = new ImageIcon(TexturaBoxKangaroo.class.getResource("/Recursos/Personajes/box-kangaroo/box-kangaroo-0.png"));
		this.objeto_muriendo = new ImageIcon(TexturaBoxKangaroo.class.getResource("/Recursos/Personajes/box-kangaroo/box-kangaroo-0.png"));
	}
	
}
