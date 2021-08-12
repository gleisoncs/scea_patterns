package info.javadesign.pattern.builder;


import info.javadesign.pattern.builder.ComboMealDirector.SuperSize;


/**
 * The ComboMealBuilder is used to illustrate the Build Pattern of GOF. The ComboMealBuilder
 * class contains the interface that is used by the ComboMealDirector to create the complex object.  
 * 
 * @author Andre Mare
 */
public abstract class ComboMealBuilder {
	
	
	public abstract void buildBurgerPart();
	
	
	public abstract void buildSideOrderPart(SuperSize _mealSize);
	
	
	public abstract void buildBeveragePart(SuperSize _mealSize);
	
	
	
	
}
