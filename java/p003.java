import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public final class p003 implements EulerSolution {

	// n - max value of prime number
	// todo, other exit condition given number of primes
	private List<Long> primes(long n) {
		List<Long> list = new ArrayList<>();

		outer: for (long i = 2; i <= n; i++) {
			for (Long d : list) {
				if (i % d == 0)
					continue outer;
			}
			list.add(i);
		}

		return list;
	}

	private LinkedList<Long> primeFactors(long n) {
		List<Long> primes = primes(n);
		LinkedList<Long> list = new LinkedList<>();
		long cur = n;
		System.out.println(primes);

		while (cur > 1) {
			for (Long p : primes) {
				if (p % cur == 0) {
					System.out.printf("pd: %d", p);
					list.add(p);
					cur /= p;
					break;
				}
			}
		}

		return list;
	}

	public String run() {
		long primef = primeFactors(131953333L).getLast();
		// System.out.println(primes(13195L));

		return String.format("%d", 3);
	}
}