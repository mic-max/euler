import java.util.LinkedList;
import java.util.Iterable;

public class PrimeGenerator implements Iterable<Integer> {
	private LinkedList<Integer> primes;
	private int cur;

	public PrimeGenerator() {
		primes = new LinkedList<>();
		cur = 2;
	}

	public int get(int n) {
		outer: for (; primes.size() <= n; cur++) {
			for (Integer p : primes) {
				if (cur % p == 0)
					continue outer;
			}
			primes.add(cur);
		}

		return primes.get(n);
	}

	public static void main(String[] args) {
		PrimeGenerator pg = new PrimeGenerator();

		for (Integer i : pg) {
			if (i > 77)
				break;
			System.out.println(i);
		}
	}
}