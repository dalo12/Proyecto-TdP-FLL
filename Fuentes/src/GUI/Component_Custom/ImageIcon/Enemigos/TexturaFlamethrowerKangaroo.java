package GUI.Component_Custom.ImageIcon.Enemigos;

import javax.swing.ImageIcon;

import GUI.Component_Custom.ImageIcon.TexturaGameObject;

public class TexturaFlamethrowerKangaroo extends TexturaGameObject {

	/**
	 * Constructor de TexturaFlamethrowerKangaroo
	 */
	public TexturaFlamethrowerKangaroo(){
		this.objeto_quieto = new ImageIcon(TexturaFlamethrowerKangaroo.class.getResource("/Recursos/Personajes/flamethrower-kangaroo/flamethrower-kangaroo-0.pn"));
		this.objeto_atacando =new ImageIcon(TexturaFlamethrowerKangaroo.class.getResource("/Recursos/Personajes/flamethrower-kangaroo/flamethrower-kangaroo-0.pn"));
		this.objeto_atacado = new ImageIcon(TexturaFlamethrowerKangaroo.class.getResource("/Recursos/Personajes/flamethrower-kangaroo/flamethrower-kangaroo-0.pn"));
		this.objeto_avanzando = new ImageIcon(TexturaFlamethrowerKangaroo.class.getResource("/Recursos/Personajes/flamethrower-kangaroo/flamethrower-kangaroo-0.pn"));
		this.objeto_muriendo = new ImageIcon(TexturaFlamethrowerKangaroo.class.getResource("/Recursos/Personajes/flamethrower-kangaroo/flamethrower-kangaroo-0.pn"));
	}
	
}
