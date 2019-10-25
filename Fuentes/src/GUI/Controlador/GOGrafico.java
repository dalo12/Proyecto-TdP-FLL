package GUI.Controlador;

import javax.swing.JLabel;

import GUI.Mapa.LabelTablero;

import javax.swing.ImageIcon;
/**
 * Clase padre de todos los gráficos que representan objetos de tipo GameObject. Vendrían
 * a ser como los labels que estos usan, pero mejorados.
 * @author Comisión 25 (FERRANTE, LATOUQUETTE, LÓPEZ)
 */
public class GOGrafico {	
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
	 */
	protected int cord_x;
	protected int cord_y;
	protected JLabel label;
	
	
	/**
	 * Constructor
	 * @param x Coordenada x del objeto lógico
	 * @param y Coordenada y del objeto lógico
	 * @param text Arreglo de con las direcciones de las texturas
	 */
	public GOGrafico(int x, int y, String[] text, LabelTablero mapa) {
		texturas = new ImageIcon[5];
		
		for(int i=0; i<=4; i++) {
			texturas[i] = new ImageIcon(text[i]);
		}
		
		label = new JLabel();
		//mapa.add(label);
		label.setIcon(texturas[0]);		
		label.setBounds(x, y, ANCHO, ALTO);
		
		cord_x = x;
		cord_y = y;
	}
	
	/**
	 * Representa el comportamiento gráfico del objeto cuando está quieto
	 */
	public void quieto() {
		label.setIcon(texturas[0]);
	}
	
	/**
	 * Representa el comportamiento gráfico del objeto cuando ataca
	 */	
	public void atacar() {
		label.setIcon(texturas[1]);
	}

	/**
	 * Representa el comportamiento gráfico del objeto cuando es atacado
	 */
	public void serAtacado() {
		label.setIcon(texturas[2]);
	}
	
	/**
	 * Representa el comportamiento gráfico del objeto cuando se mueve en el mapa
	 */
	public void avanzar(int x, int y) {
		label.setIcon(texturas[3]);
		label.setBounds(x, y, ANCHO, ALTO);
	}
	
	/**
	 * Representa el comportamiento gráfico del objeto cuando muere
	 */
	public void morir() {
		label.setIcon(texturas[4]);
	}
	
	/**
	 * @return El label que contiene
	 */
	public JLabel getLabel() {
		return this.label;
	}
}
