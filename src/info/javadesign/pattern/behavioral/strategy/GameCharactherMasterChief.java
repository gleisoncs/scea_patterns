package info.javadesign.pattern.behavioral.strategy;


/**
 * The GameCharactherMasterChief is used to illustrate the Strategy Pattern of GoF. The GameCharactherMasterChief
 * class is a GameCharacter object with a specific weapon and victory dance behaviour. The GameCharactherMasterChief
 * class maintains a reference to the specific ConcreteStrategy objects through the interfaces defined by the parent
 * GameCharacter class.
 * 
 * @author	Andre Mare
 */
public class GameCharactherMasterChief extends GameCharacter {

	
	public GameCharactherMasterChief() {
		victoryDanceBehaviour = new VictoryDanceJumping();
		weaponBehavior = new WeaponRocketLauncher();
	} // no-arg constructor
	
	
	public void fight() {
		System.out.println("Character Name : Master Chief");
		this.usePrimaryWeapon();
		this.performVictoryDance();
	} // method fight
	
	
} // class GameCharactherMasterChief
