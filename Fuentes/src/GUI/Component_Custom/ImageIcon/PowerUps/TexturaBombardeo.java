package GUI.Component_Custom.ImageIcon.PowerUps;

import javax.swing.ImageIcon;
import GUI.Component_Custom.ImageIcon.TexturaGameObject;

public class TexturaBombardeo extends TexturaGameObject {

	/**
	 * Constructor de TexturaBombardeo
	 */
	public TexturaBombardeo(){
		this.objeto_quieto = new ImageIcon("../Texturas/Personajes/allterrain-machinegun/allterrain-machinegun-0.png");
		this.objeto_atacando = new ImageIcon("../Texturas/Personajes/allterrain-machinegun/allterrain-machinegun-0.png");
		this.objeto_avanzando = new ImageIcon("../Texturas/Personajes/allterrain-machinegun/allterrain-machinegun-0.png");
		this.objeto_atacado = new ImageIcon("../Texturas/Personajes/allterrain-machinegun/allterrain-machinegun-0.png");
		this.objeto_muriendo = new ImageIcon("../Texturas/Personajes/allterrain-machinegun/allterrain-machinegun-4.png");
	}
	
}
