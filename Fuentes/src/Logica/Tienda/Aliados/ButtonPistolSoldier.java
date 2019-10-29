package Logica.Tienda.Aliados;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Logica.Aliados.PistolSoldier;
import Logica.General.GameObject;
import Logica.General.Nivel;

@SuppressWarnings("serial")
public class ButtonPistolSoldier extends ButtonPersonaje {
	private static final String urlImg1 = "../Texturas/Personajes/pistol-soldier/pistol-soldier-0.png";
	private static final String descripcion = "<html><p> Pistol Soldier <br/> $5500 </p></html>";
	
	/**
	 * Constructor de ButtonAllterrainMachinegun
	 */
	public ButtonPistolSoldier(Nivel n) {
		super(descripcion, urlImg1, n);
		this.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				//Al hacer click en este botón, se crea un nuevo objeto.
				objeto = new PistolSoldier(POS_CREACION_X, 0, n);
			}
			
		});
	}
	
	@Override
	public GameObject crearObjeto() {
		return objeto;
	}
}
