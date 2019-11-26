package GUI.Component_Custom.ImageIcon.Aliados;

import javax.swing.ImageIcon;
import GUI.Component_Custom.ImageIcon.TexturaGameObject;

public class TexturaAllterrainMachinegun extends TexturaGameObject {

	/**
	 * Constructor de TexturaAllterrainMachinegun
	 */
	public TexturaAllterrainMachinegun(){
		this.objeto_quieto = new ImageIcon(TexturaAllterrainMachinegun.class.getResource("/Recursos/Personajes/allterrain-machinegun/allterrain-machinegun-0.png"));
		this.objeto_atacando = new ImageIcon(TexturaAllterrainMachinegun.class.getResource("/Recursos/Personajes/allterrain-machinegun/allterrain-machinegun-0.png"));
		this.objeto_avanzando = new ImageIcon(TexturaAllterrainMachinegun.class.getResource("/Recursos/Personajes/allterrain-machinegun/allterrain-machinegun-0.png"));
		this.objeto_atacado = new ImageIcon(TexturaAllterrainMachinegun.class.getResource("/Recursos/Personajes/allterrain-machinegun/allterrain-machinegun-0.png"));
		this.objeto_muriendo = new ImageIcon(TexturaAllterrainMachinegun.class.getResource("/Recursos/Personajes/allterrain-machinegun/allterrain-machinegun-4.gif"));
	}
	
}
