package j2ee.architect.gof.AbstractFactory;

public class GMFactory implements AbstractFactoryIF {

	public AbstractSportsCarIF createSportsCar() {
		return new Corvette();
	}

	public AbstractEconomyCarIF createEconomyCar() {
		return new Cavalier();
	}
}