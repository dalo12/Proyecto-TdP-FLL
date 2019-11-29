package Logica.Tienda.Aliados;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import GUI.Component_Custom.ImageIcon.Aliados.TexturaBazookaSoldier;
import Logica.Aliados.BazookaSoldier;
import Logica.General.GameObject;
import Logica.General.Nivel;

@SuppressWarnings("serial")
public class ButtonBazookaSoldier extends ButtonPersonaje {

	/**
	 * Constructor de ButtonAllterrainMachinegun
	 */
	public ButtonBazookaSoldier(Nivel n) {
		super(new TexturaBazookaSoldier(), n);
		entidad = new BazookaSoldier(POS_CREACION_X, POS_CREACION_Y, n);
		precio = entidad.getPrecio();
		entidad.morir();
		
		this.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				//Al hacer click en este botón, se crea un nuevo objeto.
				entidad = new BazookaSoldier(POS_CREACION_X, POS_CREACION_Y, n);
			}
			
		});
		
		this.setText("<html><p> Bazooka Soldier <br/> $" + precio + " </p></html>");
	}
	
	@Override
	public GameObject crearObjeto() {
		return (GameObject) entidad;
	}
}
