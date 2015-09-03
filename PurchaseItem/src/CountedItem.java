
public class CountedItem extends PurchaseItem {
	private int count;
	
	public CountedItem(String name, double unitPrice, int count) {
		super(name, unitPrice);
		this.count = count;
	}
	@Override
	public double getPrice() {
		return super.getPrice() * count;
	}
	@Override
	public String toString() {
		return super.toString() + count + " Units " + getPrice() + " SR";
	}
}
