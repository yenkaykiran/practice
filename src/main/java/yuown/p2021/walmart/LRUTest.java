package yuown.p2021.walmart;

public class LRUTest {

	public static void main(String[] args) {
		int c = 4;
		LRUCache cache = new LRUCache(c);
		
		cache.put(1, 1);
		cache.put(1, 2);
		cache.put(2, 3);
		cache.put(2, 4);
		
		System.out.println(cache);
	}
	
}
