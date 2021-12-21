package yuown.p2021.walmart.vending;

public class Item implements Comparable<Item> {

	private String name;

	private double price;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public int compareTo(Item o) {
		return this.name.compareTo(o.name);
	}

}
