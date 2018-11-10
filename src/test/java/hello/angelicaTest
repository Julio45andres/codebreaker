import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class angelicaTest {
	
	String number;
	CodeBreaker cB= new CodeBreaker("1234");
	String result;

	@Test
	void oneInPosition() {
		number = "5674";
		result = cB.guesst(number);
		System.out.println(result);
		assertEquals("x", result);
	}
	@Test
	void twoInPosition() {
		number = "5634";
		result = cB.guesst(number);
		System.out.println(result);
		assertEquals("xx", result);
	}
	@Test
	void threeInPosition() {
		number = "5234";
		result = cB.guesst(number);
		System.out.println(result);
		assertEquals("xxx", result);
	}
	
	@Test
	void allMatch() {
		number = "1234";
		result = cB.guesst(number);
		System.out.println(result);
		assertEquals("xxxx", result);
	}
	
	@Test
	void allFall() {
		number = "9876";
		result = cB.guesst(number);
		System.out.println(result);
		assertEquals("", result);
	}
	
	@Test
	void justOneExist() {
		number = "7891";
		result = cB.guesst(number);
		System.out.println(result);
		assertEquals("_", result);
	}
	@Test
	void justTwoExist() {
		number = "2891";
		result = cB.guesst(number);
		System.out.println(result);
		assertEquals("__", result);
	}
	
	@Test
	void justThreeExist() {
		number = "2391";
		result = cB.guesst(number);
		System.out.println(result);
		assertEquals("___", result);
	}
	
	@Test
	void allExist() {
		number = "2341";
		result = cB.guesst(number);
		System.out.println(result);
		assertEquals("____", result);
	}
	@Test
	void oneInPositionFirstAndOneExist() {
		number = "1563";
		result = cB.guesst(number);
		System.out.println(result);
		assertEquals("x_", result);
	}
	
	@Test
	void twoInPositionAndOneExist() {
		number = "1263";
		result = cB.guesst(number);
		System.out.println(result);
		assertEquals("xx_", result);
	}
	
	@Test
	void nullParameter() {
		result = cB.guesst(number);
		System.out.println(result);
		assertEquals("", result);
	}
	
	@Test
	void getSecret() {
		result = cB.getSecret();
		System.out.println(result);
		assertEquals("1234", result);
	}
	
	
}
