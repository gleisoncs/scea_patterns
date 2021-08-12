package info.javadesign.pattern.behavioral.strategy;


/**
 * The GameCharacterGordonFreeman is used to illustrate the Strategy Pattern of GoF. The GameCharacterGordonFreeman
 * class is a GameCharacter object with a specific weapon and victory dance behaviour. The GameCharacterGordonFreeman
 * class maintains a reference to the specific ConcreteStrategy objects through the interfaces defined by the parent
 * GameCharacter class.
 * 
 * @author	Andre Mare
 */
public class GameCharacterGordonFreeman extends GameCharacter {

	
	public GameCharacterGordonFreeman() {
		victoryDanceBehaviour = new VictoryDanceAirGuitar();
		weaponBehavior = new WeaponChainsaw();
	} // no-arg constructor
	
	
	public void fight() {
		System.out.println("Character Name : Gordon Freeman");
		this.usePrimaryWeapon();
		this.performVictoryDance();
	} // method fight
	
	
} // class GameCharacterGordonFreeman
