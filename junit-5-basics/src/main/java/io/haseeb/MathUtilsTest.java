package io.haseeb;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;


class MathUtilsTest {

	@Test
	void addTest() {
		
		MathUtils mathUtil=new MathUtils();
		int expected=2;
		int actual=mathUtil.add(1, 1);
		assertEquals(expected,actual,"the expected or not equals to actual!");
	}
	@Test
	void testDevide() {
		MathUtils mathUtil=new MathUtils();
       
		assertThrows(NullPointerException.class,()-> mathUtil.divide(1, 0),"Should not zero thwo");
		
		
	}
	@Test
	void testComputeCircleAreaRedius() {
		MathUtils mathUtil=new MathUtils();
		assertEquals(314.1592653589793,mathUtil.computeCircleArea(10),"Shuld return right Circle Area");
		
		
	}

}
