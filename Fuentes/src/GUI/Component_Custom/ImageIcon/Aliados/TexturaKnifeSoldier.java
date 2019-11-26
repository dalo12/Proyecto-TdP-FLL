package GUI.Component_Custom.ImageIcon.Aliados;

import javax.swing.ImageIcon;

import GUI.Component_Custom.ImageIcon.TexturaGameObject;

public class TexturaKnifeSoldier extends TexturaGameObject {

	/**
	 * Constructor de TexturaKnifeSoldier
	 */
	public TexturaKnifeSoldier(){
		this.objeto_quieto = new ImageIcon(TexturaKnifeSoldier.class.getResource("/Recursos/Personajes/knife-soldier/knife-soldier-0.pn"));
		this.objeto_atacando = new ImageIcon(TexturaKnifeSoldier.class.getResource("/Recursos/Personajes/knife-soldier/knife-soldier-1.gi"));
		this.objeto_atacado = new ImageIcon(TexturaKnifeSoldier.class.getResource("/Recursos/Personajes/knife-soldier/knife-soldier-0.pn"));
		this.objeto_avanzando = new ImageIcon(TexturaKnifeSoldier.class.getResource("/Recursos/Personajes/knife-soldier/knife-soldier-0.pn"));
		this.objeto_muriendo = new ImageIcon(TexturaKnifeSoldier.class.getResource("/Recursos/Personajes/knife-soldier/knife-soldier-4.gi"));
	}
	
}
