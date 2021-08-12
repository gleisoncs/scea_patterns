package info.javadesign.pattern.behavioral.strategy;


/**
 * The VictoryDanceBehaviour is used to illustrate the Strategy Pattern of GoF. The VictoryDanceBehaviour is the 
 * Strategy that declares an interface that is used by all the Victory Dance Algorithms. The GameCharacter object makes
 * use of the VictoryDanceBehaviour interface to call the algorithms of the different Victory Dance Algorithms.
 * 
 * @author	Andre Mare
 */
public interface VictoryDanceBehaviour {

	void doVictoryDance();
	
} // class VictoryDanceBehaviour
