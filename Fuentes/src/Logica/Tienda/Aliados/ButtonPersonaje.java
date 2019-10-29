package Logica.Tienda.Aliados;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;

import Logica.General.GameObject;
import Logica.General.Nivel;

@SuppressWarnings("serial")
public abstract class ButtonPersonaje extends JButton {
	//Atributo de instancia
	protected GameObject objeto;
	protected Nivel nivel;
	
	protected ButtonPersonaje(String texto, String url, Nivel n) {
		super(texto, new ImageIcon(url));
		this.setHorizontalAlignment(SwingConstants.LEFT);
		nivel = n;
	}
	
	/**
	 * Crea un objeto y lo retorna.
	 * @return GameObject nuevo
	 */
	public abstract GameObject crearObjeto();
}
