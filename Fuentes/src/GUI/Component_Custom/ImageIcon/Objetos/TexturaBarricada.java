package GUI.Component_Custom.ImageIcon.Objetos;

import javax.swing.ImageIcon;
import GUI.Component_Custom.ImageIcon.TexturaGameObject;

public class TexturaBarricada extends TexturaGameObject {

	/**
	 * Constructor de TexturaBarricada
	 */
	public TexturaBarricada(){
		this.objeto_quieto = new ImageIcon(TexturaBarricada.class.getResource("/Recursos/Personajes/kangaroo/kangaroo-0.pn"));
		this.objeto_atacando = new ImageIcon(TexturaBarricada.class.getResource("/Recursos/Personajes/kangaroo/kangaroo-0.pn"));
		this.objeto_atacado = new ImageIcon(TexturaBarricada.class.getResource("/Recursos/Personajes/kangaroo/kangaroo-0.pn"));
		this.objeto_avanzando = new ImageIcon(TexturaBarricada.class.getResource("/Recursos/Personajes/kangaroo/kangaroo-0.pn"));
		this.objeto_muriendo = new ImageIcon(TexturaBarricada.class.getResource("/Recursos/Personajes/kangaroo/kangaroo-0.pn"));
	}
	
}
