package j2ee.architect.gof.Flyweight;

public class State {
	private boolean state;

	public State(boolean parm) {
		this.state = parm;
	}

	public boolean getState() {
		return state;
	}
}