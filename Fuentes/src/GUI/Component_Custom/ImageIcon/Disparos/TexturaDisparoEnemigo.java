package GUI.Component_Custom.ImageIcon.Disparos;

import javax.swing.ImageIcon;
import GUI.Component_Custom.ImageIcon.TexturaGameObject;

public class TexturaDisparoEnemigo extends TexturaGameObject {

	/**
	 * Constructor de TexturaDisparoEnemigo
	 */
	public TexturaDisparoEnemigo(){
		this.objeto_quieto = new ImageIcon("../Texturas/Personajes/disparo/standar-shoot.png");
		this.objeto_atacando = objeto_quieto;
		this.objeto_avanzando = objeto_quieto;
		this.objeto_atacado = objeto_quieto;
		this.objeto_muriendo = objeto_quieto;
	}
	
}
