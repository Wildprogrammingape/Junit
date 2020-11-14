package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class countATest {

	@Test
	void test() {
		JunitTesting test = new JunitTesting();
		int output = test.countA("have a great day");
		assertEquals(4,output);
	}

}
