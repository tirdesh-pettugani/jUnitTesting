
package jUnitTestingPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testaddnumbers {

	
	@Test
	public void test() {
		jUnitFunction jf=new jUnitFunction();
		int result=jf.addnumbers(10, 20);
		assertEquals(30,result);
	}

}
