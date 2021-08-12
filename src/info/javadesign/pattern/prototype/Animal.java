package info.javadesign.pattern.prototype;


/**
 * The Animal abstract class is the prototype in the "Prototype" Pattern. The
 * animal class contains properties that describe on a abstract level the different
 * prototypes that can exist in the pattern example. 
 * 
 * @author 	Andre Mare
 */
public abstract class Animal implements Cloneable {

	
	protected int numberOfLegs = 0;
	
	
	protected String description = "";
	
	
	protected String name = "";

	
	public abstract String helloAnimal();
	
	
	/**
	 * The clone method creates a clone of the current Animal object.
	 */
	public Animal clone() {
		Animal clonedAnimal = null;
		
		try {
			clonedAnimal = (Animal) super.clone();
			
			clonedAnimal.setDescription(description);
			clonedAnimal.setNumberOfLegs(numberOfLegs);
			clonedAnimal.setName(name);
			
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		} // catch
		
		return clonedAnimal;
	} // method clone


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public int getNumberOfLegs() {
		return numberOfLegs;
	}


	public void setNumberOfLegs(int numberOfLegs) {
		this.numberOfLegs = numberOfLegs;
	}

	public String getName() {
		return name;
	}

	
	public void setName(String name) {
		this.name = name;
	} 
		
} // class Animal
