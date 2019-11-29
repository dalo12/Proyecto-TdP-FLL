package GUI.Controlador.GOGrafico;

import GUI.Component_Custom.ImageIcon.TexturaGameObject;
import GUI.Mapa.MapaGrafico;

public class GOGraficoPremio extends GOGrafico {

	/**
	 * Constructor de GOGraficoDisparo
	 * @param x Coordenada x del objeto lógico
	 * @param y Coordenada y del objeto lógico
	 * @param tamaño_x Ancho del objeto label.
	 * @param tamaño_y Alto del objeto label.
	 * @param text Arreglo de con las direcciones de las texturas
	 * @param mapa Mapa donde se mostrará el label
	 */
	public GOGraficoPremio(int x, int y, int tamaño_x, int tamaño_y, TexturaGameObject textura, MapaGrafico mapa) {
		super(x, y, tamaño_x, tamaño_y, textura, mapa);
	}	

}
