package GUI.Component_Custom.ImageIcon.Objetos;

import javax.swing.ImageIcon;
import GUI.Component_Custom.ImageIcon.TexturaGameObject;

public class TexturaCercaAntiTanque extends TexturaGameObject {

	/**
	 * Constructor de TexturaCercaAntiTanque
	 */
	public TexturaCercaAntiTanque(){
		this.objeto_quieto = new ImageIcon(TexturaCercaAntiTanque.class.getResource("/Recursos/Personajes/kangaroo/kangaroo-0.png"));
		this.objeto_atacando = new ImageIcon(TexturaCercaAntiTanque.class.getResource("/Recursos/Personajes/kangaroo/kangaroo-0.png"));
		this.objeto_atacado = new ImageIcon(TexturaCercaAntiTanque.class.getResource("/Recursos/Personajes/kangaroo/kangaroo-0.png"));
		this.objeto_avanzando = new ImageIcon(TexturaCercaAntiTanque.class.getResource("/Recursos/Personajes/kangaroo/kangaroo-0.png"));
		this.objeto_muriendo = new ImageIcon(TexturaCercaAntiTanque.class.getResource("/Recursos/Personajes/kangaroo/kangaroo-0.png"));
	}
	
}
