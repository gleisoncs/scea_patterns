package info.javadesign.pattern.behavioral.strategy;


/**
 * The WeaponBFG9000 is used to illustrate the Strategy Pattern of GoF. The WeaponBFG9000 class defines an algorithm 
 * that is invoked by the GameCharacter object through the WeaponBehavior (Srategy) interface.
 * 
 * @author	Andre Mare
 */
public class WeaponBFG9000 implements WeaponBehavior {

	
	public void useWeapon() {
		System.out.println("Weapon - BFG9000: Green Plasma ball is ejected causing 800 points of damage.");
	} // method useWeapon
	
	
} // class WeaponBFG9000
