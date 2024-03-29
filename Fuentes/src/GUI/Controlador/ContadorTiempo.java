package GUI.Controlador;

import Logica.General.Juego;

public class ContadorTiempo extends Thread {
	private boolean activado;
	private Juego elJuego;
	private MenuPrincipal menu;

	ContadorTiempo(Juego j, MenuPrincipal m) {
		this.activado = true;
		this.elJuego = j;
		this.menu = m;
	}

	public void run() {
		while(activado && elJuego.isEnJuego()){
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			elJuego.accionar();
			menu.accionar();
			menu.setearAliado();
			menu.actualizarInformacionTienda();
		}
	}
	
	public void detener() {
		activado = false;
	}

}