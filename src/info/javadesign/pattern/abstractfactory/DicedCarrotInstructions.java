package info.javadesign.pattern.abstractfactory;


/**
 * The DicedCucumberInstructions is used to illustrate the Abstract Factory Pattern of GoF. The 
 * DicedCucumberInstructions is created by a specific concrete factory object and is the realization of a specific 
 * product type. The client system is decoupled from the actual concrete product class, but invokes the implementation 
 * through the abstract product.
 * 
 * @author Andre Mare
 */
public class DicedCarrotInstructions extends CarrotInstructions {
	
	public void printInstructions() {
		System.out.println("Diced Carrot Instructions.");
		System.out.println("  STEP1 : Peel the skin with a vegetable peeler and slice the carrot in half lengthwise.");
		System.out.println("  STEP2 : Slice into thin strips and then cut crosswise to dice.");
	} // method printInstructions	
	
} // class DicedCucumberInstructions
