package GUI.Controlador;

import javax.swing.JLabel;

//<<<<<<< HEAD
import GUI.Mapa.PanelMapa;
//=======
//>>>>>>> d31a5ad05fd86de7e93babbeb83f6421542faed1

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
	 * @param tamaño_x Ancho del objeto label.
	 * @param tamaño_y Alto del objeto label.
	 * @param text Arreglo de con las direcciones de las texturas
	 * @param mapa Mapa donde se mostrará el label
	 */
//<<<<<<< HEAD
	public GOGrafico(int x, int y, int tamaño_x, int tamaño_y, String[] text, PanelMapa mapa) {
//=======
	//public GOGrafico(int x, int y, String[] text, LabelTablero mapa) {
//>>>>>>> d31a5ad05fd86de7e93babbeb83f6421542faed1
		texturas = new ImageIcon[5];
		
		for(int i=0; i<=4; i++) {
			texturas[i] = new ImageIcon(text[i]);
		}
		
		label = new JLabel();
		label.setIcon(texturas[0]);		
		
		cord_x = x;
		cord_y = y;
		
		//mapa.getTablero().add(label);
		mapa.add(label);
		label.setBounds(x, y, ANCHO*tamaño_x, ALTO*tamaño_y);
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
		for(int i=0; i<1000; i++); //para esperar
		label = null;
	}
	
	/**
	 * @return El label que contiene
	 */
	public JLabel getLabel() {
		return this.label;
	}
}
