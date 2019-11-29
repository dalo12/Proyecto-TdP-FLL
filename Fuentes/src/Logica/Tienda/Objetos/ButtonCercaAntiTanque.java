package Logica.Tienda.Objetos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import GUI.Component_Custom.ImageIcon.Objetos.TexturaCercaAntiTanque;
import Logica.General.GameObject;
import Logica.General.Nivel;
import Logica.Objetos.CercaAntiTanque;
import Logica.Tienda.Aliados.ButtonPersonaje;

@SuppressWarnings("serial")
public class ButtonCercaAntiTanque extends ButtonPersonaje {
	
	/**
	 * Constructor de ButtonCercaAntiTanque
	 */
	public ButtonCercaAntiTanque(Nivel n) {
		super(new TexturaCercaAntiTanque(), n);
		entidad = new CercaAntiTanque(POS_CREACION_X, 0, n);
		precio = entidad.getPrecio();
		entidad.morir();
		
		this.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				//Al hacer click en este botón, se crea un nuevo objeto.
				entidad = new CercaAntiTanque(POS_CREACION_X, 0, n);
			}
			
		});
		this.setText("<html><p> Cerca Antitanque <br/> $" + precio + " </p></html>");
	}
	
	@Override
	public GameObject crearObjeto() {
		return (GameObject) entidad;
	}
}
