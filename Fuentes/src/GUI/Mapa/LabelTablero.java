package GUI.Mapa;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.border.Border;
import javax.swing.border.MatteBorder;

@SuppressWarnings("serial")
public class LabelTablero extends JLabel {
	//Atributos de instancia
	private static final Border bordeBarra = new MatteBorder(1, 1, 1, 1, (Color) new Color(0,0,0));
	private Coordenada[][] coordenadas;
	
	/**
	 * Constructor de LabelTablero
	 * @param m Cantidad de m filas (x)
	 * @param n Cantidad de n columnas (y)
	 */
	public LabelTablero(int m, int n) {
		this.setBorder(bordeBarra);
		coordenadas = new Coordenada[m][n];
		for (int i=0; i<m; i++) {
			for (int j=0; j<n; j++) {
				coordenadas[i][j] = null;
			}
		}
		actualizarTablero();
	}
	
	/**
	 * Actualiza las coordenadas del tablero
	 */
	public void actualizarTablero() {
		//Obtiene de cuanto será el tamaño de cada división abstracta
		int ancho = this.getAnchoDeDivision();
		int alto = this.getAlturaDeDivision();
		
		int pos_x = ancho*(-1);
		
		for(int i=0; i<coordenadas.length; i++) {
			int pos_y = alto*(-1);
			pos_x = pos_x + ancho;
			
			for (int j=0; j<coordenadas[0].length; j++) {
				pos_y = pos_y + alto;
				coordenadas[i][j] = new Coordenada(pos_x, pos_y);
			}
		}
	}
	
	/**
	 * Dada las posiciones x e y, se busca que coordenada están mas cerca de dichas posiciones y se devuelven.
	 * @param pos_x Posición X en el label
	 * @param pos_y Posición y en el label
	 * @return Coordenada mas cercana a (x,y)
	 */
	public Coordenada getCoordenadaCercana(int pos_x, int pos_y) {
		int aux_x = pos_x / getAnchoDeDivision();
		int aux_y = pos_y / getAlturaDeDivision();
		
		return coordenadas[aux_x][aux_y];
	}
	
	/**
	 * Devuelve la altura de cada división del label
	 * @return Entero que indica la altura de cada división
	 */
	public int getAlturaDeDivision() {
		return Math.floorDiv(this.getHeight(), coordenadas[0].length);
	}

	/**
	 * Devuelve el ancho de cada división del label
	 * @return Entero que indica el ancho de cada división
	 */
	public int getAnchoDeDivision() {
		return Math.floorDiv(this.getWidth(), coordenadas.length);
	}
}
