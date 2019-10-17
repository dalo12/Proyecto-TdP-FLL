/**
 * 
 */
package GUI.GraficosDeObjetos;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
/**
 * Clase padre de todos los gráficos que representan objetos de tipo GameObject. Vendrían
 * a ser como los labels que estos usan, pero mejorados.
 * @author Comisión 25 (FERRANTE, LATOUQUETTE, LÓPEZ)
 */
public abstract class GOGrafico {	
	protected static final int ANCHO = 50;
	protected static final int ALTO = 50;
	
	protected ImageIcon[] texturas;
	/*
	 * Matriz con las imágenes de los diferentes comportamientos del objeto, 
	 * con el índice de la siguiente manera:
	 * 		texturas[0] : objeto quieto (en espera de acción)
	 * 		texturas[1] : objeto atacando
	 * 		texturas[2] : objeto siendo atacado
	 * 		texturas[3] : objeto avanzando por el mapa
	 * 		texturas[4] : objeto muriendo
	 * 	
	 */
	protected int cord_x;
	protected int cord_y;
	protected JLabel label;
	
	
	/**
	 * Constructor
	 * @param x Coordenada x del objeto lógico
	 * @param y Coordenada y del objeto lógico
	 */
	protected GOGrafico(int x, int y) {
		label = new JLabel();
		label.setBounds(x, y, ANCHO, ALTO);
		cord_x = x;
		cord_y = y;
	}
	
	/**
	 * Representa el comportamiento gráfico del objeto cuando es atacado
	 */
	public abstract void serAtacado();
	
	/**
	 * Representa el comportamiento gráfico del objeto cuando ataca
	 */	
	public abstract void atacar();
	
	/**
	 * Representa el comportamiento gráfico del objeto cuando se mueve en el mapa
	 */
	public abstract void avanzar(int x, int y);
	
	/**
	 * Representa el comportamiento gráfico del objeto cuando muere
	 */
	public abstract void morir();
	
	/**
	 * @return El label que contiene
	 */
	public JLabel getLabel() {
		return this.label;
	}
}
