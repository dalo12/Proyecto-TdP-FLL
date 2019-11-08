package GUI.Controlador;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JOptionPane;
import javax.swing.border.MatteBorder;

import GUI.Component_Custom.menubar_custom.MenuBarTienda;
import GUI.Mapa.Coordenada;
import GUI.Mapa.LabelTablero;
import GUI.Mapa.MapaGrafico;
import Logica.Aliados.*;
import Logica.Enemigos.*;
import Logica.Objetos.*;
import Logica.General.Aliado;
import Logica.General.GameObject;
import Logica.General.Juego;
import Logica.Tienda.Aliados.*;
import Logica.Tienda.Objetos.*;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.LinkedList;
import java.util.List;
import java.awt.GridLayout;
import java.awt.Rectangle;

public class MenuPrincipal {
	//Atributos gráficos
	protected JFrame frame;
	protected ButtonPersonaje itemCharacter[]; //Items de Personajes
	//protected List<JLabel> lista;
	protected JMenu mnPersonajes; 
	protected MapaGrafico panelMapa;
	protected JLabel campo[][];
	//protected JLabel labelLlegada;
	protected LabelTablero labelTablero;
	protected MenuBarTienda menuBar;
	protected JLabel torre; //zona de victoria de los enemigos
	//Atributos de instancia
	protected static ContadorTiempo contador;
	protected static Juego elJuego;
	protected GameObject objeto_insertar = null;
	protected int contador_imprimir;
	protected boolean pulsado; //Permite detectar si se ha pulsado o no el labelTablero para insertar un objeto.
	//Constantes
	protected static final int CANT_EN_X = 10; //Cantidad de columnas que contendrá LabelTablero
	protected static final int CANT_EN_Y = 6; //Cantidad de filas que contendrá LabelTablero
	protected static final int CANT_DERROTA = 3; //Cantidad de kangaroo que deben entrar a la torre para perder
	protected int tamano_lista_entidades;
	
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
		//lista = new LinkedList<JLabel>();
		elJuego = new Juego();
		
		initialize(); //Inicia el frame
		
