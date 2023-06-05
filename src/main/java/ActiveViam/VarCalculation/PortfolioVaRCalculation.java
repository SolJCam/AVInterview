package ActiveViam.VarCalculation;

/** 
 * Calculate VaR for a multiple trades
 * At instantiation, a single trade is added. 
 * Additional trades are added to the portfolio using updatePortfolioProfitAndLoss
 * 
 * @author soljcameron
 *
 */
public class PortfolioVaRCalculation extends SingleTradeVaRCalculation {
	
	/**
	 * Initialize SingleTradeVaRCalculation with a confidence level as a Double and a list of historical
	 * Profit and Lost values as Doubles
	 * 
	 * @param confidenceLevel	a Double representing the percent confidence in VaR
	 * @param profitAndLoss		List of Doubles representing historical profit and loss values 
	 * 							
	 */	
	public PortfolioVaRCalculation(double confidenceLevel, double[] profitAndLoss) {
		super(confidenceLevel, profitAndLoss);
	}
	
	/**
	 * Update profitAndLoss values by sequentially iterating through new and original 
	 * profit and loss lists, finding the sum of each value, and saving at the index of original list
	 *  
	 * @param additionalProfitAndLoss	new profit and loss values to be added to current values in object attribute
	 */
	public void updatePortfolioProfitAndLoss(double[] additionalProfitAndLoss) {
		if(this.profitAndLoss.length == additionalProfitAndLoss.length) {
			for(int i=0; i<profitAndLoss.length; i++) {
				profitAndLoss[i] = profitAndLoss[i] + additionalProfitAndLoss[i];
			}
		} else {
			throw new java.lang.ArrayIndexOutOfBoundsException("the new list does not contain the same number of trades");
		}
	}
}
