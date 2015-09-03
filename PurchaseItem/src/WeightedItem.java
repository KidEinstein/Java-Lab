
public class WeightedItem extends PurchaseItem {
	private double weight;
	
	public WeightedItem(String name, double unitPrice, double weight) {
		super(name, unitPrice);
		this.weight = weight;
	}
	@Override
	public double getPrice() {
		return super.getPrice() * weight;
	}
	@Override
	public String toString() {
		return super.toString() + " Weight: " + weight + "kg " + getPrice() + " SR";
	}
}
