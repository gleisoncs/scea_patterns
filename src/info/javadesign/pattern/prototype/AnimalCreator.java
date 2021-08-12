package info.javadesign.pattern.prototype;

/**
 * The AnimalCreator class is used to create and manage prototype objects. The AnimalCreator
 * class contains two concrete prototypes that is initialized during the initialization of 
 * the class. The AnimalCreator class forms part of the "Prototype" pattern by returning
 * a cloned object (Animal) to the client, withou the client knowing the type of the prototype.
 * 
 * @author 	Andre Mare
 */
public class AnimalCreator {

	
	/**
	 * The Animal variable sheep, contains a reference to the concrete prototype Sheep object.
	 */	
	private Animal sheep = new Sheep();
	
	
	/**
	 * The Animal variable chicken, contains a reference to the concrete prototype Chicken object.
	 */	
	private Animal chicken = new Chicken();
	
	
	/**
	 * The no-arg constructor creates a newly allocated AnimalCreator object. The
	 * Animal prototypes is initialized.
	 */
	public AnimalCreator() {
		sheep.setName("Sheep");
		sheep.setNumberOfLegs(4);
		sheep.setDescription("Four legged creature that makes wool.");

		chicken.setName("Chicken");
		chicken.setNumberOfLegs(2);
		chicken.setDescription("Two legged creature that crosses roads.");
	} // no-arg constructor
	
	
	/**
	 * The retrieveAnimal method creates a clone of the concrete prototype depending on the
	 * type of Animal the client requires.
	 * 
	 * @param 	kindOfAnimal. The kind of animal like "Chicken" or "Sheep".
	 * 
	 * @return	Animal The cloned animal of the type requested by the client.
	 */
	public Animal retrieveAnimal(String kindOfAnimal) {
		if ("Chicken".equals(kindOfAnimal)) {
			return (Animal) chicken.clone();
			
		} else if ("Sheep".equals(kindOfAnimal)) {
			return (Animal) sheep.clone();
		} // if
		
		return null;		
	} // method retrieveAnimal
	
	
} // class AnimalCreator
