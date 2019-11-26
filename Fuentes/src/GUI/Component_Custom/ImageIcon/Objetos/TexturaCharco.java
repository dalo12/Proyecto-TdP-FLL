package GUI.Component_Custom.ImageIcon.Objetos;

import javax.swing.ImageIcon;
import GUI.Component_Custom.ImageIcon.TexturaGameObject;

public class TexturaCharco extends TexturaGameObject {

	/**
	 * Constructor de TexturaCharco
	 */
	public TexturaCharco() {		
		this.objeto_quieto = new ImageIcon(TexturaCharco.class.getResource("/Recursos/Objetos/puddle/puddle.png"));
		this.objeto_atacando = new ImageIcon(TexturaCharco.class.getResource("/Recursos/Objetos/puddle/puddle.png"));
		this.objeto_atacado = new ImageIcon(TexturaCharco.class.getResource("/Recursos/Objetos/puddle/puddle.png"));
		this.objeto_avanzando = new ImageIcon(TexturaCharco.class.getResource("/Recursos/Objetos/puddle/puddle.png"));
		this.objeto_muriendo = new ImageIcon(TexturaCharco.class.getResource("/Recursos/Objetos/puddle/puddle.png"));
	}
	
}
