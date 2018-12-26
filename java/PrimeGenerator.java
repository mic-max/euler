import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class PrimeGenerator implements Iterable<Long> {
	private List<Long> primes;
	private long cur;

	public PrimeGenerator() {
		primes = new ArrayList<>();
		cur = 2;
	}

	public long get(int n) {
		outer: for (; primes.size() <= n; cur++) {
			for (Long p : primes) {
				if (cur % p == 0)
					continue outer;
			}
			primes.add(cur);
		}

		return primes.get(n);
	}

	@Override
	public Iterator<Long> iterator() {
		Iterator<Long> iter = new Iterator<Long>() {
			private int cur = 0;
			public boolean hasNext() { return true; }
			public void remove() { throw new UnsupportedOperationException(); }

			public Long next() {
				return get(cur++);
			}
		};

		return iter;
	}

	public static void main(String[] args) {
		PrimeGenerator pg = new PrimeGenerator();

		for (Long i : pg) {
			if (i > 77)
				break;
			System.out.println(i);
		}
	}
}
