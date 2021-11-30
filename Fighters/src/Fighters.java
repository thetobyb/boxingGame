

public class Fighters {
	String name;
	int lightAttack;
	int heavyAttack;
	int bite;
	int block;
	int attack;
	int defence;
	int health;
	boolean alive;
	
	public Fighters(String Name, int LightAttack, int HeavyAttack, int Block, int Attack, int Defence, int Health, boolean Alive) {
		
		name = Name;
		lightAttack = LightAttack;
		heavyAttack = HeavyAttack;
		block = Block;
		attack = Attack;
		defence = Defence;
		health = Health;
		alive = Alive;
	}
	
	void lightAttack(Fighters fighter2) {
		
		if(this.lightAttack > fighter2.lightAttack && this.lightAttack > fighter2.block ) {
			System.out.println(this.name + " used Light Attack! His attack was successful.");
			fighter2.health -= 10;
			System.out.println(fighter2.name + " has lost 10 Health Points! His HP is now " + fighter2.health);
			System.out.println("\n");
			isAlive(fighter2);
		} else {
			
			System.out.println(this.name + " attacked " + fighter2.name + " with a Light Attack!");
			System.out.println(fighter2.name + " blocked the Light Attack! His HP is still: " + fighter2.health);
			System.out.println("\n");
		}	
	}
	
//void heavyAttack(int BigGabeHeavy, int MikeHeavy, int MikeHealth, int MikeBlock) {
void heavyAttack(Fighters fighter2) {
		
		if(this.heavyAttack > fighter2.heavyAttack && this.heavyAttack > fighter2.block ) {
			System.out.println(this.name + " used Heavy Attack! His attack was successful.");
			fighter2.health -= 10;
			System.out.println(fighter2.name + " has lost 10 Health Points! His HP is now " + fighter2.health);
			this.block--;
			isAlive(fighter2);
			System.out.println("\n");
		} else {
			
			System.out.println(this.name + " attacked Mike with a Heavy Attack");
			System.out.println(fighter2.name + " blocked the Heavy Attack! His HP is still: " + fighter2.health);
			System.out.println("\n");
		}	
	}
	
	void trainAttack()  {
		attack++;
		lightAttack++;
		heavyAttack++;
		
	System.out.println("The Lion has trained it's attack! The new values are: LightAttack: " + lightAttack + " and HeavyAttack: " + heavyAttack);
		
	if(lightAttack >= 10) {
		lightAttack = 10;
		System.out.println("You've trained bite too much! Max Light Attack achieved.");
	}
	if(heavyAttack >= 10) {	
		heavyAttack = 10;
		System.out.println("You've trained attack too much! Max Heavy Attack achieved.");
	}
	}
	
	void trainDefence()  {
		
		block++;
		defence++;
	
		if(block >= 10) {
			block = 10;
			System.out.println("You've trained block too much! Max block achieved.");
		}
		if(defence >= 10) {	
			defence = 10;
			System.out.println("You've trained defence too much! Max defence achieved.");
		}
		}
	void isAlive(Fighters fighter2) {
		if(fighter2.health <= 0) {
			alive = false;
			System.out.println("\n");
			System.out.println("Oops, you've killed the lad! His health is 0. " + fighter2.name + " loses");
			
		} 
		
	}
	
	void isAlive2() {
		if(this.health <= 0) {
			alive = false;
			System.out.println("Oops, you've killed the lad! His health is 0. " + this.name + " loses");
			
		} 
		
	}
	}
