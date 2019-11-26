package GUI.Component_Custom.ImageIcon.Enemigos;

import javax.swing.ImageIcon;

import GUI.Component_Custom.ImageIcon.TexturaGameObject;

public class TexturaTankGaroo extends TexturaGameObject {
	/**
	 * Constructor de TexturaTankGaroo
	 */
	public TexturaTankGaroo(){
		this.objeto_quieto = new ImageIcon(TexturaTankGaroo.class.getResource("/Recursos/Personajes/tank-garoo/tankgaroo-0.png"));
		this.objeto_atacando = new ImageIcon(TexturaTankGaroo.class.getResource("/Recursos/Personajes/tank-garoo/tankgaroo-0.png"));
		this.objeto_atacado = new ImageIcon(TexturaTankGaroo.class.getResource("/Recursos/Personajes/tank-garoo/tankgaroo-0.png"));
		this.objeto_avanzando = new ImageIcon(TexturaTankGaroo.class.getResource("/Recursos/Personajes/tank-garoo/tankgaroo-0.png"));
		this.objeto_muriendo = new ImageIcon(TexturaTankGaroo.class.getResource("/Recursos/Personajes/tank-garoo/tankgaroo-4.gif"));
	}
}
