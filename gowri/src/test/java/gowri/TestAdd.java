package gowri;
import static org.junit.Assert.*;
public class TestAdd {
	   
	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void Testadd(){
		Add obj = new Add(5,7);
		System.out.println("Inside the unit test case method");
		Assert.assertEquals(12,obj.addition());
		Assert.assertSame(12,obj.addition());
	}
	@Test
	public void TestString(){
	
		Assert.assertEquals("Hello","Hello" );
	
	}
}