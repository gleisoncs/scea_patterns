package j2ee.architect.gof.Observer;

public class ConcreteObserver implements ObserverIF {
	private ConcreteSubject subject; // Reference to subject

	public void update() {
		if (subject == null) {
			subject = new ConcreteSubject();
		}
		System.out.print("         Yes!");
	}
}