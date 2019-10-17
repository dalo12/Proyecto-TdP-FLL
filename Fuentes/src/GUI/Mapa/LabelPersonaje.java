package GUI.Mapa;

import javax.swing.JLabel;

import Logica.General.Entidad;
import Logica.General.GameObject;

/**
 * Clase LabelPersonaje: Clase que identifica a un JLabel que contiene a una Entidad.
 * @author Comisión 25 (FERRANTE, LATOUQUETTE, LÓPEZ)
 */
@SuppressWarnings("serial")
public class LabelPersonaje extends JLabel {
	//Atributos de instancia
	private GameObject gameObject;
	
	/**
	 * Constructor de LabelExtendido
	 * @param e Entidad que contendrá el label.
	 * @param x Coordenada x del label
	 * @param y Coordenada y del label
	 * @param alto Altura del label
	 * @param ancho Anchura del label
	 */
	public LabelPersonaje(GameObject o, int x, int y, int alto, int ancho) {
		super();
		//Establece la imagen del label
		//super(new ImageIcon(e.getTextura()));
		this.setBounds(x, y, alto, ancho);
		//Setea entidad
		gameObject = o;
	}
	
	/**
	 * Devuelve la entidad
	 * @return Entidad
	 */
	public GameObject getGameObject() {
		return gameObject;
	}

	public Entidad getEntidad() {
		// TODO Auto-generated method stub
		return null;
	}
}
