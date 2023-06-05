package ActiveViam.VarCalculation;

import org.apache.commons.math3.stat.StatUtils;

public abstract class VaR {
	
	public double historicalVaR(String confidenceLevel, double[] profitAndLoss) {
		ConfidenceLevel configFileObject = new ConfidenceLevel();
		String configFileVals = configFileObject.loadConfidenceLevels().getProperty(confidenceLevel);
		double confidenceLevelVal = Double.parseDouble(configFileVals);
		double lossPercentage = 100 - confidenceLevelVal;
		double historicalVaR = StatUtils.percentile(profitAndLoss, lossPercentage); 
		return historicalVaR;
	}

}
