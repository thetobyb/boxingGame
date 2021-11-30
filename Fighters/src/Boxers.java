import java.util.Scanner;



public class Boxers {
//	String name;
//	int lightAttack;
//	int heavyAttack;
//	int block;
//	int attack;
//	int defence;
	
	
	public static void main(String[] args) {
		
		
		
		Scanner scan = new Scanner(System.in);
		// TODO Auto-generated method stub
		Fighters BigGabe = new Fighters("BigGabe", 3, 8, 4, 8, 3, 100, true);
		Fighters Mike = new Fighters("Mike", 9, 9, 9, 9, 9, 100, true);
		System.out.println("Welcome to the fighters game! Have fun!");
		System.out.println("Your fighter selection!");
		System.out.println("1. BigGabe");
		System.out.println("2. Mike");
		
		System.out.println("Select your fighter, fighter 1!");
		int pickedFighter = scan.nextInt();
		System.out.println("Select your fighter, fighter 2!");
		int pickedFighter2 = scan.nextInt();
		
		switch(pickedFighter) {
		
		case 1:
			System.out.println("Player 1 Chose Fighter: BigGabe");
		
		break;
		case 2:
			System.out.println("Player 2 Chose Figter: Mike");
		break;
		}
		
		switch(pickedFighter2) {
		case 1:
			System.out.println("Player 1 Chose Fighter: BigGabe");
		
		break;
		case 2:
			System.out.println("Player 2 Chose Figter: Mike");
		break;
				
		}
		
		if(pickedFighter == 1 && pickedFighter2 == 2) {
			System.out.println("The boxing fight is about to begin! The fight is BigGabe vs Mike");
			System.out.println("\n");
			
			while(BigGabe.health > 0 && Mike.health > 0) {
		    	System.out.println("Your Attack Selection!");
				System.out.println("1. Light Attack");
				System.out.println("2. Heavy Attack");
				System.out.println("Fighter 1 ! What attack would you like to do?");
				int pickedAttack = scan.nextInt();
				System.out.println("\n");
				
				
				switch(pickedAttack) {
				
				case 1:
					BigGabe.lightAttack(Mike);
				
				break;
				case 2:
					BigGabe.heavyAttack(Mike);
					break;
				}
				
				System.out.println("Your Attack Selection!");
				System.out.println("1. Light Attack");
				System.out.println("2. Heavy Attack");
				System.out.println("Fighter 2 ! What attack would you like to do?");
				int pickedAttack2 = scan.nextInt();
				System.out.println("\n");
				
				
				switch(pickedAttack2) {
				
				case 1:
					Mike.lightAttack(BigGabe);
				
				break;
				case 2:
					Mike.heavyAttack(BigGabe);
					break;
				}
			
				
				
			
//			BigGabe.lightAttack(Mike);
//			System.out.println("\n");
//			BigGabe.heavyAttack(Mike);
//			System.out.println("\n");
		
		}
		}
		if(pickedFighter == 2 && pickedFighter2 == 1) {
			System.out.println("The boxing fight is about to begin! The fight is BigGabe vs Mike");
			System.out.println("\n");
			
			while (BigGabe.health > 0 && Mike.health > 0) {
				
		    	System.out.println("Your Attack Selection!");
				System.out.println("1. Light Attack");
				System.out.println("2. Heavy Attack");
				System.out.println("Fighter 1 ! What attack would you like to do?");
				int pickedAttack = scan.nextInt();
				System.out.println("\n");
				
				
				switch(pickedAttack) {
				
				case 1:
					Mike.lightAttack(BigGabe);
				
				break;
				case 2:
					Mike.heavyAttack(BigGabe);
					break;
				}
				
				System.out.println("Your Attack Selection!");
				System.out.println("1. Light Attack");
				System.out.println("2. Heavy Attack");
				System.out.println("\n");
				System.out.println("Fighter 2 ! What attack would you like to do?");
				int pickedAttack2 = scan.nextInt();
				System.out.println("\n");
				
				
				switch(pickedAttack2) {
				
				case 1:
					BigGabe.lightAttack(Mike);
				
				break;
				case 2:
					BigGabe.heavyAttack(Mike);
					break;
				}
			
		    } 
			
	
	}
	if(pickedFighter == 2 && pickedFighter2 == 2 || pickedFighter == 1 && pickedFighter == 1) {
		System.out.println("Error picking fighters! You cannot fight yourself!");
		System.out.println("Please restart the game.");
		
		
	}
		
		scan.close();
	
	}
}


