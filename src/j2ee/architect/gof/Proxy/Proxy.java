package j2ee.architect.gof.Proxy;
public class Proxy implements ServiceIF {
  // Proxy to be the service
  private Service service = new Service();
  public void action() {
    service.action();
  }
}