package ActiveViam.VarCalculation;

/** 
 * Calculate VaR for a single trade
 * 
 * @author soljcameron
 *
 */
public class SingleTradeVaRCalculation extends VaR{
	protected double[] profitAndLoss;
	private double confidenceLevel;
	
	/**
	 * Initialize SingleTradeVaRCalculation with a confidence level as a Double and a list of historical
	 * Profit and Lost values as Doubles
	 * 
	 * @param confidenceLevel	a Double representing the percent confidence in VaR
	 * @param profitAndLoss		List of Doubles representing historical profit and loss values 
	 * 							
	 */
	public SingleTradeVaRCalculation(double confidenceLevel, double[] profitAndLoss) {
		super();
		this.profitAndLoss = profitAndLoss;
		this.confidenceLevel = confidenceLevel;
	}

	/**
	 * Override implementation of historicalVaR method and include conversion of input type to String 
	 * 
	 * @return	VaR calculation represented by a Double
	 */
	public double historicalVaR() {
		String confidenceLevel = String.valueOf(this.confidenceLevel);
		return super.historicalVaR(confidenceLevel, this.profitAndLoss);
	}
}
