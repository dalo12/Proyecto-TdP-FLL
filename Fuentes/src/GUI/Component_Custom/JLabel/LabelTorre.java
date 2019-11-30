package GUI.Component_Custom.JLabel;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import GUI.Mapa.MapaGrafico;

@SuppressWarnings("serial")
public class LabelTorre extends JLabel {

	/**
	 * Constructor de LabelTorre
	 * @param panelMapa MapaGrafico
	 * @param frame_height Altura del frame
	 * @param frame_width Ancho del frame
	 */
	public LabelTorre(MapaGrafico panelMapa, int frame_height, int frame_width) {
		super();
		setBounds(panelMapa.getX(), panelMapa.getY()+(Math.floorDiv(frame_height, 25)), Math.floorDiv(frame_width, 4), (frame_height - Math.floorDiv(frame_height, 4)) );
		setBackground(new Color(0,0,0,50));
		setVisible(true);
		setOpaque(true);
		setIcon(new ImageIcon(LabelTorre.class.getResource("/Recursos/Torres/Torre-1.png")));
	}
}
