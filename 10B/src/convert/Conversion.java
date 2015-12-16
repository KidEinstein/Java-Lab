package convert;
import java.io.Serializable;

public class Conversion implements Serializable{
	private String miles;
	private String kilometers;
	public String getMiles() {
		return miles;
	}
	public void setMiles(String miles) {
		this.miles = miles;
	}
	public String getKilometers() {
		return kilometers;
	}
	public void setKilometers(String miles) {
		double milesDouble = Double.parseDouble(miles);
		double kilometersDouble = milesDouble / 0.621;
		this.kilometers = String.valueOf(kilometersDouble);
	}
	
}
