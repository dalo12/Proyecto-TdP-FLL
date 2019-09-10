package GUI.Controlador;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.border.EtchedBorder;

import GUI.Tienda.BotonTienda;

import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import java.awt.Font;

public class MenuPrincipal {
	//Atributos de GUI
	private JFrame frame;
	private JPanel panelJuego;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuPrincipal window = new MenuPrincipal();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MenuPrincipal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 900, 420);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().setLayout(new MigLayout("", "[738px,grow,fill]", "[60px][305px,grow,fill]"));
		
		JPanel panel = new JPanel();
		panel.setBorder(new EtchedBorder(EtchedBorder.RAISED, Color.BLACK, Color.DARK_GRAY));
		frame.getContentPane().add(panel, "cell 0 0,grow");
		panel.setLayout(new MigLayout("", "[90px:90px:90px,fill][90px:90px:90px,fill][90px:90px:90px,fill][90px:90px:90px,fill][90px:90px:90px,fill][][][][][2px,center][grow,fill][grow,fill]", "[60px:60.00px:60px,fill]"));
		
		BotonTienda btnCharacter1 = new BotonTienda();
		panel.add(btnCharacter1, "cell 0 0,grow");
		
		JButton btnNewButton = new JButton("New button");
		panel.add(btnNewButton, "flowx,cell 5 0");
		
		JButton btnNewButton_2 = new JButton("New button");
		panel.add(btnNewButton_2, "cell 6 0");
		
		JButton btnNewButton_1 = new JButton("New button");
		panel.add(btnNewButton_1, "cell 8 0");
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBackground(Color.BLACK);
		panel.add(separator, "cell 9 0,alignx left,growy");
		
		JButton btnCharacter2 = new JButton("");
		panel.add(btnCharacter2, "cell 1 0,grow");
		
		JButton btnCharacter3 = new JButton("");
		panel.add(btnCharacter3, "cell 2 0,grow");
		
		JButton btnCharacter4 = new JButton("");
		panel.add(btnCharacter4, "cell 3 0,grow");
		
		JButton btnCharacter5 = new JButton("");
		panel.add(btnCharacter5, "cell 4 0,grow");
		
		JLabel lblPuntaje = new JLabel("- PTS.");
		lblPuntaje.setFont(new Font("Tahoma", Font.BOLD, 17));
		panel.add(lblPuntaje, "cell 11 0,grow");
		
		JLabel lblMoneda = new JLabel("- $");
		lblMoneda.setFont(new Font("Tahoma", Font.BOLD, 17));
		panel.add(lblMoneda, "cell 10 0,grow");
		
		JButton btnNewButton_3 = new JButton("New button");
		panel.add(btnNewButton_3, "cell 7 0");
		
		panelJuego = new JPanel();
		panelJuego.setBorder(new EtchedBorder(EtchedBorder.RAISED, Color.BLACK, Color.DARK_GRAY));
		frame.getContentPane().add(panelJuego, "cell 0 1,grow");
		panelJuego.setLayout(null);
	}
}
