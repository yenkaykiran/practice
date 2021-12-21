package yuown.p2021.walmart.vending;

public enum Coin {

	ONE(1), TWO(2), FIVE(5), TEN(10);

	private int amount;

	Coin(int amt) {
		this.amount = amt;
	}

	public int getAmount() {
		return amount;
	}
}
