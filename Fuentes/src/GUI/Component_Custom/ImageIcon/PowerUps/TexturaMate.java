package GUI.Component_Custom.ImageIcon.PowerUps;

import javax.swing.ImageIcon;

import GUI.Component_Custom.ImageIcon.TexturaGameObject;

public class TexturaMate extends TexturaGameObject {
	
	/**
	 * Constructor de TexturaMate
	 */
	public TexturaMate(){
		this.objeto_quieto = new ImageIcon(TexturaMate.class.getResource("/Recursos/PowerUps/mate.gif"));
		this.objeto_atacando = new ImageIcon(TexturaMate.class.getResource("/Recursos/PowerUps/mate.gif"));
		this.objeto_atacado = new ImageIcon(TexturaMate.class.getResource("/Recursos/PowerUps/mate.gif"));
		this.objeto_avanzando = new ImageIcon(TexturaMate.class.getResource("/Recursos/PowerUps/mate.gif"));
		this.objeto_muriendo = new ImageIcon(TexturaMate.class.getResource("/Recursos/PowerUps/mate.gif"));
	}
}
