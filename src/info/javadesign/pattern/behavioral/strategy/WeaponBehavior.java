package info.javadesign.pattern.behavioral.strategy;


/**
 * The WeaponBehavior is used to illustrate the Strategy Pattern of GoF. The WeaponBehavior is the Strategy that 
 * declares an interface that is used by all the Weapon Algorithms. The GameCharacter object makes use of the 
 * WeaponBehavior interface to call the algorithms of the different Weapon Algorithms.
 * 
 * @author	Andre Mare
 */
public interface WeaponBehavior {
	
	void useWeapon();
	
} // interface WeaponBehavior
