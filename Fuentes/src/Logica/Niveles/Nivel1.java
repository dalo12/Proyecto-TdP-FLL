package Logica.Niveles;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import Logica.General.Enemigo;
import Logica.General.Nivel;
import Logica.Enemigos.*;

/**
 * Modela el primer nivel del juego.
 * @author Comisión 25 (FERRANTE, LATOUQUETTE, LÓPEZ)
 * @version 1.0
 */

//TODO Ya no sirve
public class Nivel1 extends Nivel {
	protected static final int CANT_ENEMIGOS = 4;
	protected static final int CANT_COLUMNAS = 10;
	
	public Nivel1() {
		Enemigo e = new Kangaroo(0,0);
		int dif = 0;
		Random r = new Random();
		int y, cant;
		
		/*
		 * Genera los enemigos por oleada, entre 20 y 30 enemigos por oleada y con dificultad aleatoria
		 */
		this.oleadas =  new ArrayList<List<Enemigo>>(3); //hay 3 oleadas
		for(int i=0; i<3; i++) { //a cada una de las 3 oleadas, las lleno de enemigos
			cant = (int) Math.ceil(r.nextInt(10)) + 20; //entre 20 y 30 enemigos por oleada
			for(int j=0; j<cant; j++) {
				y = r.nextInt(6); //la coordenada "y" de la grilla donde va a aparecer el enemigo
				
				dif = (int) Math.ceil(r.nextInt(CANT_ENEMIGOS)); //dificultad de los enemigos
				switch(dif) {
					case 0:{ 
						e = new Kangaroo(CANT_COLUMNAS, y);
						break;
					} 
					case 1: { 
						e = new BoxKangaroo(CANT_COLUMNAS, y);
						break;
					} 
					case 2: { 
						e = new KnifeKangaroo(CANT_COLUMNAS, y);
						break;
					} 
					case 3: { 
						e = new PistolKangaroo(CANT_COLUMNAS, y);
						break;
					} 
				}
		
				this.oleadas.get(i).add(e);
			}
		}
	}
}
