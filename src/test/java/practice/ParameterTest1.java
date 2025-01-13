package practice;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest1 {
	
	@Parameters({"a","b"})
	@Test
	public void add(int a, int b) {
		int sum=a+b;
		System.out.println(sum);
	}
	
	@Parameters({"a","b"})
	@Test
	public void sub(int a, int b) {
		int sub=a-b;
		System.out.println(sub);
	}
	
	@Parameters({"a","b"})
	@Test
	public void mul(int a, int b) {
		int mul=a*b;
		System.out.println(mul);
	}

}
