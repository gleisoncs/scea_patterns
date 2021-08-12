package info.javadesign.pattern.behavioral.strategy;


/**
 * The GameCharacter is used to illustrate the Strategy Pattern of GoF. The GameCharacter class is configured with a
 * VictoryDanceBehaviour and WeaponBehavior class which is both Strategy types. The GameCharacter class maintains  
 * references to the Strategy objects through the VictoryDanceBehaviour and WeaponBehavior interfaces.  
 * 
 * @author Andre Mare
 */
public abstract class GameCharacter {
	
	
	protected VictoryDanceBehaviour victoryDanceBehaviour = null;
	
	
	protected WeaponBehavior weaponBehavior = null;
	
	
	public abstract void fight();
	
	
	public void setVictoryDanceBehaviour(VictoryDanceBehaviour _victoryDanceBehaviour) {
		this.victoryDanceBehaviour = _victoryDanceBehaviour;
	} // method setVictoryDanceBehaviour
	
	
	public void setWeaponBehavior(WeaponBehavior _weaponBehavior) {
		this.weaponBehavior = _weaponBehavior;
	} // method setWeaponBehavior
	
	
	public void usePrimaryWeapon() {
		weaponBehavior.useWeapon();
	} // method usePrimaryWeapon
	
	
	public void performVictoryDance() {
		victoryDanceBehaviour.doVictoryDance();
	} // method performVictoryDance
	
		
} // class GameCharacter
