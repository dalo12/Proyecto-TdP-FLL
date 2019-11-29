package GUI.Component_Custom.ImageIcon.Objetos;

import javax.swing.ImageIcon;
import GUI.Component_Custom.ImageIcon.TexturaGameObject;

public class TexturaCercaAntiTanque extends TexturaGameObject {

	/**
	 * Constructor de TexturaCercaAntiTanque
	 */
	public TexturaCercaAntiTanque(){
		this.objeto_quieto = new ImageIcon(TexturaPiedra.class.getResource("/Recursos/Objetos/cerca-antitanque/cerca-antitanque.png"));
		this.objeto_atacando = new ImageIcon(TexturaPiedra.class.getResource("/Recursos/Objetos/cerca-antitanque/cerca-antitanque.png"));
		this.objeto_atacado = new ImageIcon(TexturaPiedra.class.getResource("/Recursos/Objetos/cerca-antitanque/cerca-antitanque.png"));
		this.objeto_avanzando = new ImageIcon(TexturaPiedra.class.getResource("/Recursos/Objetos/cerca-antitanque/cerca-antitanque.png"));
		this.objeto_muriendo = new ImageIcon(TexturaPiedra.class.getResource("/Recursos/Objetos/cerca-antitanque/cerca-antitanque.png"));
	}
	
}
