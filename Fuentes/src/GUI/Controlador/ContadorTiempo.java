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
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			elJuego.accionar();
			menu.accionar();
			menu.imprimirObjetos();
//			if (elJuego.getEnemigo()!=null){ 
//				elJuego.moverenemigo(); //temporal
//				elJuego.accionar();
//				//menu.actualizar();
//			}
		}
	}

}