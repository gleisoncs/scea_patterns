package j2ee.architect.gof.FactoryMethod;
public class ConcreteTrade implements TradeIF {
  public void action() {
    System.out.println("ConcreteTrade.action() called.");
  }
}