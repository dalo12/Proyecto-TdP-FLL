package Logica.Tienda.Objetos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import GUI.Component_Custom.ImageIcon.Objetos.TexturaBarricada;
import Logica.General.GameObject;
import Logica.General.Nivel;
import Logica.Objetos.Barricada;
import Logica.Tienda.Aliados.ButtonPersonaje;

@SuppressWarnings("serial")
public class ButtonBarricada extends ButtonPersonaje {
	
	/**
	 * Constructor de ButtonBarricada
	 */
	public ButtonBarricada(Nivel n) {
		super(new TexturaBarricada(), n);
		entidad = new Barricada(POS_CREACION_X, 0, n);
		int precio = entidad.getPrecio();
		entidad.morir();
		
		this.addActionListener(new ActionListener(){
		
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//Al hacer click en este botón, se crea un nuevo objeto.
				entidad = new Barricada(POS_CREACION_X, 0, n);
			}
			
		});
		
		this.setText("<html><p> Barricada <br/> $" + precio + " </p></html>");
	}
	
	@Override
	public GameObject crearObjeto() {
		return (GameObject) entidad;
	}
}
