package Logica.Tienda.Objetos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Logica.General.GameObject;
import Logica.General.Nivel;
import Logica.General.Objeto;
import Logica.Objetos.Barricada;
import Logica.Tienda.Aliados.ButtonPersonaje;

@SuppressWarnings("serial")
public class ButtonBarricada extends ButtonPersonaje {
	private static final String urlImg1 = "../Texturas/Personajes/pistol-soldier/pistol-soldier1.png";
	private static final String descripcion = "<html><p> Barricada <br/> $5500 </p></html>";

	/**
	 * Constructor de ButtonBarricada
	 */
	public ButtonBarricada(Nivel n) {
		super(descripcion, urlImg1, n);
		objeto = new Barricada(POS_CREACION_X, 0, n);
		
		this.addActionListener(new ActionListener(){
		
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//Al hacer click en este botón, se crea un nuevo objeto.
				objeto = new Barricada(POS_CREACION_X, 0, n);
			}
			
		});
		
		this.setText("<html><p> Barricada <br/> $" + objeto.getPrecio() + " </p></html>");
	}
	
	@Override
	public GameObject crearObjeto() {
		return objeto;
	}
}
