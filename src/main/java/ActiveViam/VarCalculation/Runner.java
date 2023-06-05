package ActiveViam.VarCalculation;

public class Runner {

	public static void main(String[] args) {
		double[] pnl = {10.0, 10.5, 20, 20.25};
		double confidence = 90.5;
		SingleTradeVaRCalculation stvc = new SingleTradeVaRCalculation(confidence, pnl);
		double sthvc = stvc.historicalVaR();
		System.out.println(sthvc);
	}

}
