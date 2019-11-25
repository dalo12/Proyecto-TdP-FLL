package GUI.Component_Custom.ImageIcon.PowerUps;

import javax.swing.ImageIcon;

import GUI.Component_Custom.ImageIcon.TexturaGameObject;

public class TexturaSanLugano extends TexturaGameObject {
	/**
	 * Constructor de TexturaSanLugano
	 */
	public TexturaSanLugano(){
		this.objeto_quieto = new ImageIcon("../Texturas/Personajes/sniper-soldier/sniper-soldier-0.png");
		this.objeto_atacando = new ImageIcon("../Texturas/Personajes/sniper-soldier/sniper-soldier-1.png");
		this.objeto_atacado = new ImageIcon("../Texturas/Personajes/sniper-soldier/sniper-soldier-2.png");
		this.objeto_avanzando = new ImageIcon("../Texturas/Personajes/sniper-soldier/sniper-soldier-3.png");
		this.objeto_muriendo = new ImageIcon("../Texturas/Personajes/sniper-soldier/sniper-soldier-4.png");
	}
}
