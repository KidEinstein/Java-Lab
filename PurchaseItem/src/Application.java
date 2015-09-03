
public class Application {

	public static void main(String[] args) {
		PurchaseItem pi = new PurchaseItem("Phone", 10123.45);
		System.out.println(pi);
		
		WeightedItem wi = new WeightedItem("Oranges", 25.5, 3.2);
		System.out.println(wi);
		
		CountedItem ci = new CountedItem("Candy", 5, 35);
		System.out.println(ci);
	}

}
