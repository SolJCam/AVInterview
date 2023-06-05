package ActiveViam.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ActiveViam.VarCalculation.PortfolioVaRCalculation;

class TestPortfolioVarCalculation {

	@Test
	void Test_updatePortfolioProfitAndLoss_ThrowsNoException_Pass() {
		// Arrange
		double[] profit_and_loss1 = {10.0, 10.5, 20, 20.25};
		double[] profit_and_loss2 = {10.0, 10.5, 20, 20.25};
		PortfolioVaRCalculation portfolioVaR = new PortfolioVaRCalculation(90.00, profit_and_loss1);
		// Assert
		assertDoesNotThrow(()->portfolioVaR.updatePortfolioProfitAndLoss(profit_and_loss2));
	}

	@Test
	void Test_updatePortfolioProfitAndLoss_ThrowsException_Fail() {
		// Arrange
		double[] profit_and_loss1 = {10.0, 10.5, 20, 20.25};
		double[] profit_and_loss2 = {10.0, 10.5, 20};
		PortfolioVaRCalculation portfolioVaR = new PortfolioVaRCalculation(90.00, profit_and_loss1);
		// Assert
		assertThrows(ArrayIndexOutOfBoundsException.class, ()->portfolioVaR.updatePortfolioProfitAndLoss(profit_and_loss2));
	}
	
	@Test
	void Test_PortfolioVarCalculation_Pass() {
		// Arrange
		double[] profit_and_loss1 = {10.0, 10.5, 20, 20.25};
		double[] profit_and_loss2 = {10.0, 10.5, 20, 20.25};
		double expectedValue = 20;
		PortfolioVaRCalculation portfolioVaR = new PortfolioVaRCalculation(95.00, profit_and_loss1);
		// Act
		portfolioVaR.updatePortfolioProfitAndLoss(profit_and_loss2);
		double actualValue = portfolioVaR.historicalVaR();
		// Assert
		assertEquals(expectedValue, actualValue);
	}
	
	@Test
	void Test_PortfolioVarCalculation_Fail() {
		// Arrange
		double[] profit_and_loss1 = {10.0, 10.5, 20, 20.25};
		double expectedValue = 20;
		PortfolioVaRCalculation portfolioVaR = new PortfolioVaRCalculation(95.00, profit_and_loss1);
		// Act
		double actualValue = portfolioVaR.historicalVaR();
		// Assert
		assertNotEquals(expectedValue, actualValue);
	}
}
