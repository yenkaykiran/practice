package yuown.p2021.walmart.vending;

public interface VendingMachine {

	public void acceptCoin(Coin coin);

	public void returnCoin(Coin coin);

	public void listStock();

	public void confirmOrder(Integer option, int qty);

	public Item releaseItem();

	public void updateStock();
}
