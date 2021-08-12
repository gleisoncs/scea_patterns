package info.javadesign.pattern.builder;


/**
 * The ComboMealProduct is used to illustrate the Build Pattern of GOF. The ComboMealProduct
 * class is the complex object whose individual parts is created by the different Builder objects.  
 * 
 * @author Andre Mare
 */
public class ComboMealProduct {

	private String burgerPart = "";
	
	private String sideOrderPart = "";	
	
	private String beveragePart = "";

	public ComboMealProduct() {
		super();
	}
	
	public String getBeveragePart() {
		return beveragePart;
	}

	public void setBeveragePart(String beveragePart) {
		this.beveragePart = beveragePart;
	}

	public String getBurgerPart() {
		return burgerPart;
	}

	public void setBurgerPart(String burgerPart) {
		this.burgerPart = burgerPart;
	}

	public String getSideOrderPart() {
		return sideOrderPart;
	}

	public void setSideOrderPart(String sideOrderPart) {
		this.sideOrderPart = sideOrderPart;
	}
		
	
} // class ComboMealProduct
