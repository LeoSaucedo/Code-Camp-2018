/**
 * A Human Player.
 */
import java.util.Random;
public class HumanPlayer {
	private int hp;
	private int attackPower;
	private String name;
	private boolean isDead;
	Random rand = new Random(); //Random number generator
	public HumanPlayer(String name, int age) {
		//Constructor
		this.name = name;
		attackPower = age;
		hp = age;
		isDead = false;
	}
	
	/**
	 * Sets the user's HP to a specified value
	 * @param newHP value to set tue user's HP to.
	 */
	public void setHP(int newHP) {
		hp = newHP;
	}
	
	/**
	 * Sets whether the user is alive or dead
	 * @param dead Whether the user is dead or not.
	 */
	public void setDead(boolean dead) {	
		isDead = dead;
	}
	//Accessor methods
	
	public int getAttackStrength() {
		int strength = rand.nextInt(attackPower) + 1; //Generates a random number from 1 - attack power.
		return strength;
	}
	
	/**
	 * Gets the user's HP.
	 * @return the user's HP.
	 */
	public int getHP() {
		return hp;
	}
	
	/**
	 * Returns whether the user is alive or dead.
	 * @return whether the user is dead or not.
	 */
	public boolean getDead() {
		return isDead;
	}
	
	public String getName() {
		return name;
	}
	
	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {//Overriding toString
		String out = ("Player "+name+" has "+hp+" hp.");
		return out;
	}
}
