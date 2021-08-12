package j2ee.architect.gof.Prototype;
public interface PrototypeIF {
  public PrototypeIF getClone(); // as opposed to Object.clone()
  public void action();
}