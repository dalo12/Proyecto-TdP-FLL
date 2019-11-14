package GUI.Mapa;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class MapaGrafico extends JPanel {
	protected LabelTablero tablero;
	protected JLabel torre;
	private String urlFondo;
	private Image background;
	
	/**
	 * Constructor de PanelMapa
	 * @param urlFondo Dirección lógica de la imagen de fondo del mapa
	 * @param tablero Tablero que está sobre el mapa
	 */
	public MapaGrafico(String urlFondo, LabelTablero tablero) {
		this.urlFondo = urlFondo;
		this.tablero = tablero;
	}

	// Metodo que es llamado automaticamente por la maquina virtual Java cada vez que repinta
	public void paintComponent(Graphics g) {
		/* Obtenemos el tama�o del panel para hacer que se ajuste a este
		cada vez que redimensionemos la ventana y se lo pasamos al drawImage */
		int width = this.getSize().width;
		int height = this.getSize().height;
	 
		// Mandamos que pinte la imagen en el panel
		if (this.background != null) {
			g.drawImage(this.background, 0, 0, width, height, null);
		}
		else {
			setBackground();
			g.drawImage(this.background, 0, 0, width, height, null);
		}
		super.paintComponent(g);
	}
	 
	// Metodo donde le pasaremos la direcci�n de la imagen a cargar.
	public void setBackground() {
		// Construimos la imagen y se la asignamos al atributo background.
		this.setOpaque(false);
		this.background = new ImageIcon(urlFondo).getImage();
		repaint();
	}
	
	/**
	 * @return Tablero que está sobre el mapa
	 */
	public LabelTablero getTablero() {
		return this.tablero;
	}

	/**
	 * @return the torre
	 */
	public JLabel getTorre() {
		return torre;
	}

	/**
	 * @param torre the torre to set
	 */
	public void setTorre(JLabel torre) {
		this.torre = torre;
	}
}
