package GUI.Mapa;

public class Coordenada {
	//Atributos de instancia
	private int x, y;
	
	/**
	 * Constructor de Coordenada
	 * @param x Coordenada x
	 * @param y Coordenada y
	 */
	public Coordenada(int x, int y) {
		this.x = x;
		this.y = y;
	}

	/**
	 * Devuelve el valor de x
	 * @return Valor de x
	 */
	public int getX() {
		return x;
	}
	
	/**
	 * Devuelve el valor de y
	 * @return Valor de y
	 */
	public int getY() {
		return y;
	}
}
