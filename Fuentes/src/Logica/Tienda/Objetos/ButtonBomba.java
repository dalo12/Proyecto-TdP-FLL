package Logica.Tienda.Objetos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import GUI.Component_Custom.ImageIcon.Objetos.TexturaBomba;
import Logica.General.GameObject;
import Logica.General.Nivel;
import Logica.Objetos.Bomba;
import Logica.Tienda.Aliados.ButtonPersonaje;

@SuppressWarnings("serial")
public class ButtonBomba extends ButtonPersonaje {
	
	/**
	 * Constructor de ButtonBomba
	 */
	public ButtonBomba(Nivel n) {
		super(new TexturaBomba(), n);
		entidad = new Bomba(POS_CREACION_X, 0, n);
		precio = entidad.getPrecio();
		entidad.morir();
		
		this.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				//Al hacer click en este botón, se crea un nuevo objeto.
				entidad = new Bomba(POS_CREACION_X, 0, n);
			}
			
		});
		
		this.setText("<html><p> Bomba <br/> $" + precio + " </p></html>");
	}
	
	@Override
	public GameObject crearObjeto() {
		return (GameObject) entidad;
	}
}
