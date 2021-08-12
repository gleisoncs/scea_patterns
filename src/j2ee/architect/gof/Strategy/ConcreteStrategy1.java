package j2ee.architect.gof.Strategy;
public class ConcreteStrategy1 implements StrategyIF {
  // Switch text to all upper case.
  public void algorithmInterface(String parm) {
    System.out.println(parm.toUpperCase());
  }
}