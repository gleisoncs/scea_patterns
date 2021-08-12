package j2ee.architect.gof.Command;
public class Invoker {
  private CommandAbstract command;
  public void storeCommand(CommandAbstract cmd) {
    this.command = cmd;
  }
  public void invoke() {
    command.execute();
  }
}