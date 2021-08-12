package info.javadesign.pattern.behavioral.strategy;


/**
 * The WeaponRocketLauncher is used to illustrate the Strategy Pattern of GoF. The WeaponRocketLauncher class defines an
 * algorithm that is invoked by the GameCharacter object through the WeaponBehavior (Srategy) interface.
 * 
 * @author	Andre Mare
 */
public class WeaponRocketLauncher implements WeaponBehavior {

	
	public void useWeapon() {
		System.out.println("Weapon - Rocket Launcher: Rocket is ejected causing 400 points of damage.");
	} // method useWeapon
	
} // class WeaponRocketLauncher
