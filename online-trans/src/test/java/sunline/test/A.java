package sunline.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import cn.sunline.edsp.microcore.Bootstrap;

public class A {
   @BeforeClass
    public static void beforeClass() {
        Bootstrap.start();
   }
	@Test
	public void testName() throws Exception {
		
	}
}
