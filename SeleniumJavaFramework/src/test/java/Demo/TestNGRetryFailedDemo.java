package Demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGRetryFailedDemo {
	
	@Test
	public void test1 () {
		
		System.out.println("I am inseide Test 1");
	}
	
	@Test
	public void test2 () {
		
		System.out.println("I am inseide Test 2");
		//int i=1/0;
	}
	
	@Test
	public void test3 () {
		
		System.out.println("I am inseide Test 3");
		Assert.assertTrue(0>1);
	}

}