package GUI.Component_Custom.ImageIcon.PowerUps;

import javax.swing.ImageIcon;

import GUI.Component_Custom.ImageIcon.TexturaGameObject;

public class TexturaGarraCharrua extends TexturaGameObject {

	/**
	 * Constructor de TexturaGarraCharrua
	 */
	public TexturaGarraCharrua(){
		this.objeto_quieto = new ImageIcon(TexturaGarraCharrua.class.getResource("/Recursos/Personajes/kangaroo/kangaroo-0.png"));
		this.objeto_atacando = new ImageIcon(TexturaGarraCharrua.class.getResource("/Recursos/Personajes/kangaroo/kangaroo-0.png"));
		this.objeto_atacado = new ImageIcon(TexturaGarraCharrua.class.getResource("/Recursos/Personajes/kangaroo/kangaroo-0.png"));
		this.objeto_avanzando = new ImageIcon(TexturaGarraCharrua.class.getResource("/Recursos/Personajes/kangaroo/kangaroo-0.png"));
		this.objeto_muriendo = new ImageIcon(TexturaGarraCharrua.class.getResource("/Recursos/Personajes/kangaroo/kangaroo-0.png"));
	}
	
}
