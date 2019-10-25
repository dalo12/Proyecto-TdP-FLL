package Logica.Tienda.Objetos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Logica.General.GameObject;
import Logica.General.Nivel;
import Logica.Objetos.Piedra;
import Logica.Tienda.Aliados.ButtonPersonaje;

@SuppressWarnings("serial")
public class ButtonPiedra extends ButtonPersonaje {
	private static final String urlImg1 = "../Texturas/Personajes/pistol-soldier/pistol-soldier1.png";
	private static final String descripcion = "<html><p>Piedra <br/> $5500 </p></html>";
	
	/**
	 * Constructor de ButtonPiedra
	 */
	public ButtonPiedra(Nivel n) {
		super(descripcion, urlImg1, n);
		this.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				//Al hacer click en este botón, se crea un nuevo objeto.
				objeto = new Piedra(0, 0, n);
			}
			
		});
	}
	
	@Override
	public GameObject crearObjeto() {
		return objeto;
	}
}
