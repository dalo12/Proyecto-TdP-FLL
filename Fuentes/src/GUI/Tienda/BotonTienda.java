package GUI.Tienda;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class BotonTienda extends JButton{
	
	/**
	 * Constructor de BotonTienda
	 * @param texto Texto a mostrar.
	 * @param rutaImagen Ruta de imagen a cargar.
	 */
	public BotonTienda(String texto, String rutaImagen) {
		super(texto);
		ImageIcon img = new ImageIcon("../Texturas/pistol-soldier-1.gif");
		this.setIcon(img);
	}
}
