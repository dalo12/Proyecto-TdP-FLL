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
		this.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				//Al hacer click en este botón, se crea un nuevo objeto.
				objeto = new SniperSoldier(0, 0, n);
			}
			
		});
	}
	
	@Override
	public GameObject crearObjeto() {
		return objeto;
	}
}
