
import org.omg.CORBA.ORB;
import HelloWorldApp.HelloPOA;
public class HelloServant extends HelloPOA {
	
	
	private String message = "Bonjour tous le monde !! "; private ORB orb;
	
	public void setOrb (ORB orb) {this.ord = orb;}
	@Override
	public String HelloMessage() {
		
	}
	@Override
	public void HelloMessage(String newHelloMessage) {
		message = newHelloMessage;
	}

}
