package GUI.Mapa;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.border.Border;
import javax.swing.border.MatteBorder;

import Logica.General.GameObject;


@SuppressWarnings("serial")
public class LabelTablero extends JLabel {
	//Atributos de instancia
	private static final Border bordeBarra = new MatteBorder(1, 1, 1, 1, (Color) new Color(0,0,0));
	private Coordenada[][] coordenadas;
	private int filas, columnas;
	
	/**
	 * Constructor de LabelTablero
	 * @param m Cantidad de m filas (x)
	 * @param n Cantidad de n columnas (y)
	 */
	public LabelTablero(int m, int n) {
		this.setBorder(bordeBarra);
		filas = m;
		columnas = n;
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
	 * Inserta un label
	 * @param label Label
	 */
	public void insertar(JLabel label) {
		add(label);
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
	
	/**
	 * Devuelve un arreglo de todas las coordenadas y.
	 * @return Arreglo de enteros
	 */
	public int[] getPosicionesY() {
		actualizarTablero();
		int [] toReturn = new int[columnas];
		
		int i=0;
		for (Coordenada c: coordenadas[0]) {
			toReturn[i] = c.getY();
			i++;
		}
		
		return toReturn;
	}
	
	/**
	 * Devuelve un arreglo de todas las coordenadas x
	 * @return Arreglo de enteros
	 */
	public int[] getPosicionesX() {
		actualizarTablero();
		int [] toReturn = new int[filas];
		
		for (int i=0; i<filas; i++) {
			toReturn[i] = coordenadas[i][0].getX();
			System.out.println(toReturn[i]);
		}
		
		return toReturn;
	}
	
	/**
	 * Inserta un objeto sobre el tablero, en las coordenadas correspondientes
	 */
	public void insertarObjeto(GameObject objeto_insertar) {
		//Seteo el aliado
		int tamaño_x = objeto_insertar.getGrafica().getLabel().getWidth();
		int tamaño_y = objeto_insertar.getGrafica().getLabel().getHeight();
		//objeto_insertar.getPosicionX() retorna la posición en X del objeto en el panel, para tener su posición en el tablero, le resto el X del tablero
		int posicion_x_en_tablero = objeto_insertar.getPosicionX() - this.getX();
		//objeto_insertar.getPosicionY() retorna la posición en Y del objeto en el panel, para tener su posición en el tablero, le resto el Y del tablero
		int posicion_y_en_tablero = objeto_insertar.getPosicionY() - this.getY();
		objeto_insertar.getGrafica().getLabel().setBounds(posicion_x_en_tablero, posicion_y_en_tablero, tamaño_x, tamaño_y);
		//lista.add(objeto_insertar.getGrafica().getLabel()); //por qué es necesaria una lista de labels si desde la lista de entidades se puede acceder a los labels?
		this.insertar(objeto_insertar.getGrafica().getLabel());
	}
	
}
