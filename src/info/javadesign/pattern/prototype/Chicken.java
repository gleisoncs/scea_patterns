package info.javadesign.pattern.prototype;

/**
 * The Chicken class is the concrete prototype in the "Prototype" Pattern. The
 * class extends from the Animal prototype and has a clone method so that the
 * Prototype pattern can clone the object. 
 * 
 * @author 	Andre Mare
 */
public class Chicken extends Animal {
	
	private int numberOfClones = 0;
	
	public String helloAnimal() {
		
		StringBuffer chickenTalk = new StringBuffer(); 
		chickenTalk.append("Cluck cluck World. I am ");
		chickenTalk.append(name);
		chickenTalk.append(". I have ");
		chickenTalk.append(numberOfLegs);
		chickenTalk.append(" legs.");
		
		return chickenTalk.toString();
	} // helloAnimal
	
	public Chicken clone() {
		Chicken clonedChicken = (Chicken) super.clone();
		String chickenName = clonedChicken.getName();
		numberOfClones++;
		clonedChicken.setName(chickenName + numberOfClones);
		return clonedChicken;
	} // method clone	
	
	
}
