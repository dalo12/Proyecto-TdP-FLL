package Logica.Tienda.Objetos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Logica.General.GameObject;
import Logica.General.Nivel;
import Logica.Objetos.Mina;
import Logica.Tienda.Aliados.ButtonPersonaje;

@SuppressWarnings("serial")
public class ButtonMina extends ButtonPersonaje {
	private static final String urlImg1 = "../Texturas/Personajes/pistol-soldier/pistol-soldier1.png";
	private static final String descripcion = "<html><p>Mina <br/> $5500 </p></html>";
	
	/**
	 * Constructor de ButtonMina
	 */
	public ButtonMina(Nivel n) {
		super(descripcion, urlImg1, n);
		objeto = new Mina(POS_CREACION_X, 0, n);
		this.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				//Al hacer click en este botón, se crea un nuevo objeto.
				objeto = new Mina(POS_CREACION_X, 0, n);
			}
			
		});
		
		this.setText("<html><p> Mina <br/> $" + objeto.getPrecio() + " </p></html>");
	}
	
	@Override
	public GameObject crearObjeto() {
		return objeto;
	}
}
