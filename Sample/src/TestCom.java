

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class TestCom {

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	//To write unit test case
	@Test
	public void Testcom(){
		Add obj2=new Add("HE","LLO");
		Assert.assertEquals("HELLO", obj2.combine());	
	}
	}	