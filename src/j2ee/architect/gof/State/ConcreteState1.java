package j2ee.architect.gof.State;
public class ConcreteState1 implements StateIF {
  public void handle() {
    System.out.println("ConcreteState1.handle() called.");
  }
}