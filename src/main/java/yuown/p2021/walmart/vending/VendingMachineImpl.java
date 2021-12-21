package yuown.p2021.walmart.vending;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class VendingMachineImpl implements VendingMachine {

	private List<Item> inventory = new ArrayList<>();

	private TreeMap<String, Integer> stock = new TreeMap<>();

	private int amountAccepted;

	@Override
	public void acceptCoin(Coin coin) {
		amountAccepted += coin.getAmount();
	}

	@Override
	public void returnCoin(Coin coin) {
		// TODO Auto-generated method stub

	}

	@Override
	public void listStock() {
		System.out.println("Available Stock: Select an Option");
		int i = 1;
		for (Item item : inventory) {
			System.out.println(i++ + " : " + item.getName() + " = " + item.getPrice());
		}
	}

	@Override
	public void confirmOrder(Integer option, int qty) {
	}

	@Override
	public Item releaseItem() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateStock() {
		// TODO Auto-generated method stub

	}

}
