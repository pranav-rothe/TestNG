package listeners;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listeners.TestListeners.class)
public class TestClass {

	@Test
	public void methodOne() {
		System.out.println("Executing method one.");
	}
	
	//method two is failed because of using assert false 
	@Test
	public void methodTwo() {
		System.out.println("Executing method two.");
		assert false;
	}

}
