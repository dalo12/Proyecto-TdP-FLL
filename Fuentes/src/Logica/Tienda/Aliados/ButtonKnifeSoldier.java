package Logica.Tienda.Aliados;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Logica.Aliados.KnifeSoldier;
import Logica.General.GameObject;
import Logica.General.Nivel;

@SuppressWarnings("serial")
public class ButtonKnifeSoldier extends ButtonPersonaje {
	private static final String urlImg1 = "../Texturas/Personajes/pistol-soldier/pistol-soldier1.png";
	private static final String descripcion = "<html><p> Knife Soldier <br/> $5500 </p></html>";
	
	/**
	 * Constructor de ButtonAllterrainMachinegun
	 */
	public ButtonKnifeSoldier(Nivel n) {
		super(descripcion, urlImg1, n);
		this.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				//Al hacer click en este botón, se crea un nuevo objeto.
				objeto = new KnifeSoldier(0, 0, n);
			}
			
		});
	}
	
	@Override
	public GameObject crearObjeto() {
		return objeto;
	}
}
