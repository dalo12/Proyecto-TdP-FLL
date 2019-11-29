package GUI.Component_Custom.ImageIcon.PowerUps;

import javax.swing.ImageIcon;

import GUI.Component_Custom.ImageIcon.TexturaGameObject;

public class TexturaCampoProtector extends TexturaGameObject {

	/**
	 * Constructor de TexturaBombardeo
	 */
	public TexturaCampoProtector(){
//		this.objeto_quieto = new ImageIcon(TexturaBombardeo.class.getResource("/Recursos/PowerUps/bombardeo.gif"));
//		this.objeto_atacando = new ImageIcon(TexturaBombardeo.class.getResource("/Recursos/PowerUps/bombardeo.gif"));
//		this.objeto_atacado = new ImageIcon(TexturaBombardeo.class.getResource("/Recursos/PowerUps/bombardeo.gif"));
//		this.objeto_avanzando = new ImageIcon(TexturaBombardeo.class.getResource("/Recursos/PowerUps/bombardeo.gif"));
//		this.objeto_muriendo = new ImageIcon(TexturaBombardeo.class.getResource("/Recursos/PowerUps/bombardeo.gif"));
		
		this.objeto_quieto = new ImageIcon(TexturaBombardeo.class.getResource("/Recursos/PowerUps/campo-protector.png"));
		this.objeto_atacando = new ImageIcon(TexturaBombardeo.class.getResource("/Recursos/PowerUps/campo-protector.png"));
		this.objeto_atacado = new ImageIcon(TexturaBombardeo.class.getResource("/Recursos/PowerUps/campo-protector.png"));
		this.objeto_avanzando = new ImageIcon(TexturaBombardeo.class.getResource("/Recursos/PowerUps/campo-protector.png"));
		this.objeto_muriendo = new ImageIcon(TexturaBombardeo.class.getResource("/Recursos/PowerUps/campo-protector.png"));
	}
	
}
