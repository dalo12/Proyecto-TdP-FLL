package Objetos;

import General.Objeto;

/**
 * Modela a los objetos temporales.
 * @author Comisión 25 (FERNÁNDEZ, LATOUQUETTE, LÓPEZ)
 * @version 1.0
 */
public abstract class ObjetoTemporal extends Objeto {
	protected int tiempo;
	//protected Thread reloj = new Thread();
	
	protected void descontar() {
		/*try {
			reloj.sleep(1000);
		}catch(InterruptedException ie) {
			//No sé que hacer en este caso
		}*/
		tiempo--;
	}
}
