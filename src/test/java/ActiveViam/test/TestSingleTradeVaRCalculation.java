package ActiveViam.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import java.lang.NullPointerException;

import ActiveViam.VarCalculation.SingleTradeVaRCalculation;

class TestSingleTradeVaRCalculation {

	@Test
	void Test_SingleTradeVaR_Pass() {
		// Arrange
		double[] profit_and_loss = {10.0, 10.5, 20, 20.25};
		double expectedValue = 10;
		SingleTradeVaRCalculation singleTradeVaR = new SingleTradeVaRCalculation(95.00, profit_and_loss);
		// Act
		double actualValue = singleTradeVaR.historicalVaR();
		// Assert
		assertEquals(expectedValue, actualValue);
	}
	
	@Test
	void Test_SingleTradeVaR_ThrowsException_Fail() {
		// Arrange
		double[] profit_and_loss = {10.0, 10.5,20, 20.25};
		SingleTradeVaRCalculation singleTradeVaR = new SingleTradeVaRCalculation(90.00, profit_and_loss);
		// Assert
		assertThrows(NullPointerException.class, ()->singleTradeVaR.historicalVaR());
	}


}
