package info.javadesign.pattern.behavioral.strategy;


/**
 * The WeaponChainsaw is used to illustrate the Strategy Pattern of GoF. The WeaponChainsaw class defines an algorithm 
 * that is invoked by the GameCharacter object through the WeaponBehavior (Srategy) interface.
 * 
 * @author	Andre Mare
 */
public class WeaponChainsaw implements WeaponBehavior {

	
	public void useWeapon() {
		System.out.println("Weapon - Chainsaw: Swinging chainsaw at full refs causing 100 points of damage.");
	} // method useWeapon
	
} // class WeaponChainsaw
