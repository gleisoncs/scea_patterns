package info.javadesign.pattern.builder;


/**
 * The ComboMealDirector is used to illustrate the Build Pattern of GOF. The ComboMealDirector
 * class invokes the appropriate methods on the ConcreteBuilder(ComboMeal1ConcreteBuilder) 
 * to create a complex Product. 
 * 
 * @author Andre Mare
 */
public class ComboMealDirector {

	private ComboMealBuilder comboMealBuilder = null;
	
	
	public enum SuperSize { SMALL, MEDIUM, LARGE, HUGE }
	
	
	public ComboMealDirector(ComboMealBuilder _comboMealBuilder) {
		this.comboMealBuilder = _comboMealBuilder;
	} // constructor
	
	
	public void constructComboMeal(SuperSize _mealSize) {
		comboMealBuilder.buildBurgerPart();
		comboMealBuilder.buildSideOrderPart(_mealSize);
		comboMealBuilder.buildBeveragePart(_mealSize);
	} // method constructComboMeal
	
	
	public void constructComboMealNoSideOrder(SuperSize _mealSize) {
		comboMealBuilder.buildBurgerPart();
		comboMealBuilder.buildBeveragePart(_mealSize);
	} // method constructComboMealNoSideOrder
	
	
	public void constructComboMealNoBeverage(SuperSize _mealSize) {
		comboMealBuilder.buildBurgerPart();
		comboMealBuilder.buildSideOrderPart(_mealSize);
	} // method constructComboMealNoSideOrder
	
} // class ComboMealDirector
