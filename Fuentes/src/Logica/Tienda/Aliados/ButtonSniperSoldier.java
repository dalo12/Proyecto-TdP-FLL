package Logica.Tienda.Aliados;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Logica.Aliados.SniperSoldier;
import Logica.General.GameObject;
import Logica.General.Nivel;

@SuppressWarnings("serial")
public class ButtonSniperSoldier extends ButtonPersonaje {
	private static final String urlImg1 = "../Texturas/Personajes/sniper-soldier/sniper-soldier-preview.png";
	private static final String descripcion = "<html><p> Sniper Soldier <br/> $5500 </p></html>";
	
	/**
	 * Constructor de ButtonAllterrainMachinegun
	 */
	public ButtonSniperSoldier(Nivel n) {
		super(descripcion, urlImg1, n);
		entidad = new SniperSoldier(POS_CREACION_X, POS_CREACION_Y, n);
		int precio = entidad.getPrecio();
		entidad.morir();
		
		this.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				//Al hacer click en este botón, se crea un nuevo objeto.
				entidad = new SniperSoldier(POS_CREACION_X, POS_CREACION_Y, n);
			}
			
		});
		
		this.setText("<html><p> Sniper Soldier <br/> $" + precio + " </p></html>");
	}
	
	@Override
	public GameObject crearObjeto() {
		return (GameObject) entidad;
	}
}
