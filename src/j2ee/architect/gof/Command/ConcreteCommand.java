package j2ee.architect.gof.Command;
public class ConcreteCommand extends CommandAbstract {
  // The binding between action and receiver
  private ReceiverIF receiver;
  public ConcreteCommand(ReceiverIF receive) {
    this.receiver = receive;
  }
  public void execute() {
      receiver.action();
  }
}