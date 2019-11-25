package GUI.Controlador;

import javax.swing.JLabel;

import GUI.Component_Custom.ImageIcon.TexturaGameObject;
import GUI.Mapa.MapaGrafico;

/**
 * Clase padre de todos los gráficos que representan objetos de tipo GameObject. Vendrían
 * a ser como los labels que estos usan, pero mejorados.
 * @author Comisión 25 (FERRANTE, LATOUQUETTE, LÓPEZ)
 */
public class GOGrafico {	
	protected static final int ANCHO = 50;
	protected static final int ALTO = 50;
	protected TexturaGameObject textura;
	protected int cord_x;
	protected int cord_y;
	protected JLabel label;
	protected MapaGrafico mapa;
	
	/**
	 * Constructor
	 * @param x Coordenada x del objeto lógico
	 * @param y Coordenada y del objeto lógico
	 * @param tamaño_x Ancho del objeto label.
	 * @param tamaño_y Alto del objeto label.
	 * @param text Arreglo de con las direcciones de las texturas
	 * @param mapa Mapa donde se mostrará el label
	 */
	public GOGrafico(int x, int y, int tamaño_x, int tamaño_y, TexturaGameObject textura, MapaGrafico mapa) {		
		label = new JLabel();
		label.setIcon(textura.getTexturaQuieto());
		
		cord_x = x;
		cord_y = y;
		this.textura = textura;
		//mapa.getTablero().add(label);
		this.mapa = mapa;
		this.mapa.add(label);
		label.setBounds(x, y, ANCHO*tamaño_x, ALTO*tamaño_y);
	}
	
	/**
	 * Representa el comportamiento gráfico del objeto cuando está quieto
	 */
	public void quieto() {
		label.setIcon(textura.getTexturaQuieto());
	}
	
	/**
	 * Representa el comportamiento gráfico del objeto cuando ataca
	 */	
	public void atacar() {
		label.setIcon(textura.getTexturaAtaque());
	}

	/**
	 * Representa el comportamiento gráfico del objeto cuando es atacado
	 */
	public void serAtacado() {
		label.setIcon(textura.getTexturaRecibeAtaque());
	}
	
	/**
	 * Representa el comportamiento gráfico del objeto cuando se mueve en el mapa
	 */
	public void avanzar(int x, int y) {
		label.setIcon(textura.getTexturaAvance());
		label.setBounds(x, y, ANCHO, ALTO);
	}
	
	/**
	 * Representa el comportamiento gráfico del objeto cuando muere
	 */
	public void morir() {
		label.setIcon(textura.getTexturaMuerte());
		for(int i=0; i<1000; i++); //para esperar
		mapa.remove(label);
	}
	
	/**
	 * @return El label que contiene
	 */
	public JLabel getLabel() {
		return this.label;
	}
}
