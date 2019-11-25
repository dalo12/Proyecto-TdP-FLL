package GUI.Controlador.GOGrafico;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.Timer;

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
	 * Constructor de GOGrafico
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
		Timer timer_remove, timer_repaint;
		
		timer_remove = new Timer (100, new ActionListener(){
			public void actionPerformed(ActionEvent e){
				label.setIcon(textura.getTexturaMuerte());
				
			}
		});
		timer_repaint = new Timer (3000, new ActionListener(){
			public void actionPerformed(ActionEvent e){
				mapa.getTablero().remove(label);
				mapa.remove(label);
			}
		});
		
		timer_remove.start();
		timer_repaint.start();
	}
	
	/**
	 * @return El label que contiene
	 */
	public JLabel getLabel() {
		return this.label;
	}
}
