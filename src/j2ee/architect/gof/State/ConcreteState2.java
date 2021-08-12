package j2ee.architect.gof.State;
public class ConcreteState2 implements StateIF {
  public void handle() {
    System.out.println("ConcreteState2.handle() called.");
  }
}