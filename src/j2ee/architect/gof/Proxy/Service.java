package j2ee.architect.gof.Proxy;
public class Service implements ServiceIF {
  // Service to be proxied
  public Service() {
    System.out.println("Service constructed.");
  }
  public void action() {
    System.out.println("Service.action() called.");
  }
}