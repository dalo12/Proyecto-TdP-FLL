package GUI.Component_Custom.ImageIcon.PowerUps;

import javax.swing.ImageIcon;
import GUI.Component_Custom.ImageIcon.TexturaGameObject;

public class TexturaFrancotirador extends TexturaGameObject {

	/**
	 * Constructor de TexturaFrancotirador
	 */
	public TexturaFrancotirador(){
		this.objeto_quieto = new ImageIcon("../Texturas/Personajes/bazooka-soldier/bazooka-soldier-0.png");
		this.objeto_atacando = new ImageIcon("../Texturas/Personajes/bazooka-soldier/bazooka-soldier-1.png");
		this.objeto_atacado = new ImageIcon("../Texturas/Personajes/bazooka-soldier/bazooka-soldier-2.png");
		this.objeto_avanzando = new ImageIcon("../Texturas/Personajes/bazooka-soldier/bazooka-soldier-3.png");
		this.objeto_muriendo = new ImageIcon("../Texturas/Personajes/bazooka-soldier/bazooka-soldier-4.png");
	}
	
}
