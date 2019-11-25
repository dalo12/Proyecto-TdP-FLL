package GUI.Component_Custom.ImageIcon.PowerUps;

import javax.swing.ImageIcon;
import GUI.Component_Custom.ImageIcon.TexturaGameObject;

public class TexturaBombardeo extends TexturaGameObject {

	/**
	 * Constructor de TexturaBombardeo
	 */
	public TexturaBombardeo(){
		this.objeto_quieto = new ImageIcon(TexturaBombardeo.class.getResource("/Recursos/Personajes/kangaroo/kangaroo-0.png"));
		this.objeto_atacando = new ImageIcon(TexturaBombardeo.class.getResource("/Recursos/Personajes/kangaroo/kangaroo-0.png"));
		this.objeto_atacado = new ImageIcon(TexturaBombardeo.class.getResource("/Recursos/Personajes/kangaroo/kangaroo-0.png"));
		this.objeto_avanzando = new ImageIcon(TexturaBombardeo.class.getResource("/Recursos/Personajes/kangaroo/kangaroo-0.png"));
		this.objeto_muriendo = new ImageIcon(TexturaBombardeo.class.getResource("/Recursos/Personajes/kangaroo/kangaroo-0.png"));
	}
	
}
