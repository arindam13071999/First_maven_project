package Arindam_maven.first;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Sumtest {

	@Test
	void testCalculate() {
		Sum a=new Sum();
		int s=a.calculate();
		Assertions.assertEquals(5,s);
	}

}
