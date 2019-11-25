package GUI.Component_Custom.ImageIcon.Enemigos;

import javax.swing.ImageIcon;

import GUI.Component_Custom.ImageIcon.TexturaGameObject;

public class TexturaPistolKangaroo extends TexturaGameObject {
	
	/**
	 * Constructor de TexturaKnifeSoldier
	 */
	public TexturaPistolKangaroo(){
		this.objeto_quieto = new ImageIcon(TexturaPistolKangaroo.class.getResource("/Recursos/Personajes/kangaroo/kangaroo-0.png"));
		this.objeto_atacando = new ImageIcon(TexturaPistolKangaroo.class.getResource("/Recursos/Personajes/kangaroo/kangaroo-0.png"));
		this.objeto_atacado = new ImageIcon(TexturaPistolKangaroo.class.getResource("/Recursos/Personajes/kangaroo/kangaroo-0.png"));
		this.objeto_avanzando = new ImageIcon(TexturaPistolKangaroo.class.getResource("/Recursos/Personajes/kangaroo/kangaroo-0.png"));
		this.objeto_muriendo = new ImageIcon(TexturaPistolKangaroo.class.getResource("/Recursos/Personajes/kangaroo/kangaroo-2.png"));
	}
}
