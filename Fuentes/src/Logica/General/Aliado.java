package Logica.General;

import java.awt.Rectangle;
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
	protected int contador_tiempo;

	/**
	 * Constructor protegido
	 * @param n Nivel al que pertenece el aliado
	 */
	protected Aliado(Nivel n) {
		super(n);
		contador_tiempo = 0;
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
		grafica.atacar();
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
		if(contador_tiempo > 0) {
			contador_tiempo--;
			grafica.quieto();
		}
		for(GameObject g : nivel.getListaEntidades()) {
			interactuar(g);
			/*if((posicionX + (alcanceAtaque * grafica.getLabel().getWidth()) >= g.getPosicionX())  && g.getPosicionX() > posicionX) {
				interactuar(g);
				System.out.println("interactuar");
			}
			*/
		}
		if(vida <= 0) {
			morir();
		}
	}
	
	public boolean puedeDisparar(GameObject go) {
		boolean a_retornar = false;
		
		Rectangle r_this, r_go;
		r_this = new Rectangle(this.posicionX, this.posicionY, this.getGrafica().getLabel().getWidth()*this.tamanoX, this.getGrafica().getLabel().getY());
		r_go = new Rectangle(go.getPosicionX(), go.getPosicionY(), go.getGrafica().getLabel().getX(), go.getGrafica().getLabel().getY());
		
		if(r_this.intersects(r_go) && (go.getGrafica().getLabel().getX() < this.grafica.getLabel().getX())) {
			a_retornar = true;
		}
		
		return a_retornar;
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
				int resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea vender este personaje?", "Confirmación", JOptionPane.YES_NO_OPTION);
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
	
	@Override
	public void morir() {
		grafica.morir();
		nivel.eliminarObjeto(this);
	}
}
