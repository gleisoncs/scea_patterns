package j2ee.architect.gof.Builder;
public class Director {
  BuilderIF builder;
  public Director(BuilderIF parm) {
    this.builder = parm;
  }
  public void construct() {
    builder.buildCustomer();
  }
}