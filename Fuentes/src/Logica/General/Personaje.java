package Logica.General;

/**
 * Modela los personajes del juego: aliados y enemigos.
 * @author Comisión 25 (FERRANTE, LATOUQUETTE, LÓPEZ)
 * @version 1.0
 */

public abstract class Personaje extends GameObject {
	protected int vida, fuerzaAtaque, alcanceAtaque, velocidadAtaque;
	
	/**
	 * Constructor protegido
	 * @param n Nivel en el que está el personaje
	 */
	protected Personaje(Nivel n) {
		super(n);
	}
	
	/**
	 * Devuelve la cantidad de vida que aún tiene el personaje
	 * @return La cantidad de vida que aún tiene el personaje
	 */
	public int getVida() {
		return vida;
	}

	/**
	 * Asigna una nueva cantidad de vida al personaje
	 * @param vida La nueva cantidad de vida del personaje
	 */
	public void setVida(int vida) {
		this.vida = vida;
	}

	/**
	 * Devuelve la fuerza de ataque del personaje
	 * @return La fuerza de ataque del personaje
	 */
	public int getFuerza() {
		return fuerzaAtaque;
	}

	/**
	 * Asigna una nueva fuerza de ataque al personaje
	 * @param fuerzaAtaque La nueva fuerza de ataque del personaje
	 */
	public void setFuerza(int fuerzaAtaque) {
		this.fuerzaAtaque = fuerzaAtaque;
	}

	/**
	 * Devuelve el alcance del ataque del personaje
	 * @return El alcance del ataque del personaje
	 */
	public int getAlcance() {
		return alcanceAtaque;
	}

	/**
	 * Asigna un nuevo alcance al ataque del personaje
	 * @param alcanceAtaque El nuevo alcance al ataque del personaje
	 */
	public void setAlcance(int alcanceAtaque) {
		this.alcanceAtaque = alcanceAtaque;
	}

	/**
	 * Devuelve la velocidad de ataque del personaje
	 * @return La velocidad de ataque del personaje
	 */
	public int getVelocidadAtaque() {
		return velocidadAtaque;
	}

	/**
	 * Asigna una nueva velocidad de ataque al personaje
	 * @param velocidad_ataque La nueva velocidad de ataque del personaje
	 */
	public void setVelocidadAtaque(int velocidadAtaque) {
		this.velocidadAtaque = velocidadAtaque;
	}
		
}