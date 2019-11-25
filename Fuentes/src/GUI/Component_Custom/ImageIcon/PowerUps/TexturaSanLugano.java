package GUI.Component_Custom.ImageIcon.PowerUps;

import javax.swing.ImageIcon;

import GUI.Component_Custom.ImageIcon.TexturaGameObject;

public class TexturaSanLugano extends TexturaGameObject {
	/**
	 * Constructor de TexturaSanLugano
	 */
	public TexturaSanLugano(){
		this.objeto_quieto = new ImageIcon(TexturaSanLugano.class.getResource("/Recursos/PowerUps/san-lugano.gif"));
		this.objeto_atacando = new ImageIcon(TexturaSanLugano.class.getResource("/Recursos/PowerUps/san-lugano.gif"));
		this.objeto_atacado = new ImageIcon(TexturaSanLugano.class.getResource("/Recursos/PowerUps/san-lugano.gif"));
		this.objeto_avanzando = new ImageIcon(TexturaSanLugano.class.getResource("/Recursos/PowerUps/san-lugano.gif"));
		this.objeto_muriendo = new ImageIcon(TexturaSanLugano.class.getResource("/Recursos/PowerUps/san-lugano.gif"));
	}
}
