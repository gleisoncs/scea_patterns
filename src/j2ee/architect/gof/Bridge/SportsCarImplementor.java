package j2ee.architect.gof.Bridge;
public class SportsCarImplementor implements ImplementorIF {
  public SportsCarImplementor() {
    System.out.println("SportsCarImplementor constructed.");
  }
  public void actionImplemented() {
    System.out.println("SportsCarImplementor.actionImplemented() called.");
  }
}