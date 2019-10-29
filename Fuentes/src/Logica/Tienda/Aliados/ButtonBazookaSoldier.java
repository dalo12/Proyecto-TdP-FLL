package Logica.Tienda.Aliados;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Logica.Aliados.BazookaSoldier;
import Logica.General.GameObject;
import Logica.General.Nivel;

@SuppressWarnings("serial")
public class ButtonBazookaSoldier extends ButtonPersonaje {
	private static final String urlImg1 = "../Texturas/Personajes/bazooka-soldier/bazooka-soldier-0.png";
	private static final String descripcion = "<html><p> Bazooka Soldier <br/> $5500 </p></html>";
	
	/**
	 * Constructor de ButtonAllterrainMachinegun
	 */
	public ButtonBazookaSoldier(Nivel n) {
		super(descripcion, urlImg1, n);
		this.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				//Al hacer click en este botón, se crea un nuevo objeto.
				objeto = new BazookaSoldier(POS_CREACION_X, 0, n);
			}
			
		});
	}
	
	@Override
	public GameObject crearObjeto() {
		return objeto;
	}
}
