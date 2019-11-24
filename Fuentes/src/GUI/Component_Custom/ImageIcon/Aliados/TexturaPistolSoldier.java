package GUI.Component_Custom.ImageIcon.Aliados;

import javax.swing.ImageIcon;

import GUI.Component_Custom.ImageIcon.TexturaGameObject;

public class TexturaPistolSoldier extends TexturaGameObject {
	
	/**
	 * Constructor de TexturaKnifeSoldier
	 */
	public TexturaPistolSoldier(){
		this.objeto_quieto = new ImageIcon("../Texturas/Personajes/pistol-soldier/pistol-soldier-0.png");
		this.objeto_atacando = new ImageIcon("../Texturas/Personajes/pistol-soldier/pistol-soldier-1.png");
		this.objeto_atacado = new ImageIcon("../Texturas/Personajes/pistol-soldier/pistol-soldier-2.png");
		this.objeto_avanzando = new ImageIcon("../Texturas/Personajes/pistol-soldier/pistol-soldier-3.png");
		this.objeto_muriendo = new ImageIcon("../Texturas/Personajes/pistol-soldier/pistol-soldier-4.png");
	}
}
