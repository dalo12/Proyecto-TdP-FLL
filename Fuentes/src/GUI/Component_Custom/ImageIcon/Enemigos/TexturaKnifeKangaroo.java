package GUI.Component_Custom.ImageIcon.Enemigos;

import javax.swing.ImageIcon;
import GUI.Component_Custom.ImageIcon.TexturaGameObject;

public class TexturaKnifeKangaroo extends TexturaGameObject {

	/**
	 * Constructor de TexturaKnifeKangaroo
	 */
	public TexturaKnifeKangaroo(){
		this.objeto_quieto = new ImageIcon(TexturaKnifeKangaroo.class.getResource("/Recursos/Personajes/kangaroo/kangaroo-0.pn"));
		this.objeto_atacando = new ImageIcon(TexturaKnifeKangaroo.class.getResource("/Recursos/Personajes/kangaroo/kangaroo-0.pn"));
		this.objeto_atacado = new ImageIcon(TexturaKnifeKangaroo.class.getResource("/Recursos/Personajes/kangaroo/kangaroo-0.pn"));
		this.objeto_avanzando = new ImageIcon(TexturaKnifeKangaroo.class.getResource("/Recursos/Personajes/kangaroo/kangaroo-0.pn"));
		this.objeto_muriendo = new ImageIcon(TexturaKnifeKangaroo.class.getResource("/Recursos/Personajes/kangaroo/kangaroo-0.pn"));
	}
	
}
