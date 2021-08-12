package info.javadesign.pattern.builder;

import info.javadesign.pattern.builder.ComboMealDirector.SuperSize;


/**
 * The ComboMeal2ConcreteBuilder is used to illustrate the Build Pattern of GOF. The ComboMeal2ConcreteBuilder
 * class contains implementation that is used by the ComboMealDirector to create the complex object.  
 * 
 * @author Andre Mare
 */
public class ComboMeal2ConcreteBuilder extends ComboMealBuilder {

	protected ComboMealProduct comboMealProduct = new ComboMealProduct();
	
	public ComboMeal2ConcreteBuilder() {	
	} // no-arg constructor
	
	
	public void buildBurgerPart() {	
		comboMealProduct.setBurgerPart("Chicken Burger");
	}
	
	
	public void buildSideOrderPart(SuperSize _mealSize) {
		if (_mealSize == SuperSize.SMALL) comboMealProduct.setSideOrderPart("Small Greek Salad");
		if (_mealSize == SuperSize.MEDIUM) comboMealProduct.setSideOrderPart("Medium Greek Salad");
		if (_mealSize == SuperSize.LARGE) comboMealProduct.setSideOrderPart("Large Greek Salad");
		if (_mealSize == SuperSize.HUGE) comboMealProduct.setSideOrderPart("Huge Greek Salad");
	} // method buildSideOrderPart
	
	
	public void buildBeveragePart(SuperSize _mealSize) {	
		if (_mealSize == SuperSize.SMALL) comboMealProduct.setBeveragePart("Small Juice");
		if (_mealSize == SuperSize.MEDIUM) comboMealProduct.setBeveragePart("Medium Juice");
		if (_mealSize == SuperSize.LARGE) comboMealProduct.setBeveragePart("Large Juice");
		if (_mealSize == SuperSize.HUGE) comboMealProduct.setBeveragePart("Huge Juice");
	} // method buildBeveragePart
	
	
	public  ComboMealProduct getComboMealProduct() {
		return comboMealProduct;
	} // method getComboMealProduct
		
	
} // class ComboMeal1ConcreteBuilder
