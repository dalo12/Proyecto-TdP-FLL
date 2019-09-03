package General;

/**
 * Modela los personajes del juego: aliados y enemigos.
 * @author Comisión 25 (FERNÁNDEZ, LATOUQUETTE, LÓPEZ)
 * @version 1.0
 */

public abstract class Personaje extends GameObject {
	protected int vida, fuerza_ataque, alcance_ataque, velocidad_ataque;

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
	public int getFuerza_ataque() {
		return fuerza_ataque;
	}

	/**
	 * Asigna una nueva fuerza de ataque al personaje
	 * @param fuerza_ataque La nueva fuerza de ataque del personaje
	 */
	public void setFuerza_ataque(int fuerza_ataque) {
		this.fuerza_ataque = fuerza_ataque;
	}

	/**
	 * Devuelve el alcance del ataque del personaje
	 * @return El alcance del ataque del personaje
	 */
	public int getAlcance_ataque() {
		return alcance_ataque;
	}

	/**
	 * Asigna un nuevo alcance al ataque del personaje
	 * @param alcance_ataque El nuevo alcance al ataque del personaje
	 */
	public void setAlcance_ataque(int alcance_ataque) {
		this.alcance_ataque = alcance_ataque;
	}

	/**
	 * Devuelve la velocidad de ataque del personaje
	 * @return La velocidad de ataque del personaje
	 */
	public int getVelocidad_ataque() {
		return velocidad_ataque;
	}

	/**
	 * Asigna una nueva velocidad de ataque al personaje
	 * @param velocidad_ataque La nueva velocidad de ataque del personaje
	 */
	public void setVelocidad_ataque(int velocidad_ataque) {
		this.velocidad_ataque = velocidad_ataque;
	}
	
}