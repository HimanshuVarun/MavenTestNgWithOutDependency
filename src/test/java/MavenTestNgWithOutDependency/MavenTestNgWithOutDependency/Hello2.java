package MavenTestNgWithOutDependency.MavenTestNgWithOutDependency;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Hello2 
{
	@BeforeTest
	public void testBefore()
	{
		System.out.println("hello innnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn MavenTestNgWithOutDependency");
	}
	@Test
	public void secoundTest()
	{
		System.out.println("hello innnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn MavenTestNgWithOutDependency");

	}

}
