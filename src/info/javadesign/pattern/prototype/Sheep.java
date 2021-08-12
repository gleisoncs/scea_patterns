package info.javadesign.pattern.prototype;

/**
 * The Sheep class is the concrete prototype in the "Prototype" Pattern. The
 * class extends from the Animal prototype and has a clone method so that the
 * Prototype pattern can clone the object. 
 * 
 * @author 	Andre Mare
 */
public class Sheep extends Animal {
	
	private int numberOfClones = 0;
	
	public String helloAnimal() {
		
		StringBuffer sheepTalk = new StringBuffer(); 
		sheepTalk.append("Meeeeeee World. I am ");
		sheepTalk.append(name);
		sheepTalk.append(". I have ");
		sheepTalk.append(numberOfLegs);
		sheepTalk.append(" legs.");
		
		return sheepTalk.toString();
	} // helloAnimal
	
	public Sheep clone() {
		Sheep clonedSheep = (Sheep) super.clone();
		String sheepName = clonedSheep.getName();
		numberOfClones++;
		clonedSheep.setName(sheepName + numberOfClones);
		return clonedSheep;
	} // method clone	
	
}
