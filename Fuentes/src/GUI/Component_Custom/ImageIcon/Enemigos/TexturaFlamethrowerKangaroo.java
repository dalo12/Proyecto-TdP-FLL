package GUI.Component_Custom.ImageIcon.Enemigos;

import javax.swing.ImageIcon;

import GUI.Component_Custom.ImageIcon.TexturaGameObject;

public class TexturaFlamethrowerKangaroo extends TexturaGameObject {

	/**
	 * Constructor de TexturaFlamethrowerKangaroo
	 */
	public TexturaFlamethrowerKangaroo(){
		this.objeto_quieto = new ImageIcon("../Texturas/Personajes/flamethrower-kangaroo/flamethrower-kangaroo-0.png");
		this.objeto_atacando = new ImageIcon("../Texturas/Personajes/flamethrower-kangaroo/flamethrower-kangaroo-0.png");
		this.objeto_atacado = new ImageIcon("../Texturas/Personajes/flamethrower-kangaroo/flamethrower-kangaroo-0.png");
		this.objeto_avanzando = new ImageIcon("../Texturas/Personajes/flamethrower-kangaroo/flamethrower-kangaroo-0.png");
		this.objeto_muriendo = new ImageIcon("../Texturas/Personajes/flamethrower-kangaroo/flamethrower-kangaroo-0.png");
	}
	
}
