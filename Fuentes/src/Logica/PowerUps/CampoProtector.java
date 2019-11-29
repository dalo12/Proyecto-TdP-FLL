package Logica.PowerUps;

import GUI.Component_Custom.ImageIcon.PowerUps.TexturaCampoProtector;
import GUI.Controlador.GOGrafico.GOGrafico;
import Logica.General.GameObject;
import Logica.General.Nivel;
import Logica.General.Personaje;
import Logica.General.Visitors.Visitor;

/**
 * Modela el campo protector generado por San Lugano
 * @author Comisión 25 (FERRANTE, LATOUQUETTE, LÓPEZ)
 * @version 1.0
 */
public class CampoProtector extends GameObject {
	protected Personaje entidad;
	protected Nivel nivel;
	protected int tiempo;
	
	public CampoProtector(Personaje o) {
		super(o.getNivel());
		nivel = o.getNivel();
		entidad = o;
		
		this.posicionX = o.getPosicionX();
		this.posicionY = o.getPosicionY();
		this.tamanoX = o.getTamanoX();
		this.tamanoY = o.getTamanoY();
		this.grafica = new GOGrafico(this.posicionX, this.posicionY, this.tamanoX, this.tamanoY, new TexturaCampoProtector(), nivel.getMapa());
		nivel.insertarObjeto(this);
		
	}
	
	
	@Override
	public void accionar() {
		this.posicionX = entidad.getPosicionX();
		this.posicionY = entidad.getPosicionY();
		if(entidad.getVida() <= 0) {
			this.morir();
		}
	}

	@Override
	public void accept(Visitor v) {
		v.visitCampoProtector(this);
	}

}
