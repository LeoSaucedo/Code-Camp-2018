/*
 * A computer player.
 */
import java.util.ArrayList;
import java.util.Random;
public class ComputerPlayer {
	private int hp;
	private int attackPower;
	private boolean isDead;
	private String name;
	Random rand = new Random();//Random number generator.
	public ComputerPlayer(int difficulty) {
		//Constructor
		//Create and fill an ArrayList of possible names.
		ArrayList<String> names = new ArrayList<String>();
		names.add("Jarvis");
		names.add("Eve");
		names.add("Turing");
				
		//Randomly select a name from the list and assign it to the bot.
		int nameIndex = rand.nextInt(names.size() - 1);
		name = names.get(nameIndex);
		
		//Difficulty selection.
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
	
	/**
	 * Sleeps for a specified amount of time.
	 * @param Seconds to sleep.
	 */
	public void sleep(int seconds) {
		try {
			Thread.sleep(seconds*1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
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
	
	/**
	 * Returns the name of the CPU.
	 * @return the name of the CPU.
	 */
	public String getName() {
		return name;
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
