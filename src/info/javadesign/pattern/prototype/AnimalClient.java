package info.javadesign.pattern.prototype;

/**
 * The AnimalClient class is the client of the Animal Prototype pattern example. 
 * 
 * @author 	Andre Mare
 */
public class AnimalClient {

	public static void main(String[] args) {
		AnimalCreator animalCreator = new AnimalCreator();
		Animal[] animalFarm = new Animal[8];
		
		animalFarm[0] = animalCreator.retrieveAnimal("Chicken");
		animalFarm[1] = animalCreator.retrieveAnimal("Chicken");
		animalFarm[2] = animalCreator.retrieveAnimal("Chicken");
		animalFarm[3] = animalCreator.retrieveAnimal("Chicken");
		
		animalFarm[4] = animalCreator.retrieveAnimal("Sheep");
		animalFarm[5] = animalCreator.retrieveAnimal("Sheep");
		animalFarm[6] = animalCreator.retrieveAnimal("Sheep");
		animalFarm[7] = animalCreator.retrieveAnimal("Sheep");
		
		for (int i= 0; i<=7; i++) {
			System.out.println(animalFarm[i].helloAnimal());
		} // for		
	} // main method
	
} // class AnimalClient
