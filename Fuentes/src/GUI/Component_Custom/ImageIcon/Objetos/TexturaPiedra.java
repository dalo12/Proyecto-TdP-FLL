package GUI.Component_Custom.ImageIcon.Objetos;

import javax.swing.ImageIcon;

import GUI.Component_Custom.ImageIcon.TexturaGameObject;

public class TexturaPiedra extends TexturaGameObject {
	
	/**
	 * Constructor de TexturaPiedra
	 */
	public TexturaPiedra(){
		this.objeto_quieto = new ImageIcon(TexturaPiedra.class.getResource("/Recursos/Personajes/kangaroo/kangaroo-0.png"));
		this.objeto_atacando = new ImageIcon(TexturaPiedra.class.getResource("/Recursos/Personajes/kangaroo/kangaroo-0.png"));
		this.objeto_atacado = new ImageIcon(TexturaPiedra.class.getResource("/Recursos/Personajes/kangaroo/kangaroo-0.png"));
		this.objeto_avanzando = new ImageIcon(TexturaPiedra.class.getResource("/Recursos/Personajes/kangaroo/kangaroo-0.png"));
		this.objeto_muriendo = new ImageIcon(TexturaPiedra.class.getResource("/Recursos/Personajes/kangaroo/kangaroo-0.png"));
		
//		this.objeto_quieto = new ImageIcon(TexturaPiedra.class.getResource("/Recursos/Objetos/rock/rock.png"));
//		this.objeto_atacando = new ImageIcon(TexturaPiedra.class.getResource("/Recursos/Objetos/rock/rock.png"));
//		this.objeto_atacado = new ImageIcon(TexturaPiedra.class.getResource("/Recursos/Objetos/rock/rock.png"));
//		this.objeto_avanzando = new ImageIcon(TexturaPiedra.class.getResource("/Recursos/Objetos/rock/rock.png"));
//		this.objeto_muriendo = new ImageIcon(TexturaPiedra.class.getResource("/Recursos/Objetos/rock/rock.png"));
	}
}
