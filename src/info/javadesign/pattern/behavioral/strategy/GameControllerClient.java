package info.javadesign.pattern.behavioral.strategy;

/**
 * The GameControllerClient is used to illustrate the Strategy Pattern of GoF. The GameControllerClient creates three
 * different GameCharacter object each with it's own weapon and victory dance behaviour.
 * 
 * @author 	Andre Mare
 */
public class GameControllerClient {

	GameCharacter character1 = null;
	GameCharacter character2 = null;
	GameCharacter character3 = null;

	public GameControllerClient() {		
		this.createCharacters();
	} // no-arg constructor
	
	
	public void createCharacters() {
		character1 = new GameCharacterGordonFreeman();
		character2 = new GameCharacterSnakePlissken();
		character3 = new GameCharactherMasterChief();
	} // method createCharacters
	
	
	public void startGame() {
		character1.fight();
		character2.fight();
		character3.fight();
	} // method startGame
	
	
	public static void main(String[] args) {
		GameControllerClient client = new GameControllerClient();
		client.startGame();
	} // main class
	
	
} // class GameControllerClient
