package j2ee.architect.gof.AbstractFactory;
public class Cavalier implements AbstractEconomyCarIF {
  public void driveSlow() {
    System.out.println("Cavalier.driveSlow() called.");
  }
}