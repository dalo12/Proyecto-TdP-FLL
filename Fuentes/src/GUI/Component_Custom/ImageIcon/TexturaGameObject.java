package GUI.Component_Custom.ImageIcon;

import javax.swing.ImageIcon;


/**
 * Clase abstracta TexturaGameObject: Modela las distintas texturas que pueden requerir un gameObject
 * @author Comisi�n 25 (FERRANTE, LATOUQUETTE, L�PEZ)
 */
public abstract class TexturaGameObject {
	protected ImageIcon objeto_quieto;
	protected ImageIcon objeto_atacando;
	protected ImageIcon objeto_atacado;
	protected ImageIcon objeto_avanzando;
	protected ImageIcon objeto_muriendo;
	
	/**
	 * Devuelve un �cono con la textura del gameobject quieto
	 * @return ImageIcon quieto.
	 */
	public ImageIcon getTexturaQuieto() {
		return objeto_quieto;
	}
	
	/**
	 * Devuelve un �cono con la textura del gameobject atacando
	 * @return ImageIcon Imagen atacando.
	 */
	public ImageIcon getTexturaAtaque() {
		return objeto_atacando;
	}
	
	/**
	 * Devuelve un �cono con la textura del gameobject quieto
	 * @return ImageIcon Imagen recibiendo da�o.
	 */
	public ImageIcon getTexturaRecibeAtaque() {
		return objeto_atacado;
	}
	
	/**
	 * Devuelve un �cono con la textura del gameobject recibiendo da�o
	 * @return ImageIcon Imagen de recibe ataque.
	 */
	public ImageIcon getTexturaAvance() {
		return objeto_avanzando;
	}
	
	/**
	 * Devuelve un �cono con la textura del gameobject muerto
	 * @return ImageIcon Imagen de muerto.
	 */
	public ImageIcon getTexturaMuerte() {
		return objeto_muriendo;
	}
}
