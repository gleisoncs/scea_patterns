package info.javadesign.pattern.abstractfactory;

public class MainClass {

	public static void main(String[] args) {
		GreekSaladInstructionsClient a = new GreekSaladInstructionsClient(new DicedGreekSaladInstructionFactory());
		a.printGreekSaladInstructions();
		
		GreekSaladInstructionsClient b = new GreekSaladInstructionsClient(new SlicedGreekSaladInstructionFactory());
		b.printGreekSaladInstructions();
	}
	
}
