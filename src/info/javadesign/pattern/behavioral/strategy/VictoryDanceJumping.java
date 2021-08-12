package info.javadesign.pattern.behavioral.strategy;


/**
 * The VictoryDanceHeadButt is used to illustrate the Strategy Pattern of GoF. The VictoryDanceHeadButt class defines 
 * an algorithm that is invoked by the GameCharacter object through the VictoryDanceBehaviour (Srategy) interface.
 * 
 * @author	Andre Mare
 */
public class VictoryDanceJumping implements VictoryDanceBehaviour {

	
	public void doVictoryDance(){
		System.out.println("Victory Dance - Jumping: Character stands on one leg and jumps around.");
	} // method doVictoryDance
	
	
} // class VictoryDanceJumping
