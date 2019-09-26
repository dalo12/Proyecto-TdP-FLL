package GUI.Mapa;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Logica.General.Entidad;

/**
 * Clase LabelPersonaje: Clase que identifica a un JLabel que contiene a una Entidad.
 * @author Comisión 25 (FERRANTE, LATOUQUETTE, LÓPEZ)
 */
@SuppressWarnings("serial")
public class LabelPersonaje extends JLabel {
	//Atributos de instancia
	private Entidad entidad;
	
	/**
	 * Constructor de LabelExtendido
	 * @param e Entidad que contendrá el label.
	 * @param x Coordenada x del label
	 * @param y Coordenada y del label
	 * @param alto Altura del label
	 * @param ancho Anchura del label
	 */
	public LabelPersonaje(Entidad e, int x, int y, int alto, int ancho) {
		super();
		//Establece la imagen del label
		//super(new ImageIcon(e.getTextura()));
		this.setBounds(x, y, alto, ancho);
		//Setea entidad
		entidad = e;
	}
	
	/**
	 * Devuelve la entidad
	 * @return Entidad
	 */
	public Entidad getEntidad() {
		return entidad;
	}
}
