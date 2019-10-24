package GUI.Component_Custom.menubar_custom;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.MatteBorder;

import Logica.General.Juego;

@SuppressWarnings("serial")
public class MenuBarTienda extends JMenuBar {
	//Atributos gráficos
	private static final String urlImg1 = "../Texturas/Personajes/pistol-soldier/pistol-soldier1.png";
	private static final Border bordeBarra = new MatteBorder(0, 1, 0, 1, (Color) new Color(0,0,0));
	private JMenu mnPersonajes;
	private JLabel lblMoneda, lblPuntaje;
	private Juego elJuego;
	
	public MenuBarTienda(Juego elJuego) {
		super();
		this.elJuego = elJuego;
		setMargin(new Insets(0, 5, 0, 5));
		setBackground(new Color(255, 255, 255));
		setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0,0,0)));
		
		//Imágenes del menú tienda
		ImageIcon img1;
		img1 = new ImageIcon(urlImg1);
		
		JLabel lblTitulo = new JLabel("   ~ Tienda ~   ");
		lblTitulo.setFont(new Font("Bernard MT Condensed", Font.BOLD, 20));
		add(lblTitulo);
		
		mnPersonajes = new JMenu("Personajes");
		mnPersonajes.setForeground(new Color(0, 0, 0));
		mnPersonajes.setBackground(new Color(255, 204, 102));
		mnPersonajes.setBorder(bordeBarra);
		mnPersonajes.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		mnPersonajes.setSelectedIcon(null);
		mnPersonajes.setIcon(img1);
		add(mnPersonajes);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		add(panel);
		panel.setLayout(new GridLayout(0, 2, 0, 0));
		
		lblMoneda = new JLabel("Monedas: $ -");
		lblMoneda.setHorizontalAlignment(SwingConstants.CENTER);
		lblMoneda.setFont(new Font("Bernard MT Condensed", Font.BOLD, 18));
		panel.add(lblMoneda);
		
		lblPuntaje = new JLabel("Puntaje: - PTS.");
		lblPuntaje.setHorizontalAlignment(SwingConstants.CENTER);
		lblPuntaje.setFont(new Font("Bernard MT Condensed", Font.BOLD, 18));
		panel.add(lblPuntaje);
	}
	
	/**
	 * Devuelve el menu de personajes
	 * @return JMenu
	 */
	public JMenu getMenuPersonajes() {
		return mnPersonajes;
	}
	
	/**
	 * Actualiza la informacion de puntaje y monedas de acuerdo a los datos del juego
	 */
	public void actualizarInformacionTienda() {
		lblMoneda.setText("Monedas: $" + String.valueOf(elJuego.getMonedas()));
		lblPuntaje.setText("Puntaje: $" + String.valueOf(elJuego.getPuntaje()));
	}
}
