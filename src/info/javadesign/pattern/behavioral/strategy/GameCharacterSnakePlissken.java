package info.javadesign.pattern.behavioral.strategy;


/**
 * The GameCharacterSnakePlissken is used to illustrate the Strategy Pattern of GoF. The GameCharacterSnakePlissken
 * class is a GameCharacter object with a specific weapon and victory dance behaviour. The GameCharacterSnakePlissken
 * class maintains a reference to the specific ConcreteStrategy objects through the interfaces defined by the parent
 * GameCharacter class.
 * 
 * @author	Andre Mare
 */
public class GameCharacterSnakePlissken extends GameCharacter {

	
	public GameCharacterSnakePlissken() {
		victoryDanceBehaviour = new VictoryDanceHeadButt();
		weaponBehavior = new WeaponBFG9000();
	} // no-arg constructor
	
	
	public void fight() {
		System.out.println("Character Name : Snake Plissken");
		this.usePrimaryWeapon();
		this.performVictoryDance();
	} // method fight
	
	
} // class GameCharacterSnakePlissken
