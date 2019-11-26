package GUI.Component_Custom.ImageIcon.Aliados;

import javax.swing.ImageIcon;

import GUI.Component_Custom.ImageIcon.TexturaGameObject;

public class TexturaSniperSoldier extends TexturaGameObject {
	/**
	 * Constructor de TexturaSniperSoldier
	 */
	public TexturaSniperSoldier(){
		this.objeto_quieto = new ImageIcon(TexturaSniperSoldier.class.getResource("/Recursos/Personajes/sniper-soldier/sniper-soldier-0.pn"));
		this.objeto_atacando =  new ImageIcon(TexturaSniperSoldier.class.getResource("/Recursos/Personajes/sniper-soldier/sniper-soldier-1.gi"));
		this.objeto_atacado =  new ImageIcon(TexturaSniperSoldier.class.getResource("/Recursos/Personajes/sniper-soldier/sniper-soldier-0.pn"));
		this.objeto_avanzando = new ImageIcon(TexturaSniperSoldier.class.getResource("/Recursos/Personajes/sniper-soldier/sniper-soldier-0.pn"));
		this.objeto_muriendo = new ImageIcon(TexturaSniperSoldier.class.getResource("/Recursos/Personajes/sniper-soldier/sniper-soldier-4.gi"));
	}
}
