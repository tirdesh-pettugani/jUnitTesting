
package jUnitTestingPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testaddstrings {

	@Test
	public void test() {
		jUnitFunction jf=new jUnitFunction();
		String result=jf.addstrings("hell", "o");
		assertEquals("hello",result);
	}

}
