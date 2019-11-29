package GUI.Component_Custom.ImageIcon.Objetos;

import javax.swing.ImageIcon;
import GUI.Component_Custom.ImageIcon.TexturaGameObject;

public class TexturaBomba extends TexturaGameObject {

	/**
	 * Constructor de TexturaBomba
	 */
	public TexturaBomba(){
		this.objeto_quieto = new ImageIcon(TexturaPiedra.class.getResource("/Recursos/Objetos/bomba/bomba.png"));
		this.objeto_atacando = new ImageIcon(TexturaPiedra.class.getResource("/Recursos/Objetos/bomba/bomba.png"));
		this.objeto_atacado = new ImageIcon(TexturaPiedra.class.getResource("/Recursos/Objetos/bomba/bomba.png"));
		this.objeto_avanzando = new ImageIcon(TexturaPiedra.class.getResource("/Recursos/Objetos/bomba/bomba.png"));
		this.objeto_muriendo = new ImageIcon(TexturaPiedra.class.getResource("/Recursos/Objetos/bomba/explosion.gif"));
	}
	
}
