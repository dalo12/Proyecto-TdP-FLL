package GUI.Component_Custom.ImageIcon.Aliados;

import javax.swing.ImageIcon;

import GUI.Component_Custom.ImageIcon.TexturaGameObject;

public class TexturaPistolSoldier extends TexturaGameObject {
	
	/**
	 * Constructor de TexturaKnifeSoldier
	 */
	public TexturaPistolSoldier(){
		this.objeto_quieto =  new ImageIcon(TexturaPistolSoldier.class.getResource("/Recursos/Personajes/pistol-soldier/pistol-soldier-0.pn"));
		this.objeto_atacando = new ImageIcon(TexturaPistolSoldier.class.getResource("/Recursos/Personajes/pistol-soldier/pistol-soldier-1.gi"));
		this.objeto_atacado = new ImageIcon(TexturaPistolSoldier.class.getResource("/Recursos/Personajes/pistol-soldier/pistol-soldier-0.pn"));
		this.objeto_avanzando = new ImageIcon(TexturaPistolSoldier.class.getResource("/Recursos/Personajes/pistol-soldier/pistol-soldier-0.pn"));
		this.objeto_muriendo = new ImageIcon(TexturaPistolSoldier.class.getResource("/Recursos/Personajes/pistol-soldier/pistol-soldier-4.gi"));
	}
}
