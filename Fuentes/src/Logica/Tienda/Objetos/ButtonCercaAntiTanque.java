package Logica.Tienda.Objetos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Logica.General.GameObject;
import Logica.General.Nivel;
import Logica.Objetos.CercaAntiTanque;
import Logica.Tienda.Aliados.ButtonPersonaje;

@SuppressWarnings("serial")
public class ButtonCercaAntiTanque extends ButtonPersonaje {
	private static final String urlImg1 = "../Texturas/Personajes/pistol-soldier/pistol-soldier1.png";
	private static final String descripcion = "<html><p> Bazooka Soldier <br/> $5500 </p></html>";
	
	/**
	 * Constructor de ButtonCercaAntiTanque
	 */
	public ButtonCercaAntiTanque(Nivel n) {
		super(descripcion, urlImg1, n);
		objeto = new CercaAntiTanque(POS_CREACION_X, 0, n);
		this.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				//Al hacer click en este botón, se crea un nuevo objeto.
				objeto = new CercaAntiTanque(POS_CREACION_X, 0, n);
			}
			
		});
		this.setText("<html><p> Cerca Antitanque <br/> $" + objeto.getPrecio() + " </p></html>");
	}
	
	@Override
	public GameObject crearObjeto() {
		return objeto;
	}
}
