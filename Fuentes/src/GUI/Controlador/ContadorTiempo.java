package GUI.Controlador;

import Logica.General.Juego;

public class ContadorTiempo extends Thread {

	private Juego elJuego;
	private MenuPrincipal menu;

	ContadorTiempo(Juego j, MenuPrincipal m) {
		this.elJuego = j;
		this.menu = m;
	}

	public void run() {
		while(true){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			elJuego.moverenemigo();
			menu.actualizar();
		}
	}

}