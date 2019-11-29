package Logica.Tienda.Aliados;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import GUI.Component_Custom.ImageIcon.Aliados.TexturaPistolSoldier;
import Logica.Aliados.PistolSoldier;
import Logica.General.GameObject;
import Logica.General.Nivel;

@SuppressWarnings("serial")
public class ButtonPistolSoldier extends ButtonPersonaje {

	/**
	 * Constructor de ButtonAllterrainMachinegun
	 */
	public ButtonPistolSoldier(Nivel n) {
		super(new TexturaPistolSoldier(), n);
		entidad = new PistolSoldier(POS_CREACION_X, POS_CREACION_Y, n);
		precio = entidad.getPrecio();
		entidad.morir();
		
		this.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				//Al hacer click en este botón, se crea un nuevo objeto.
				entidad = new PistolSoldier(POS_CREACION_X, POS_CREACION_Y, n);
			}
			
		});
		
		this.setText("<html><p> Pistol Soldier <br/> $" + precio + " </p></html>");
	}
	
	@Override
	public GameObject crearObjeto() {
		return (GameObject) entidad;
	}
}
