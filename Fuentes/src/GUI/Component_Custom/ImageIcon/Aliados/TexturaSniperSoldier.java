package GUI.Component_Custom.ImageIcon.Aliados;

import javax.swing.ImageIcon;

import GUI.Component_Custom.ImageIcon.TexturaGameObject;

public class TexturaSniperSoldier extends TexturaGameObject {
	/**
	 * Constructor de TexturaSniperSoldier
	 */
	public TexturaSniperSoldier(){
		this.objeto_quieto = new ImageIcon(TexturaSniperSoldier.class.getResource("/Recursos/Personajes/sniper-soldier/sniper-soldier-0.png"));
		this.objeto_atacando =  new ImageIcon(TexturaSniperSoldier.class.getResource("/Recursos/Personajes/sniper-soldier/sniper-soldier-0.png"));
		this.objeto_atacado =  new ImageIcon(TexturaSniperSoldier.class.getResource("/Recursos/Personajes/sniper-soldier/sniper-soldier-0.png"));
		this.objeto_avanzando = new ImageIcon(TexturaSniperSoldier.class.getResource("/Recursos/Personajes/sniper-soldier/sniper-soldier-0.png"));
		this.objeto_muriendo = new ImageIcon(TexturaSniperSoldier.class.getResource("/Recursos/Personajes/sniper-soldier/sniper-soldier-4.gif"));
	}
}
