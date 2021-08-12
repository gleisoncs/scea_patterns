package j2ee.architect.sun.SessionFacade;

/*
 * http://java.sun.com/blueprints/patterns/SessionFacade.html
 * http://java.sun.com/blueprints/code/jps131/src/com/sun/j2ee/blueprints/opc/admin/ejb/OPCAdminFacadeEJB.java.html
 * 
 * Many business processes involve complex manipulations of business classes. 
 * Business classes often participate in multiple business processes or workflows. 
 * Complex processes that involve multiple business objects can lead to tight coupling 
 * between those classes, with a resulting decrease in flexibility and design clarity. 
 * Complex relationships between low-level business components make clients difficult 
 * to write.
 * The Session Facade pattern defines a higher-level business component that contains 
 * and centralizes complex interactions between lower-level business components. A Session 
 * Facade is implemented as a session enterprise bean. It provides clients with a single 
 * interface for the functionality of an application or application subset. It also 
 * decouples lower-level business components from one another, making designs more flexible 
 * and comprehensible.
 * Fine-grained access through remote interfaces is inadvisable because it increases network 
 * traffic and latency. The "before" diagram in Figure 1 below shows a sequence diagram of 
 * a client accessing fine-grained business objects through a remote interface. The multiple
 * fine-grained calls create a great deal of network traffic, and performance suffers 
 * because of the high latency of the remote calls.
 * */

public class SessionFacade {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
