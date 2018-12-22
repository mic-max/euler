import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public final class p003 implements EulerSolution {

	private LinkedList<Long> primeFactors(long n) {
		LinkedList<Long> list = new LinkedList<>();
		PrimeGenerator primes = new PrimeGenerator();
		long cur = n;

		while (cur > 1) {
			for (Long p : primes) {
				if (cur % p == 0) {
					list.add(p);
					cur /= p;
					break;
				}
			}
		}

		return list;
	}

	public String run() {
		long primef = primeFactors(600851475143L).getLast();

		return String.format("%d", primef);
	}
}