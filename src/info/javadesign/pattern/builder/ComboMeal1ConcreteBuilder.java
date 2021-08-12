package info.javadesign.pattern.builder;

import info.javadesign.pattern.builder.ComboMealDirector.SuperSize;


/**
 * The ComboMeal1ConcreteBuilder is used to illustrate the Build Pattern of GOF. The ComboMeal1ConcreteBuilder
 * class contains implementation that is used by the ComboMealDirector to create the complex object.  
 * 
 * @author Andre Mare
 */
public class ComboMeal1ConcreteBuilder extends ComboMealBuilder {

	protected ComboMealProduct comboMealProduct = new ComboMealProduct();
	
	public ComboMeal1ConcreteBuilder() {	
	} // no-arg constructor
	
	
	public void buildBurgerPart() {	
		comboMealProduct.setBurgerPart("Big Jack Burger");
	}
	
	
	public void buildSideOrderPart(SuperSize _mealSize) {
		if (_mealSize == SuperSize.SMALL) comboMealProduct.setSideOrderPart("Small French Fries");
		if (_mealSize == SuperSize.MEDIUM) comboMealProduct.setSideOrderPart("Medium French Fries");
		if (_mealSize == SuperSize.LARGE) comboMealProduct.setSideOrderPart("Large French Fries");
		if (_mealSize == SuperSize.HUGE) comboMealProduct.setSideOrderPart("Huge French Fries");
	} // method buildSideOrderPart
	
	
	public void buildBeveragePart(SuperSize _mealSize) {
		if (_mealSize == SuperSize.SMALL) comboMealProduct.setBeveragePart("Small Coke");
		if (_mealSize == SuperSize.MEDIUM) comboMealProduct.setBeveragePart("Medium Coke");
		if (_mealSize == SuperSize.LARGE) comboMealProduct.setBeveragePart("Large Coke");
		if (_mealSize == SuperSize.HUGE) comboMealProduct.setBeveragePart("Huge Coke");
	} // method buildBeveragePart
	
	
	public  ComboMealProduct getComboMealProduct() {
		return comboMealProduct;
	} // method getComboMealProduct
		
	
} // class ComboMeal1ConcreteBuilder
