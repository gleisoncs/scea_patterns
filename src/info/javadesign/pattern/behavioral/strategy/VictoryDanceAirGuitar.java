package info.javadesign.pattern.behavioral.strategy;


/**
 * The VictoryDanceAirGuitar is used to illustrate the Strategy Pattern of GoF. The VictoryDanceAirGuitar class defines 
 * an algorithm that is invoked by the GameCharacter object through the VictoryDanceBehaviour (Srategy) interface.
 * 
 * @author	Andre Mare
 */
public class VictoryDanceAirGuitar implements VictoryDanceBehaviour {

	
	public void doVictoryDance(){
		System.out.println("Victory Dance - Air Guitar: Character does exaggerated strumming and picking motions.");
	} // method doVictoryDance
	
	
} // class VictoryDanceAirGuitar
