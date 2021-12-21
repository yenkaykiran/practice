package yuown.p2021;

public class PrimesBySieves {
	
	public static void main(String[] args) {
		int n = 100000;
		boolean[] primes = new boolean[n + 1];
		for(int i = 0; i <= n; i++) {
			primes[i] = true;
		}
		primes[0] = false;
		primes[1] = false;
		for(int i = 2; i * i <= n; i++) {
			if(primes[i] == true) {
				for(int j = i * i; j <= n; j += i) {
					primes[j] = false;
				}
			}
		}
		for (int i = 0; i <= n; i++) {
			if(primes[i]) {
				System.out.println(i);
			}
		}
	}
}
