package listeners;

import org.junit.jupiter.api.Test;
import org.testng.Assert;
import org.testng.annotations.Listeners;

@Listeners(listeners.TestNGListeners.class)
public class TestNGListenerDemo2 {
	
	@Test
	public void test4() {
		System.out.println("I am inside Test4");
	}
	
	@Test
	public void test5() {
		System.out.println("I am inside Test5");
		
	}
	
	@Test
	public void test6() {
		System.out.println("I am inside Test6");
	}

}
