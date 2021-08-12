package info.javadesign.pattern.abstractfactory;


public class GreekSaladInstructionsClient {

	
	private TomatoInstructions tomatoInstructions;
	private CucumberInstructions cucumberInstructions;
	private CarrotInstructions carrotInstructions;

	
	public GreekSaladInstructionsClient(SaladInstructionsKit factory) {
		tomatoInstructions = factory.createTomatoInstructions();
		cucumberInstructions = factory.createCucumberInstructions();
		carrotInstructions = factory.createCarrotInstructions();
	}
	
	
	public void printGreekSaladInstructions() {
		tomatoInstructions.printInstructions();
		cucumberInstructions.printInstructions();
		carrotInstructions.printInstructions();
	}
	
	
} // class GreekSaladInstructionsClient
