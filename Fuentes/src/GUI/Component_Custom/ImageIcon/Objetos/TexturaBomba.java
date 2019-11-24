package GUI.Component_Custom.ImageIcon.Objetos;

import javax.swing.ImageIcon;
import GUI.Component_Custom.ImageIcon.TexturaGameObject;

public class TexturaBomba extends TexturaGameObject {

	/**
	 * Constructor de TexturaBomba
	 */
	public TexturaBomba(){
		this.objeto_quieto = new ImageIcon("../Texturas/Personajes/allterrain-machinegun/allterrain-machinegun-0.png");
		this.objeto_atacando = new ImageIcon("../Texturas/Personajes/allterrain-machinegun/allterrain-machinegun-0.png");
		this.objeto_avanzando = new ImageIcon("../Texturas/Personajes/allterrain-machinegun/allterrain-machinegun-0.png");
		this.objeto_atacado = new ImageIcon("../Texturas/Personajes/allterrain-machinegun/allterrain-machinegun-0.png");
		this.objeto_muriendo = new ImageIcon("../Texturas/Personajes/allterrain-machinegun/allterrain-machinegun-4.png");
	}
	
}
