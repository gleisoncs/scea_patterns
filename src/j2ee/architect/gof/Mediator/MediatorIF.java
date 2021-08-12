package j2ee.architect.gof.Mediator;
public interface MediatorIF {
  //Interface for communicating with colleagues
  public void registerColleague1(ColleagueIF parm);
  public void registerColleague2(ColleagueIF parm);
  public void state1Changed();
  public void state2Changed();
}