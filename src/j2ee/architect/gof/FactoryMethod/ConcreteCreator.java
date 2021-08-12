package j2ee.architect.gof.FactoryMethod;
public class ConcreteCreator implements CreatorIF {
  public TradeIF factoryMethod() {
    return new ConcreteTrade();
  }
}