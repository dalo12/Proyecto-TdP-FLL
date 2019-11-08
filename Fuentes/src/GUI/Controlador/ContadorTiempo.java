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
		while(activado){
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			menu.actualizarInformacionTienda();
			elJuego.accionar();
			menu.accionar();
			menu.imprimirObjetos();
			menu.setearAliado();
			
//			if (elJuego.getEnemigo()!=null){ 
//				elJuego.moverenemigo(); //temporal
//				elJuego.accionar();
//				//menu.actualizar();
//			}
		}
	}
	
	public void detener() {
		activado = false;
	}

}