package PetProject;

public class Shark {
	
	//charasteristics
	public String name;
	private int hunger;
	private int tiredness;
	private int health;
	private int happiness;
	private int level;
	
	//constructor small chaining initializing values
	public Shark() {
		this("NoNameShark");
	}
	public Shark(String nam) {
		
		//this is for if user entered "" only, interesting
		if (nam.equals("")) {
			name = "NoNameShark";
		} else {
			name = nam;
		}
		hunger = 70;
		tiredness = 40;
		health = 100;
		happiness = 100;
		level = 0;
	}
	
	//I didn't know if i should use these methods or the ones below, I'll keep both just in case
	//actions
	public void eat() {
		hunger -= 10;
	}
	public void sleep() {
		tiredness -= 10;
	}
	public void play() {
		happiness += 10;
	}
	public void pet() {
		happiness += 10;
		tiredness -= 10;
	}

	//setter methods
	public void setHunger(int hun) {
		hunger = hun;
	}
	public void setTiredness(int tir) {
		tiredness = tir;
	}
	public void setHealth(int hea) {
		health = hea;
	}
	public void setHappiness(int hap) {
		happiness = hap;
	}
	public void setLevel(int lev) {
		level = lev;
	}
	public void sharkDie() {
		hunger = 0;
		tiredness = 0;
		health = 0;
		happiness = 0;
		level = 0;
	}
	public void setName(String nam) {
		name = nam;
	}
	
	//getter methods
	public int getHunger() {
		return hunger;
	}
	public int getTiredness() {
		return tiredness;	
	}
	public int getHealth() {
		return health;
	}
	public int getHappiness() {
		return happiness;
	}
	public int getLevel() {
		return level;
	}
	public String getName() {
		return name;
	}
	
	public String toString() {
		return "Name: " + name + " Hunger: " + hunger + " Tiredness: " + tiredness + " Health: " + health + " Happiness: " + happiness + " Your Level: " + level; 
	}

}
