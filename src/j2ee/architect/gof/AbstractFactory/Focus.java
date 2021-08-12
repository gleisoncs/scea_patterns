package j2ee.architect.gof.AbstractFactory;
public class Focus implements AbstractEconomyCarIF {
  public void driveSlow() {
    System.out.println("Focus.driveSlow() called.");
  }
}