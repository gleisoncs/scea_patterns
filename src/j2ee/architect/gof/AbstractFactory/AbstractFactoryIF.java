package j2ee.architect.gof.AbstractFactory;

public interface AbstractFactoryIF {
	public AbstractSportsCarIF createSportsCar();

	public AbstractEconomyCarIF createEconomyCar();
}