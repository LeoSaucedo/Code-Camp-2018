/*
 * A computer player.
 */
import java.util.Random;
public class ComputerPlayer {
	private int hp;
	private int attackPower;
	private boolean isDead;
	Random rand = new Random();//Random number generator.
	public ComputerPlayer(int difficulty) {
		//Constructor
		if(difficulty == 1) {
			attackPower = 10;
			hp = 10;
		}else if(difficulty == 2) {
			attackPower = 20;
			hp = 20;
		}
		isDead = false;
	}
	
	/**
	 * Changes the parameter to the set HP.
	 * @param newHP the value to change the HP to.
	 */
	public void setHP(int newHP) {
		hp = newHP;
	}
	
	public void setDead(boolean dead) {
		isDead = dead;
	}
	
	//Accessor methods
	
	/**
	 * Generates a random attack strength.
	 * @return Randomly generated attack strength.
	 */
	public int getAttackStrength() {
		int strength = rand.nextInt(attackPower) + 1;//Generates a random number from 1 - attackStrength
		return strength;
	}
	
	/**
	 * Return the player's HP.
	 * @return the player's HP.
	 */
	public int getHP() {
		return hp;
	}
	
	/**
	 * Returns whether the player is alive or dead.
	 * @return whether the player is dead or not.
	 */
	public boolean getDead() {
		return isDead;
	}
	
	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {//Overriding toString
		String out = ("The CPU has "+hp+" HP.");
		return out;
	}
}
