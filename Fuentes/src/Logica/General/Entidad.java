package Logica.General;

/**
 * 
 * @author 
 *
 */
public abstract class Entidad extends GameObject{

	public abstract void accept(Visitor v);
	
}
