package GUI.Controlador;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.border.Border;
import javax.swing.SwingConstants;

import java.awt.Font;
import javax.swing.ImageIcon;

import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JMenu;
import javax.swing.border.MatteBorder;

import GUI.Mapa.LabelPersonaje;
import GUI.Mapa.PanelMapa;
import Logica.Aliados.PistolSoldier;
import Logica.Enemigos.Kangaroo;
import Logica.General.GameObject;
import Logica.General.Juego;
import Logica.Mapa.Mapa;

import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.awt.GridLayout;

public class MenuPrincipal {
	//Atributos gráficos
	private JFrame frame;
	private JLabel lblMoneda, lblPuntaje, lblPersonaje;
	private ItemSeleccionable itemCharacter[]; //Items de Personajes
	private static final Border bordeBarra = new MatteBorder(0, 1, 0, 1, (Color) new Color(0,0,0));
	private static final Border bordeSinLeft = new MatteBorder(0, 0, 0, 1, (Color) new Color(0,0,0));
	private List<JLabel> lista;
	protected JMenu mnPersonajes; 
	private JPanel panel, panelMapa;
	protected LabelPersonaje personajes[][];
	
	//Atributos de instancia
	private Mapa mapa;
	private static ContadorTiempo contador;
	private static Juego elJuego;
	private static final String urlImg1 = "../Texturas/Personajes/pistol-soldier/pistol-soldier1.png";
	private static final String urlImg2 = "../Texturas/Personajes/pistol-soldier/pistol-soldier2.png";
	private static final String urlImg3 = "../Texturas/Personajes/kangaroo/kangaroo1.png";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		MenuPrincipal window = new MenuPrincipal();
		window.frame.setVisible(true);
		contador.run();
	}

	/**
	 * Create the application.
	 */
	public MenuPrincipal() {
		lista = new LinkedList<JLabel>();
		GameObject e = new Kangaroo(640, 0);
		elJuego = new Juego(e);
		initialize();
		crearMapa();
		crearLabelsPersonajes(45, 45, mapa.getHeight(), mapa.getWidth(), 258, 58);
		
		for (JLabel labelLista: lista) {
			labelLista.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e){
					if (JOptionPane.showConfirmDialog(null, "¿Está seguro?")==JOptionPane.YES_OPTION) {
						JLabel remover = lista.remove(0);
						panelMapa.remove(remover);
						elJuego.removerEnemigo();
						try {
							Thread.sleep(1000);
							panelMapa.repaint();
						} catch (InterruptedException e1) {}
						
						actualizar();
					}
				}
					
			});
		}
		contador = new ContadorTiempo(elJuego, this);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 800, 422);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setMargin(new Insets(0, 5, 0, 5));
		menuBar.setBackground(new Color(255, 255, 255));
		menuBar.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0,0,0)));
		frame.setJMenuBar(menuBar);
		
		//Imágenes del menú tienda
		ImageIcon img1, img2, img3;
		img1 = new ImageIcon(urlImg1);
		img2 = new ImageIcon(urlImg2);
		img3 = new ImageIcon(urlImg3);
		
		JLabel lblTitulo = new JLabel("   ~ Tienda ~   ");
		lblTitulo.setFont(new Font("Bernard MT Condensed", Font.BOLD, 20));
		menuBar.add(lblTitulo);
		
		mnPersonajes = new JMenu("Personajes");
		mnPersonajes.setForeground(new Color(0, 0, 0));
		mnPersonajes.setBackground(new Color(255, 204, 102));
		mnPersonajes.setBorder(bordeBarra);
		mnPersonajes.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		mnPersonajes.setSelectedIcon(null);
		mnPersonajes.setIcon(img1);
		menuBar.add(mnPersonajes);
		
		iniciarMenuPersonajes();

//		itemCharacter1 = new JMenuItem("Soldado - $10");
//		itemCharacter1.setFont(new Font("Segoe UI", Font.BOLD, 12));
//		itemCharacter1.setIcon(img2);
//		mnPersonajes.add(itemCharacter1);
		
