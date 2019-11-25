package GUI.Component_Custom.ImageIcon.Objetos;

import javax.swing.ImageIcon;

import GUI.Component_Custom.ImageIcon.TexturaGameObject;

public class TexturaMina extends TexturaGameObject {

	/**
	 * Constructor de TexturaMina
	 */
	public TexturaMina(){
		this.objeto_quieto = new ImageIcon(TexturaMina.class.getResource("/Recursos/Personajes/kangaroo/kangaroo-0.png"));
		this.objeto_atacando = new ImageIcon(TexturaMina.class.getResource("/Recursos/Personajes/kangaroo/kangaroo-0.png"));
		this.objeto_atacado = new ImageIcon(TexturaMina.class.getResource("/Recursos/Personajes/kangaroo/kangaroo-0.png"));
		this.objeto_avanzando = new ImageIcon(TexturaMina.class.getResource("/Recursos/Personajes/kangaroo/kangaroo-0.png"));
		this.objeto_muriendo = new ImageIcon(TexturaMina.class.getResource("/Recursos/Personajes/kangaroo/kangaroo-0.png"));
	}
	
}
