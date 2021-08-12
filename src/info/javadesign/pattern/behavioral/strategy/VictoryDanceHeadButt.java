package info.javadesign.pattern.behavioral.strategy;


/**
 * The VictoryDanceHeadButt is used to illustrate the Strategy Pattern of GoF. The VictoryDanceHeadButt class defines 
 * an algorithm that is invoked by the GameCharacter object through the VictoryDanceBehaviour (Srategy) interface.
 * 
 * @author	Andre Mare
 */
public class VictoryDanceHeadButt implements VictoryDanceBehaviour {

	
	public void doVictoryDance(){
		System.out.println("Victory Dance - Headbutt: Character strikes everything with his head.");
	} // method doVictoryDance
	
	
} // class VictoryDanceHeadButt
