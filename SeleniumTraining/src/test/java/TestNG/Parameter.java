package TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter {
  @Test
  @Parameters({"a","b"})
  public void f(int a, int b)
  {
	  System.out.println(a+b);
	  
  }
}