		//Crea el tablero donde se insertan los aliados
		labelTablero = new LabelTablero(CANT_EN_X, CANT_EN_Y);
		labelTablero.setLocation(360, 85);
		labelTablero.setSize(600, 330);
		labelTablero.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e){
				if (objeto_insertar!=null) {
					pulsado = true;
					int pos_x = e.getX();
					int pos_y = e.getY();
					//Recupero la coordenada mas cercana en donde insertar el aux
					labelTablero.actualizarTablero();
					Coordenada c = labelTablero.getCoordenadaCercana(pos_x, pos_y);
					//Se inserta un label
					objeto_insertar.setPosicionX(labelTablero.getX() + c.getX());
					objeto_insertar.setPosicionY(labelTablero.getY() + c.getY());
				}
			}
		});		
		
		crearMapa();
		
		panelMapa.add(labelTablero);
		panelMapa.setComponentZOrder(labelTablero, 0);
		
		elJuego.crearNivel(panelMapa, 200);
	
		//crea la torre
		torre = new JLabel();
		torre.setBounds(panelMapa.getX(), panelMapa.getY()+(Math.floorDiv(frame.getHeight(), 25)), Math.floorDiv(frame.getWidth(), 4), (frame.getHeight() - Math.floorDiv(frame.getHeight(), 4)) );
		torre.setBackground(new Color(0,0,0,50));
		torre.setVisible(true);
		torre.setOpaque(true);
		torre.setIcon(new ImageIcon("../Texturas/Torres/Torre-1.png"));
		panelMapa.add(torre);
		panelMapa.setComponentZOrder(torre, panelMapa.getComponentCount() - 1);
		elJuego.getNivel().getMapa().setTorre(torre);
		
		int coord_x_tablero = labelTablero.getX();
		int coord_y_tablero = labelTablero.getY();
		crearLabelCampo(labelTablero.getAlturaDeDivision(), labelTablero.getAnchoDeDivision(), CANT_EN_X, CANT_EN_Y, coord_x_tablero, coord_y_tablero);
		
		//Agrega la tienda al frame
		menuBar = new MenuBarTienda(elJuego);
		frame.setJMenuBar(menuBar);
		
		//Agrega los personajes seleccionables a la tienda
		iniciarMenuPersonajes();
		
		//Agrega el listener a cada uno de los botones para seleccionar personajes en la tienda
		for (ButtonPersonaje bp: itemCharacter) {
			bp.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e){
					objeto_insertar = bp.crearObjeto();
				}
			});
		}
		
		//Inicio el hilo una vez que termino de crear todo
		contador = new ContadorTiempo(elJuego, this);
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 1000, 527);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	/**
	 * Crea el mapa con dos gameobject (sin acción)
	 */
	private void crearMapa() {
		frame.getContentPane().setLayout(new GridLayout(0, 1, 0, 0));
		
		panelMapa = new MapaGrafico("../Texturas/Background/background-lvl-final.png", labelTablero);
		frame.getContentPane().add(panelMapa);
		panelMapa.setLayout(null);
	}
	
	/**
	 * Inicializa el menú de personajes seleccionables
	 */
	protected void iniciarMenuPersonajes() {
		itemCharacter = new ButtonPersonaje[9]; //9 es el máximo de personajes (aliados y objetos) seleccionables por el usuario
		itemCharacter[0] = new ButtonAllterrainMachinegun(elJuego.getNivel());
		itemCharacter[1] = new ButtonBazookaSoldier(elJuego.getNivel());
		itemCharacter[2] = new ButtonKnifeSoldier(elJuego.getNivel());
		itemCharacter[3] = new ButtonPistolSoldier(elJuego.getNivel());
		itemCharacter[4] = new ButtonSniperSoldier(elJuego.getNivel());
		itemCharacter[5] = new ButtonBarricada(elJuego.getNivel());
		itemCharacter[6] = new ButtonBomba(elJuego.getNivel());
		itemCharacter[7] = new ButtonCercaAntiTanque(elJuego.getNivel());
		itemCharacter[8] = new ButtonMina(elJuego.getNivel());
		
		for(int i=0; i<9; i++) {
			menuBar.getMenuPersonajes().add(itemCharacter[i]);
		}
	}
	
	/**
	 * Acciona los elementos del mapa
	 */
	public synchronized void accionar() {
		reacomodarOrdenGrafica();
		panelMapa.updateUI();
		panelMapa.repaint();

//		//Si el juego no tiene mas enemigos y no tiene mas oleadas, el juego terminó
//		if ((elJuego.getNivel().getEnemigosRestantes()==0) && (elJuego.getNivel().getOleadasFaltantes()==0)) {
//			//Jugador a ganado
//			JOptionPane.showMessageDialog(null, "HA GANADO EL JUEGO");
//			//Detiene el hilo del contador
//			contador.detener();
//		}
//		else {
//			//Verifica si el jugador fue derrotado
//			Rectangle r_torre = torre.getBounds();
//			LinkedList<GameObject> llegaron = new LinkedList<GameObject>(); //lleva la cuenta de los kangaroo que entraron a la torre
//			for(GameObject o : elJuego.getNivel().getListaEntidades()) {
//				//Si algún enemigo llega a la zona del castillo.
//				
//				Rectangle r_o = o.getGrafica().getLabel().getBounds();
//				
//				if(r_torre.intersects(r_o) && ((torre.getX() + torre.getWidth()) > o.getPosicionX())) {
//					
//					if(!llegaron.contains(o)) {
//						llegaron.add(o);
//						//System.out.println("Entró algo."); //NOTA: Fijate que en realidad, entran como 1500 elementos en la lista, pero de alguna extraña manera, anda bien
//					}
//					
//				}
//			}
//			
//			if(llegaron.size() >= CANT_DERROTA) { //Si entraron al menos CANT_DERROTA kangaroo en la torre, el jugador pierde
//				try {
//					Thread.sleep(1000);
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
//				
//				//Jugador ha perdido
//				JOptionPane.showMessageDialog(null, "JUEGO PERDIDO");
//				//Detiene el hilo del contador
//				contador.detener();
//			}
			
			labelTablero.updateUI();
			labelTablero.repaint();
//		}

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
	
	/**
	 * Imprime el estado actual de la lista de entidades
	 * TODO: Borrar cuando ya no sirva más
	 */
	public synchronized void imprimirObjetos() {
		String cadena = "";
		if(tamano_lista_entidades != elJuego.getNivel().getListaEntidades().size()) {
			tamano_lista_entidades = elJuego.getNivel().getListaEntidades().size();
		
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
	}

	/**
	 * Setea el aliado seleccionado de la tienda
	 */
	public synchronized void setearAliado() {
		if (objeto_insertar!=null && pulsado) {
			//Seteo el aliado
			int tamaño_x = objeto_insertar.getGrafica().getLabel().getWidth();
			int tamaño_y = objeto_insertar.getGrafica().getLabel().getHeight();
			//objeto_insertar.getPosicionX() retorna la posición en X del objeto en el panel, para tener su posición en el tablero, le resto el X del tablero
			int posicion_x_en_tablero = objeto_insertar.getPosicionX() - labelTablero.getX();
			//objeto_insertar.getPosicionY() retorna la posición en Y del objeto en el panel, para tener su posición en el tablero, le resto el Y del tablero
			int posicion_y_en_tablero = objeto_insertar.getPosicionY() - labelTablero.getY();
			objeto_insertar.getGrafica().getLabel().setBounds(posicion_x_en_tablero, posicion_y_en_tablero, tamaño_x, tamaño_y);
			//lista.add(objeto_insertar.getGrafica().getLabel()); //por qué es necesaria una lista de labels si desde la lista de entidades se puede acceder a los labels?
			labelTablero.insertar(objeto_insertar.getGrafica().getLabel());
			
			//Se setea las variables auxiliares
			objeto_insertar = null;
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
				
				if(negro_col) {
					campo[i][j].setBackground(new Color(110,110,110, 100));
					negro_col = false;
				}else {
					campo[i][j].setBackground(new Color(150,150,150, 100));
					negro_col = true;
				}
				panelMapa.add(campo[i][j]);
				panelMapa.setComponentZOrder(campo[i][j], panelMapa.getComponentCount()-1);
			}
			pos_y = y;
			pos_x += ancho;
			negro = !negro;
		}
	}
	
	/**
	 * Cambia el orden en el eje Z de la grilla que conforma el campo donde colocar los aliados, para que
	 * esta siempre quede situada detrás de los personajes
	 */
	protected void reacomodarOrdenGrafica() {
		if(tamano_lista_entidades != elJuego.getNivel().getListaEntidades().size()) {
			for(int i=0; i<CANT_EN_X; i++) {
				for(int j=0; j<CANT_EN_Y; j++) {
					panelMapa.setComponentZOrder(campo[i][j], panelMapa.getComponentCount() - 1);
				}
			}
			tamano_lista_entidades = elJuego.getNivel().getListaEntidades().size();
		}
	}

}