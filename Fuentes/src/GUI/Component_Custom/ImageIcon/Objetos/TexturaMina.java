package GUI.Component_Custom.ImageIcon.Objetos;

import javax.swing.ImageIcon;

import GUI.Component_Custom.ImageIcon.TexturaGameObject;

public class TexturaMina extends TexturaGameObject {

	/**
	 * Constructor de TexturaMina
	 */
	public TexturaMina(){
		this.objeto_quieto = new ImageIcon("../Texturas/Personajes/knife-soldier/knife-soldier-0.png");
		this.objeto_atacando = new ImageIcon("../Texturas/Personajes/knife-soldier/knife-soldier-1.png");
		this.objeto_atacado = new ImageIcon("../Texturas/Personajes/knife-soldier/knife-soldier-2.png");
		this.objeto_avanzando = new ImageIcon("../Texturas/Personajes/knife-soldier/knife-soldier-3.png");
		this.objeto_muriendo = new ImageIcon("../Texturas/Personajes/knife-soldier/knife-soldier-4.png");
	}
	
}
