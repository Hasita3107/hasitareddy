package sam;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;



class DiscountCalcualatorTest {

	@ParameterizedTest
	@CsvSource({"2000, 11", "5000,12", "1190,7"})
	void testdiscount(float p, float d) {
		DiscountCalcualator si = new DiscountCalcualator();
		float expected = p*d/100;
		float actual = si.discount(p, d);
		Assertions.assertEquals(expected, actual);
		
	}

}
