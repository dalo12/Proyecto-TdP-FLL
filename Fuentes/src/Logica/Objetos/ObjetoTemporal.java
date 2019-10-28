package Logica.Objetos;

import Logica.General.Nivel;
import Logica.General.Objeto;

/**
 * Modela a los objetos temporales.
 * @author Comisión 25 (FERRANTE, LATOUQUETTE, LÓPEZ)
 * @version 1.0
 */
public abstract class ObjetoTemporal extends Objeto {
	
	protected int duracion;

	protected ObjetoTemporal(Nivel n) {
		super(n);
	}
	
	/**
	 * Constructor protegido
	 * @param n Nivel al que pertenece el objeto
	 */
	protected ObjetoTemporal(Nivel n) {
		super(n);
	}
	
	
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
