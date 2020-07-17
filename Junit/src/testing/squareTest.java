package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class squareTest {

	@Test
	public void test() {
		JunitTesting test = new JunitTesting();
		/*
		int output = test.square(5);
		assertEquals(25,output);
		assertEquals(30,output);
		*/
		String output2 = test.concatenate("ayman","nada");
		assertEquals("ayman nada",output2);
		// assertEquals("ayman nada",output2);
	} 
}
