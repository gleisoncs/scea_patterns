package j2ee.architect.gof.Builder;
public class ConcreteCustomer implements CustomerIF {
  public ConcreteCustomer() {
    System.out.println("ConcreteCustomer constructed.");
  }
  public void action() {
    System.out.println("ConcreteCustomer.action() called.");
  }
}