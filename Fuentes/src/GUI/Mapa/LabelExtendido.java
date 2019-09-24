package GUI.Mapa;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Logica.General.Entidad;

/**
 * Clase LabelExtendido: Clase que identifica a un JLabel que contiene a una Entidad.
 * @author Comisión 25 (FERNÁNDEZ, LATOUQUETTE, LÓPEZ)
 */
@SuppressWarnings("serial")
public class LabelExtendido extends JLabel {
	//Atributos de instancia
	private Entidad entidad;
	
	/**
	 * Constructor de LabelExtendido
	 * @param e Entidad que contendrá el label.
	 */
	public LabelExtendido(Entidad e) {
		//Establece la imagen del label
		super(new ImageIcon(e.getTextura()));
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
