package GUI.Component_Custom.ImageIcon.Enemigos;

import javax.swing.ImageIcon;
import GUI.Component_Custom.ImageIcon.TexturaGameObject;

public class TexturaKangaroo extends TexturaGameObject {

	/**
	 * Constructor de TexturaKangaroo
	 */
	public TexturaKangaroo(){
		this.objeto_quieto = new ImageIcon(TexturaKangaroo.class.getResource("/Recursos/Personajes/kangaroo/kangaroo-0.png"));
		this.objeto_atacando = new ImageIcon(TexturaKangaroo.class.getResource("/Recursos/Personajes/kangaroo/kangaroo-0.png"));
		this.objeto_atacado = new ImageIcon(TexturaKangaroo.class.getResource("/Recursos/Personajes/kangaroo/kangaroo-0.png"));
		this.objeto_avanzando = new ImageIcon(TexturaKangaroo.class.getResource("/Recursos/Personajes/kangaroo/kangaroo-0.png"));
		this.objeto_muriendo = new ImageIcon(TexturaKangaroo.class.getResource("/Recursos/Personajes/kangaroo/kangaroo-0.png"));
	}
	
}
