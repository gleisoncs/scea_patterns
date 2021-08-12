package info.javadesign.pattern.builder;


import info.javadesign.pattern.builder.ComboMealDirector.SuperSize;


/**
 * The ComboMealClient is used to illustrate the Build Pattern of GOF. The ComboMealClient
 * class makes use of the Director(ComboMealDirector) and ConcreteBuilder(ComboMeal1ConcreteBuilder) 
 * to create a complex Product. 
 * 
 * @author Andre Mare
 */
public class ComboMealClient {

	
	public static void main(String[] args) {
		ComboMeal1ConcreteBuilder concreteBuilder = new ComboMeal1ConcreteBuilder();
		ComboMealDirector mealDirector = new ComboMealDirector(concreteBuilder);
		
		mealDirector.constructComboMeal(SuperSize.SMALL);
		
		System.out.println(concreteBuilder.getComboMealProduct().getBurgerPart());
		System.out.println(concreteBuilder.getComboMealProduct().getSideOrderPart());
		System.out.println(concreteBuilder.getComboMealProduct().getBeveragePart());
	} // main method
	
	
} // class ComboMealClient
