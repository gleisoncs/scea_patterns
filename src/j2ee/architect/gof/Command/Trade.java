package j2ee.architect.gof.Command;
public class Trade implements ReceiverIF {
  public void action() {
    System.out.println("Trade.action() called.");
  }
}