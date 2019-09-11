package GUI.Tienda;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class BotonTienda extends JButton{
	
	public BotonTienda() {
		super("$10");
		ImageIcon img = new ImageIcon("../Texturas/pistol-soldier-1.gif");
		this.setIcon(img);
	}
}
