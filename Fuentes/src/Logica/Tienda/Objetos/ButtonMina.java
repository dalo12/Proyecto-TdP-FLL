package Logica.Tienda.Objetos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import GUI.Component_Custom.ImageIcon.Objetos.TexturaMina;
import Logica.General.GameObject;
import Logica.General.Nivel;
import Logica.Objetos.Mina;
import Logica.Tienda.Aliados.ButtonPersonaje;

@SuppressWarnings("serial")
public class ButtonMina extends ButtonPersonaje {

	/**
	 * Constructor de ButtonMina
	 */
	public ButtonMina(Nivel n) {
		super(new TexturaMina(), n);
		entidad = new Mina(POS_CREACION_X, 0, n);
		precio = entidad.getPrecio();
		entidad.morir();
		
		this.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				//Al hacer click en este botón, se crea un nuevo objeto.
				entidad = new Mina(POS_CREACION_X, 0, n);
			}
			
		});
		
		this.setText("<html><p> Mina <br/> $" + precio + " </p></html>");
	}
	
	@Override
	public GameObject crearObjeto() {
		return (GameObject) entidad;
	}
}
