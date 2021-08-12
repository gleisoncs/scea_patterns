package j2ee.architect.gof.Decorator;
public class ConcreteComponent implements ComponentIF {
  public void action() {
    System.out.println("ConcreteComponent.action() called.");
  }
}