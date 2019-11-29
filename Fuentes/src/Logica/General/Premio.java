package Logica.General;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.LinkedList;
import java.util.List;

import Logica.General.Visitors.Visitor;

/**
 * Modela los powerups
 * @author Comisión 25 (FERRANTE, LATOUQUETTE, LÓPEZ)
 * @version 1.0
 */
public abstract class Premio extends GameObject {

	protected int duracionEnMapa;
	protected int duracionActivo;
	protected boolean activo;
	protected boolean ejecutado;
	protected List<GameObject> empoderados;
	protected Nivel nivel;
	protected Visitor visitor_retirar_efecto;
	
	/**
	 * Constructor protegido
	 * @param n Nivel al que pertenece el premio
	 */
	protected Premio(Nivel n) {
		super(n);
		empoderados = new LinkedList<GameObject>();
		activo = false;
		ejecutado = false;
		nivel = n;
		
		n.insertarObjeto(this);
	}
	
	public void activar() {
		activo = true;
		grafica.getLabel().setVisible(false);
		grafica.getLabel().setOpaque(false);
	}

	@Override
	public void accionar() {
		if(!activo) {
			duracionEnMapa--;
			if(duracionEnMapa == 0) {
				//this.activar();
				this.morir();
			}
		}
	}

	/**
	 * Acepta un visitor.
	 */
	@Override
	public void accept(Visitor v) {
		v.visitPremio(this);
	}

	/**
	 * Aplica el efecto a contener sobre un enemigo
	 * @param enemigo Enemigo
	 */
	protected abstract void aplicarEfecto(Enemigo enemigo);
	
	/**
	 * @return El nivel actual del premio
	 */
	public Nivel getNivel() {
		return this.nivel;
	}
	
	/**
	 * Clase PremioActivado: Clase que redefine el evento clicked activar y ejecutar un premio
	 */
	protected class PremioActivado extends MouseAdapter {
		private Premio premio;
		
		public PremioActivado(Premio premio) {
			this.premio = premio;
		}
		
		public void mouseClicked(MouseEvent e){
			premio.setPosicionX(-1000);
			premio.setPosicionY(-1000);
			premio.activar();
			System.out.println("SE ENTRÓ EN EL MOUSE CLICKED. CAPTURADO CLICK DEL MOUSE!");
		}
	}

	/**
	 * @return the empoderados
	 */
	public List<GameObject> getEmpoderados() {
		return empoderados;
	}

	/**
	 * @param empoderados the empoderados to set
	 */
	public void setEmpoderados(List<GameObject> empoderados) {
		this.empoderados = empoderados;
	}
	
}
