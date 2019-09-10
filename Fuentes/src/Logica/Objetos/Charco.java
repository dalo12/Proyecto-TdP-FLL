package Logica.Objetos;

/**
 * Modela al charco (objeto de mapa).
 * @author Comisión 25 (FERNÁNDEZ, LATOUQUETTE, LÓPEZ)
 * @version 1.0
 */
public class Charco extends ObjetoTemporal {
	
	public Charco(int x, int y) {
		//atributos físicos
		this.posicion_x = x;
		this.posicion_y = y;
		this.tamano_x = 1;
		this.tamano_y = 1;
		this.textura = "";
		
		//atributos lógicos
		this.tiempo = 30;
	}
	
	@Override
	public void serAtacado(int ataque) {
		// Si soy atacado, no hago nada
	}

	@Override
	public boolean sigoVivo() {
		return tiempo > 0;
	}

}
