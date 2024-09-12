package Arindam_maven.first;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SumTest {

	@Test
	void test() {
		Sum s=new Sum();
		int a=s.calculate();
		Assertions.assertEquals(5,a);
	}

}
