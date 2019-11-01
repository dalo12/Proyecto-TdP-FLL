package Logica.General;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JOptionPane;

import Logica.General.Visitors.Visitor;

/**
 * Modela todos los aliados (es decir, los personajes elegibles por el jugador) del juego.
 * @author Comisión 25 (FERRANTE, LATOUQUETTE, LÓPEZ)
 * @version 1.0
 */
public abstract class Aliado extends Personaje {
	//Atributos de instancia
	protected int precio;
	protected int vidaMaxima;

	/**
	 * Constructor protegido
	 * @param n Nivel al que pertenece el aliado
	 */
	protected Aliado(Nivel n) {
		super(n);
	}
	/**
	 * Devuelve el precio del aliado
	 * @return El precio del aliado
	 */
	public int getPrecio() {
		return precio;
	}

	/**
	 * Asigna un nuevo precio al aliado
	 * @param precio El nuevo precio a asignar
	 */
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	/**
	 * Se invoca al vender al aliado. En caso de que el aliado tenga toda su vida, al venderlo devuelve 
	 * todo su precio en monedas. En caso contrario, devuelve solamente la mitad de su precio.
	 * @return La cantidad de monedas correspondiente
	 */
	public int vender() {
		int valor = precio;
		if(vida < vidaMaxima) {
			valor = valor / 2;
		}
		
		return valor;
	}
	
	/**
	 * Ataca a un enemigo
	 * @param a El enemigo a atacar
	 */
	public void atacar(Enemigo o) {
		o.setVida(o.getVida() - fuerzaAtaque);
	}
	
	/**
	 * Acepta un visitor.
	 */
	public void accept(Visitor v) {
		v.visitAliado(this);
	}

	@Override
	public void accionar() {
		for(GameObject g : nivel.getListaEntidades()) {
			if(g.getPosicionX() <= posicionX + alcanceAtaque && g.getPosicionX() > posicionX) {
				interactuar(g);
			}
		}
	}
	
	/**
	 * Clase AliadoVenta: Clase que redefine el evento clicked para eliminar un aliado
	 */
	protected class AliadoVenta extends MouseAdapter {
		private Aliado aliado;
		
		public AliadoVenta(Aliado aliado) {
			this.aliado = aliado;
		}
		
		public void mouseClicked(MouseEvent e){
			if (aliado.getGrafica()!=null) {
				int resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro?", "Alerta!", JOptionPane.YES_NO_OPTION);
				if (resp==JOptionPane.YES_OPTION) {
					int monedas_recuperadas = aliado.vender();
					nivel.agregarMonedas(monedas_recuperadas);
					nivel.getMapa().getTablero().remove(aliado.getGrafica().getLabel());
					nivel.getListaEntidades().remove(aliado);
					nivel.getMapa().getTablero().updateUI();
					nivel.getMapa().getTablero().repaint();
				}
			}
		}
	}
}
