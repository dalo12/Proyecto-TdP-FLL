package GUI.Component_Custom.ImageIcon.Aliados;

import javax.swing.ImageIcon;
import GUI.Component_Custom.ImageIcon.TexturaGameObject;

public class TexturaBazookaSoldier extends TexturaGameObject {

	/**
	 * Constructor de TexturaAllterrainMachinegun
	 */
	public TexturaBazookaSoldier(){
		this.objeto_quieto = new ImageIcon(TexturaBazookaSoldier.class.getResource("/Recursos/Personajes/bazooka-soldier/bazooka-soldier-0.pn"));
		this.objeto_atacando = new ImageIcon(TexturaBazookaSoldier.class.getResource("/Recursos/Personajes/bazooka-soldier/bazooka-soldier-1.gi"));
		this.objeto_atacado = new ImageIcon(TexturaBazookaSoldier.class.getResource("/Recursos/Personajes/bazooka-soldier/bazooka-soldier-0.pn"));
		this.objeto_avanzando = new ImageIcon(TexturaBazookaSoldier.class.getResource("/Recursos/Personajes/bazooka-soldier/bazooka-soldier-0.pn"));
		this.objeto_muriendo = new ImageIcon(TexturaBazookaSoldier.class.getResource("/Recursos/Personajes/bazooka-soldier/bazooka-soldier-4.gi"));
	}
	
}