//		JMenu mnObjetos = new JMenu("Objetos");
//		mnObjetos.setForeground(new Color(0, 0, 0));
//		mnObjetos.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
//		mnObjetos.setBorder(bordeSinLeft);
//		mnObjetos.setIcon(img3);
//		menuBar.add(mnObjetos);
		
		panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		menuBar.add(panel);
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
	 * Crea el mapa con dos gameobject (sin acción)
	 */
	private void crearMapa() {
		mapa = new Mapa("../Texturas/Background/background-lvl-final.png", 6, 10);
		GameObject go1, go2;
		go1 = new PistolSoldier(258,57);
		go2 = new Kangaroo(640,57);
		/*
		 * mapa.getMapa()[0][0] = new CeldaAliado(0,0);
		 * mapa.getMapa()[0][9] = new CeldaEnemigo(0,9);
		 * (mapa.getMapa()[0][0]).ocupar(go1); //Personaje
		 * (mapa.getMapa()[0][9]).ocupar(go2); //Enemigo
		 */
		
		frame.getContentPane().setLayout(new GridLayout(0, 1, 0, 0));
		
		panelMapa = new PanelMapa(mapa.getTextura());
		frame.getContentPane().add(panelMapa);
		panelMapa.setLayout(null);
		
		lblPersonaje = new JLabel();
		lblPersonaje.setHorizontalAlignment(SwingConstants.CENTER);
		lblPersonaje.setBounds(258, 57, 50, 50);
		lblPersonaje.setIcon(new ImageIcon(urlImg1));
		panelMapa.add(lblPersonaje);
		
		JLabel lblEnemigo = new JLabel();
		lblEnemigo.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnemigo.setBounds(740, 57, 50, 50);
		panelMapa.add(lblEnemigo);
		lblEnemigo.setIcon(new ImageIcon(urlImg3));
		lista.add(lblEnemigo);
		panelMapa.add(lista.get(0));
	}
	
	public void actualizar() {
		if (lista.size()>0 && elJuego.getEnemigo()!=null){ //Previene un IndexOutOfBoundsException en caso de que no se tenga labels en la lista
			GameObject object = elJuego.getEnemigo();
			//El siguiente if previene que el labelEnemigo toque al labelPersonaje al estar cerca de su posición
			if (lblPersonaje.getX()+60 < object.getPosicion_x()) {
				//lista.get(0).setBounds(object.getPosicion_x(), object.getPosicion_y(), 70, 58);
				lista.get(0).setBounds(object.getPosicion_x(), object.getPosicion_y(), 70, 58);
			}
		}
		lblMoneda.setText("Monedas: $" + String.valueOf(elJuego.getMonedas()));
		lblPuntaje.setText("Puntaje: " + String.valueOf(elJuego.getPuntaje()) + " PTS.");
	}
	
	/**
	 * Inicializa el menú de personajes seleccionables
	 */
	protected void iniciarMenuPersonajes() {
		itemCharacter = new ItemSeleccionable[elJuego.getNivelActual().getPersonajesSeleccionables().size()];
		int i = 0;
		for(GameObject o: elJuego.getNivelActual().getPersonajesSeleccionables()) {
			itemCharacter[i] = new ItemSeleccionable(o.getNombre(), o);
			itemCharacter[i].setFont(new Font("Segoe UI", Font.BOLD, 12));
			itemCharacter[i].setIcon(new ImageIcon(o.getTextura()));
//			itemCharacter[nro_item].addActionListener(new ActionListener() {
//
//				@Override
//				public void actionPerformed(ActionEvent e) {
//					itemCharacter[nro_item].crearObjeto();
//				}
//				
//			});
			mnPersonajes.add(itemCharacter[i]);
			i++;
		}
	}
	
	/**
	 * Crea la matriz de labels que contendrá a los personajes seleccionables
	 * @param alto Altura del label 
	 * @param ancho Anchura del label
	 * @param filas Cantidad de filas de la matriz
	 * @param columnas Cantidad de columnas de la matriz
	 * @param x Posición x de donde comienza la matriz en la GUI
	 * @param y Posición y de donde comienza la matriz en la GUI
	 */
	protected void crearLabelsPersonajes(int alto, int ancho, int filas, int columnas, int x, int y) {
		personajes = new LabelPersonaje[filas][columnas];
		int pos_x = x;
		int pos_y = y;
		
		for(int i=0; i<filas; i++) {
			for(int j=0; j<columnas; j++) {
				personajes[i][j] = new LabelPersonaje(null, pos_x, pos_y, alto, ancho);
				pos_y += alto;
				
				personajes[i][j].setVisible(true);
				personajes[i][j].setOpaque(true);
				
				Random r = new Random();
				personajes[i][j].setBackground(new Color(r.nextInt(255), r.nextInt(255), r.nextInt(255), 50));
				panelMapa.add(personajes[i][j]);
			}
			pos_y = y;
			pos_x += ancho;
		}
	}
}

