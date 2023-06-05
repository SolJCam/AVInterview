package ActiveViam.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ActiveViam.VarCalculation.SingleTradeVaRCalculation;

class TestConfidenceLevel {

	@Test
	void Test_ConfidenceLevel_Pass() {
		// Arrange
		double[] profit_and_loss = {10.0, 10.5, 20, 20.25};
		double expectedValue = 10;
		// Act
		SingleTradeVaRCalculation singleTradeVaR = new SingleTradeVaRCalculation(90.00, profit_and_loss);
		double actualValue = singleTradeVaR.historicalVaR();
		// Assert
		assertEquals(expectedValue, actualValue);
	}

}
