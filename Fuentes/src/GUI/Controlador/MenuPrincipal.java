package GUI.Controlador;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JMenu;

import GUI.Component_Custom.menubar_custom.MenuBarTienda;
import GUI.Mapa.Coordenada;
import GUI.Mapa.LabelTablero;
import GUI.Mapa.PanelMapa;
import Logica.Aliados.*;
import Logica.Enemigos.*;
import Logica.Objetos.*;
import Logica.General.GameObject;
import Logica.General.Juego;
import Logica.Tienda.Aliados.*;
import Logica.Tienda.Objetos.*;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.LinkedList;
import java.util.List;
import java.awt.GridLayout;

public class MenuPrincipal {
	//Atributos gráficos
	protected JFrame frame;
	protected ButtonPersonaje itemCharacter[]; //Items de Personajes
	protected List<JLabel> lista;
	protected JMenu mnPersonajes; 
	private JPanel panelMapa;
	protected JLabel campo[][];
	protected LabelTablero labelTablero;
	protected MenuBarTienda menuBar;
	//Atributos de instancia
	protected static ContadorTiempo contador;
	protected static Juego elJuego;
	protected GameObject aux = null;
	protected int contador_imprimir;
	protected boolean pulsado; //Permite detectar si se ha pulsado o no el labelTablero para insertar un objeto.
	//Constantes
	protected static final int CANT_EN_X = 10; //Cantidad de columnas que contendrá LabelTablero
	protected static final int CANT_EN_Y = 6; //Cantidad de filas que contendrá LabelTablero
	
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
		pulsado = false;
		contador_imprimir = 0;
		lista = new LinkedList<JLabel>();
		elJuego = new Juego();
		initialize();
		crearMapa();
		
