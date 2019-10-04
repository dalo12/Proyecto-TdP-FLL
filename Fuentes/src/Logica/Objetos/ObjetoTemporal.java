package Logica.Objetos;

import Logica.General.Objeto;

/**
 * Modela a los objetos temporales.
 * @author Comisión 25 (FERRANTE, LATOUQUETTE, LÓPEZ)
 * @version 1.0
 */
public abstract class ObjetoTemporal extends Objeto {
	
	protected int duracion;
	
	/**
	 * Asigna una nueva duracion al objeto.
	 * @param d La nueva duracion a asignar.
	 */
	public void setDuracion(int d) {
		duracion = d;
	}
	
	/**
	 * Retorna la duracion restante del objeto.
	 * @return La duracion restante del objeto.
	 */
	public int getDuracion() {
		return duracion;
	}
	
	@Override
	public void accionar() {
		// TODO Auto-generated method stub
		
	}

}
