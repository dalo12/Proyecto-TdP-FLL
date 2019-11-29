package GUI.Component_Custom.ImageIcon.Objetos;

import javax.swing.ImageIcon;

import GUI.Component_Custom.ImageIcon.TexturaGameObject;

public class TexturaMina extends TexturaGameObject {

	/**
	 * Constructor de TexturaMina
	 */
	public TexturaMina(){
		this.objeto_quieto = new ImageIcon(TexturaPiedra.class.getResource("/Recursos/Objetos/mina/mina.png"));
		this.objeto_atacando = new ImageIcon(TexturaPiedra.class.getResource("/Recursos/Objetos/mina/mina.png"));
		this.objeto_atacado = new ImageIcon(TexturaPiedra.class.getResource("/Recursos/Objetos/mina/mina.png"));
		this.objeto_avanzando = new ImageIcon(TexturaPiedra.class.getResource("/Recursos/Objetos/mina/mina.png"));
		this.objeto_muriendo = new ImageIcon(TexturaPiedra.class.getResource("/Recursos/Objetos/mina/explosion.gif"));
	}
	
}
