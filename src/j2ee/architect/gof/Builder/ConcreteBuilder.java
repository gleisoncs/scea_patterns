package j2ee.architect.gof.Builder;
public class ConcreteBuilder implements BuilderIF {
  CustomerIF customer;
  public void buildCustomer() {
    customer = new ConcreteCustomer();
    // You could add more customer processing here...
  }
  public CustomerIF getCustomer() {
    return customer;
  }
}