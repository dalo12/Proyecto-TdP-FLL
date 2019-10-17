package Logica.Tienda.Aliados;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import Logica.General.GameObject;

@SuppressWarnings("serial")
public abstract class ButtonPersonaje extends JButton {
	//Atributo de instancia
	protected GameObject objeto;
	
	protected ButtonPersonaje(String texto, String url) {
		super(texto, new ImageIcon(url));
	}
	
	/**
	 * Crea un objeto y lo retorna.
	 * @return GameObject nuevo
	 */
	public abstract GameObject crearObjeto();
}
