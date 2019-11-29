package Logica.Tienda.Aliados;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;

import GUI.Component_Custom.ImageIcon.TexturaGameObject;
import Logica.General.GameObject;
import Logica.General.Nivel;
import Logica.Tienda.EntidadComprable;

@SuppressWarnings("serial")
public abstract class ButtonPersonaje extends JButton {
	//Atributo de instancia
	protected EntidadComprable entidad;
	protected Nivel nivel;
	protected int precio;
	//Constantes
	protected static final int POS_CREACION_X = -200;
	protected static final int POS_CREACION_Y = -400;
	
	/**
	 * Constructor de ButtonPersonaje
	 * @param textura Textura del personaje
	 * @param n Nivel del juego
	 */
	protected ButtonPersonaje(TexturaGameObject textura, Nivel n) {
		super();
		//Redimensiona los iconos de la textura y lo setea
		Image img= textura.getTexturaQuieto().getImage();
		ImageIcon img2 = new ImageIcon(img.getScaledInstance(50, 50, Image.SCALE_SMOOTH));
		this.setIcon(img2);
		//Orientacion del texto
		this.setHorizontalAlignment(SwingConstants.LEFT);
		//Inicializacion de variables
		nivel = n;
		precio = 0;
	}
	
	/**
	 * Crea un objeto y lo retorna.
	 * @return GameObject nuevo
	 */
	public abstract GameObject crearObjeto();

	/**
	 * Devuelve el costo del personaje.
	 * @return Entero que representa las monedas que cuesta un personaje
	 */
	public int getCostoPersonaje() {
		return precio;
	}
}