		for (ButtonPersonaje bp: itemCharacter) {
			bp.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e){
					aux = bp.crearObjeto();
				}
			});
		}
		
		contador = new ContadorTiempo(elJuego, this);
		
		labelTablero = new LabelTablero(CANT_EN_X, CANT_EN_Y);
		labelTablero.setLocation(360, 85);
		labelTablero.setSize(600, 330);
		labelTablero.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e){
					if (aux!=null) {
						pulsado = true;
						int pos_x = e.getX();
						int pos_y = e.getY();
						//Recupero la coordenada mas cercana en donde insertar el aux
						labelTablero.actualizarTablero();
						Coordenada c = labelTablero.getCoordenadaCercana(pos_x, pos_y);
						//Se inserta un label
						aux.setPosicionX(c.getX());
						aux.setPosicionY(c.getY());
					}
				}
			});
	
		panelMapa.add(labelTablero);
		
		int coord_x_tablero = labelTablero.getX();
		int coord_y_tablero = labelTablero.getY();
		crearLabelCampo(labelTablero.getAlturaDeDivision(), labelTablero.getAnchoDeDivision(), CANT_EN_X, CANT_EN_Y, coord_x_tablero, coord_y_tablero);
		
		elJuego.crearNivel(labelTablero);
		//crearLabelCampo(50, 50, CANT_EN_X, CANT_EN_Y, (int) Math.round(frame.getWidth()/2.5), frame.getHeight()/5);
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 1000, 527);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		menuBar = new MenuBarTienda(elJuego);
		frame.setJMenuBar(menuBar);

		iniciarMenuPersonajes();
	}

	/**
	 * Crea el mapa con dos gameobject (sin acción)
	 */
	private void crearMapa() {
		frame.getContentPane().setLayout(new GridLayout(0, 1, 0, 0));
		
		panelMapa = new PanelMapa("../Texturas/Background/background-lvl-final.png");
		frame.getContentPane().add(panelMapa);
		panelMapa.setLayout(null);
	}
	
	/**
	 * Inicializa el menú de personajes seleccionables
	 */
	protected void iniciarMenuPersonajes() {
		itemCharacter = new ButtonPersonaje[9]; //9 es el máximo de personajes (aliados y objetos) seleccionables por el usuario
		itemCharacter[0] = new ButtonAllterrainMachinegun();
		itemCharacter[1] = new ButtonBazookaSoldier();
		itemCharacter[2] = new ButtonKnifeSoldier();
		itemCharacter[3] = new ButtonPistolSoldier();
		itemCharacter[4] = new ButtonSniperSoldier();
		itemCharacter[5] = new ButtonBarricada();
		itemCharacter[6] = new ButtonBomba();
		itemCharacter[7] = new ButtonCercaAntiTanque();
		itemCharacter[8] = new ButtonMina();
		
		for(int i=0; i<9; i++) {
			menuBar.getMenuPersonajes().add(itemCharacter[i]);
		}
	}
	
	/**
	 * Acciona los elementos del mapa
	 */
	public synchronized void accionar() {
		for(GameObject o : elJuego.getNivel().getListaEntidades()) {
			panelMapa.add(o.getGrafica().getLabel());
		}
		panelMapa.repaint();
	}
	
	/**
	 * Imprime el estado actual de la lista de entidades
	 * TODO: Borrar cuando ya no sirva más
	 */
	public synchronized void imprimirObjetos() {
		String cadena = "";
		for(GameObject o : elJuego.getNivel().getListaEntidades()) {
			cadena += contador_imprimir + ": ";
			//Enemigos
			if(o instanceof BoxKangaroo) {
				cadena += "BoxKangaroo";
			}
			if(o instanceof FlamethrowerKangaroo) {
				cadena += "FlamethrowerKangaroo";
			}
			if(o instanceof Kangaroo) {
				cadena += "Kangaroo";
			}
			if(o instanceof KnifeKangaroo) {
				cadena += "KnifeKangaroo";
			}
			if(o instanceof PistolKangaroo) {
				cadena += "PistolKangaroo";
			}
			if(o instanceof TankGaroo) {
				cadena += "TankGaroo";
			}
			//Aliados
			if(o instanceof AllterrainMachinegun) {
				cadena += "AllterrainMachinegun";
			}
			if(o instanceof BazookaSoldier) {
				cadena += "BazookaSoldier";
			}
			if(o instanceof KnifeSoldier) {
				cadena += "KnifeSoldier";
			}
			if(o instanceof PistolSoldier) {
				cadena += "PistolSoldier";
			}
			if(o instanceof SniperSoldier) {
				cadena += "SniperSoldier";
			}
			//Objetos
			if(o instanceof Barricada) {
				cadena += "Barricada";
			}
			if(o instanceof Bomba) {
				cadena += "Bomba";
			}
			if(o instanceof CercaAntiTanque) {
				cadena += "CercaAntiTanque";
			}
			if(o instanceof Charco) {
				cadena += "Charco";
			}
			if(o instanceof Mina) {
				cadena += "Mina";
			}
			if(o instanceof Piedra) {
				cadena += "BoxKangaroo";
			}	
			cadena += " ";
			contador_imprimir++;
		}
		System.out.println(cadena);
		contador_imprimir = 0;
	}

	/**
	 * Setea el aliado seleccionado de la tienda
	 */
	public synchronized void setearAliado() {
		if (aux!=null && pulsado) {
			//Seteo el aliado
			aux.getGrafica().getLabel().setBounds(aux.getPosicionX() + labelTablero.getX(), aux.getPosicionY()  + labelTablero.getY(), 50, 50);
			lista.add(aux.getGrafica().getLabel());
			labelTablero.insertar(aux.getGrafica().getLabel());
			elJuego.insertarAliado(aux);
			//Se setea las variables auxiliares
			aux = null;
			pulsado = false;
			//Repaint del panel
			labelTablero.repaint();
		}
	}

	/**
	 * Actualiza la informacion de la tienda
	 */
	public synchronized void actualizarInformacionTienda() {
		menuBar.actualizarInformacionTienda();
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
	protected void crearLabelCampo(int alto, int ancho, int filas, int columnas, int x, int y) {
		campo = new JLabel[filas][columnas];
		int pos_x = x;
		int pos_y = y;
		boolean negro = false;
		boolean negro_col = false;
		
		for(int i=0; i<filas; i++) {
			negro_col = negro;
			for(int j=0; j<columnas; j++) {
				campo[i][j] = new JLabel();
				campo[i][j].setBounds(pos_x, pos_y, ancho, alto);
				pos_y += alto;
				
				campo[i][j].setVisible(true);
				campo[i][j].setOpaque(true);
				
				//TODO: En versión final después descomentar esto
				if(negro_col) {
					campo[i][j].setBackground(new Color(110,110,110, 100));
					negro_col = false;
				}else {
					campo[i][j].setBackground(new Color(150,150,150, 100));
					negro_col = true;
				}
				panelMapa.add(campo[i][j]);
			}
			pos_y = y;
			pos_x += ancho;
			negro = !negro;
		}
	}
	
	/**
	 * Retorna el límite derecho de la grilla de la GUI. Es de donde se generan las 
	 * oleadas de enemigos
	 * @return Un arreglo de ix2 con la primera componente con la coordenada x y la segunda componente
	 * con la coordenada y de los límites
	 */
	public int[][] getLimiteEnemigos(){
		int[][] arr = new int[campo.length][2];
		
		for(int i=0; i<campo.length; i++) {
			arr[i][0] = campo[i][campo[i].length-1].getX();
			arr[i][1] = campo[i][campo[i].length-1].getY();
		}
		
		return arr;
	}
	
}