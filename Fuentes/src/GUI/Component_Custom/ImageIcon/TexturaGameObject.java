package GUI.Component_Custom.ImageIcon;

import javax.swing.ImageIcon;


/**
 * Clase abstracta TexturaGameObject: Modela las distintas texturas que pueden requerir un gameObject
 * @author Comisión 25 (FERRANTE, LATOUQUETTE, LÓPEZ)
 */
public abstract class TexturaGameObject {
	protected ImageIcon objeto_quieto;
	protected ImageIcon objeto_atacando;
	protected ImageIcon objeto_atacado;
	protected ImageIcon objeto_avanzando;
	protected ImageIcon objeto_muriendo;
	
	/**
	 * Devuelve un ícono con la textura del gameobject quieto
	 * @return ImageIcon quieto.
	 */
	public ImageIcon getTexturaQuieto() {
		return objeto_quieto;
	}
	
	/**
	 * Devuelve un ícono con la textura del gameobject atacando
	 * @return ImageIcon Imagen atacando.
	 */
	public ImageIcon getTexturaAtaque() {
		return objeto_atacando;
	}
	
	/**
	 * Devuelve un ícono con la textura del gameobject quieto
	 * @return ImageIcon Imagen recibiendo daño.
	 */
	public ImageIcon getTexturaRecibeAtaque() {
		return objeto_atacado;
	}
	
	/**
	 * Devuelve un ícono con la textura del gameobject recibiendo daño
	 * @return ImageIcon Imagen de recibe ataque.
	 */
	public ImageIcon getTexturaAvance() {
		return objeto_avanzando;
	}
	
	/**
	 * Devuelve un ícono con la textura del gameobject muerto
	 * @return ImageIcon Imagen de muerto.
	 */
	public ImageIcon getTexturaMuerte() {
		return objeto_muriendo;
	}
}
