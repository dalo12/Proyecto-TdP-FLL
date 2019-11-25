package GUI.Component_Custom.ImageIcon.PowerUps;

import javax.swing.ImageIcon;
import GUI.Component_Custom.ImageIcon.TexturaGameObject;

public class TexturaFrancotirador extends TexturaGameObject {

	/**
	 * Constructor de TexturaFrancotirador
	 */
	public TexturaFrancotirador(){
		this.objeto_quieto = new ImageIcon(TexturaFrancotirador.class.getResource("/Recursos/Personajes/kangaroo/kangaroo-0.png"));
		this.objeto_atacando = new ImageIcon(TexturaFrancotirador.class.getResource("/Recursos/Personajes/kangaroo/kangaroo-0.png"));
		this.objeto_atacado = new ImageIcon(TexturaFrancotirador.class.getResource("/Recursos/Personajes/kangaroo/kangaroo-0.png"));
		this.objeto_avanzando = new ImageIcon(TexturaFrancotirador.class.getResource("/Recursos/Personajes/kangaroo/kangaroo-0.png"));
		this.objeto_muriendo = new ImageIcon(TexturaFrancotirador.class.getResource("/Recursos/Personajes/kangaroo/kangaroo-0.png"));
	}
	
}
