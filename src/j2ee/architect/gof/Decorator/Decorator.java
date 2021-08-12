package j2ee.architect.gof.Decorator;
public class Decorator implements ComponentIF {
  ComponentIF component = new ConcreteComponent();
  public void action() {
    component.action();
  }
}