package Logica.General;
import java.util.List;


public class Juego {

	protected Nivel nivel;
	protected Visitor visitor;
	protected List<GameObject> lista;
	//temporal
	protected GameObject enemigo; 
	
	public Juego(GameObject e) {
		enemigo = e;
	}
	
	//temporal
	public void moverenemigo() {
		enemigo.setPosicion_x(enemigo.getPosicion_x() - 10);
	}
	
	public GameObject getEnemigo() {
		return enemigo;
	}
	
	public void mover() {
//		for(GameObject g : lista)
			
	}
	
	public void insertarAliado() {
		
	}
	
	public void insertarEnemigo() {
		
	}
	
}
