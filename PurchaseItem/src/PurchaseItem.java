
public class PurchaseItem {
	private String name;
	private double unitPrice;
	
	public PurchaseItem(String name, double unitPrice) {
		this.name = name;
		this.unitPrice = unitPrice;
	}
	
	public PurchaseItem() {
		name = "No Name";
		unitPrice = 0;
	}
	
	public double getPrice() {
		return unitPrice;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	
	@Override
	public String toString() {
		return name + "@" + unitPrice;
	}
}
