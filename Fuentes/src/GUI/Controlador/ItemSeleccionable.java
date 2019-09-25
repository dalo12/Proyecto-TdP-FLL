package GUI.Controlador;

import javax.swing.JMenuItem;

import Logica.General.GameObject;

public class ItemSeleccionable extends JMenuItem {
	protected GameObject objeto_almacenado;
	
	/**
	 * Constructor
	 * @param name Nombre a colocar en el boton
	 * @param o Objeto a almacenar
	 */
	public ItemSeleccionable(String name, GameObject o) {
		super(name);
		objeto_almacenado = o;
	}
	
	/**
	 * @return Un clon del objeto almacenado
	 */
	public GameObject crearObjecto() {
		//return objeto_almacenado;
		return objeto_almacenado.clone();
	}
	
	
}
