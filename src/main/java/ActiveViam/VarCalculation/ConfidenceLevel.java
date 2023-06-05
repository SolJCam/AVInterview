package ActiveViam.VarCalculation;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfidenceLevel {
	
	public Properties loadConfidenceLevels() {
		Properties prop=new Properties();
		InputStream confidenceLevels = this.getClass().getClassLoader().getResourceAsStream("config.properties");
		try {
			prop.load(confidenceLevels);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return prop;
	}
}
