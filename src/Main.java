/**
 * A simple game for my Code Camp.
 * @author Carlos Saucedo
 *
 */
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to my program!");
		
		//Get information to construct a HumanPlayer.
		System.out.println("What is your name?");
		String userName = input.next();
		System.out.println("What is your age?");
		int userAge = input.nextInt();
		
		//Construct the HumanPlayer, user.
		HumanPlayer user = new HumanPlayer(userName, userAge);
		
		//Get information on the CPU.
		System.out.println("Please enter the CPU difficulty (1 or 2):");
		int difficulty = input.nextInt();
		
		//Construct the ComputerPlayer, CPU.
		ComputerPlayer cpu = new ComputerPlayer(difficulty);
		
		while(!cpu.getDead() && !user.getDead()) {//While both players are alive
			int userStrength = user.getAttackStrength();//Stores user's current attack strength.
			cpu.setHP(cpu.getHP() - userStrength);//Reduces the user's HP by the attack strength.
			System.out.println(user.getName() + " attacks CPU! "+userStrength+" damage!");//Tells the user what happened.
			
			
			int cpuStrength = cpu.getAttackStrength();
			user.setHP(user.getHP() - cpuStrength);
			System.out.println("CPU attacks! "+cpuStrength+" damage!");
			
			//Verifies whether the players are dead.
			if(user.getHP() <= 0) {
				user.setDead(true);
			}else if(cpu.getHP() <= 0) {
				cpu.setDead(true);
			}
			
			//Printing out the statuses of each player.
			System.out.println(user);
			System.out.println(cpu);
			System.out.println("----------");
			
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		if(user.getDead()) {
			System.out.println("CPU wins! Better luck next time.");
		}else if(cpu.getDead()) {
			System.out.println(user.getName() + " wins!");
		}
		
		System.out.println("Thanks for playing!");
	}
	

}
