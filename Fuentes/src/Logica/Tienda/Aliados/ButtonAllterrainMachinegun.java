package Logica.Tienda.Aliados;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import GUI.Component_Custom.ImageIcon.Aliados.TexturaAllterrainMachinegun;
import Logica.Aliados.AllterrainMachinegun;
import Logica.General.GameObject;
import Logica.General.Nivel;

@SuppressWarnings("serial")
public class ButtonAllterrainMachinegun extends ButtonPersonaje {
	
	/**
	 * Constructor de ButtonAllterrainMachinegun
	 */
	public ButtonAllterrainMachinegun(Nivel n) {
		super(new TexturaAllterrainMachinegun(), n);		
		entidad = new AllterrainMachinegun(POS_CREACION_X, POS_CREACION_Y, n);
		precio = entidad.getPrecio();
		entidad.morir();
		
		this.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				//Al hacer click en este botón, se crea un nuevo objeto.
				entidad = new AllterrainMachinegun(POS_CREACION_X, POS_CREACION_Y, n);
			}
			
		});
		
		this.setText("<html><p> Allterrain Machinegun <br/> $" + precio + " </p></html>");
	}
	
	@Override
	public GameObject crearObjeto() {
		return (GameObject) entidad;
	}
}
