package GUI.Component_Custom.ImageIcon.PowerUps;

import javax.swing.ImageIcon;
import GUI.Component_Custom.ImageIcon.TexturaGameObject;

public class TexturaFrancotirador extends TexturaGameObject {

	/**
	 * Constructor de TexturaFrancotirador
	 */
	public TexturaFrancotirador(){
		this.objeto_quieto = new ImageIcon(TexturaFrancotirador.class.getResource("/Recursos/PowerUps/francotirador.gi"));
		this.objeto_atacando = new ImageIcon(TexturaFrancotirador.class.getResource("/Recursos/PowerUps/francotirador.gi"));
		this.objeto_atacado = new ImageIcon(TexturaFrancotirador.class.getResource("/Recursos/PowerUps/francotirador.gi"));
		this.objeto_avanzando = new ImageIcon(TexturaFrancotirador.class.getResource("/Recursos/PowerUps/francotirador.gi"));
		this.objeto_muriendo = new ImageIcon(TexturaFrancotirador.class.getResource("/Recursos/PowerUps/francotirador.gi"));
	}
	
}
