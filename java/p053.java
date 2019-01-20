import java.math.BigInteger;

public final class p053 implements EulerSolution {

	private static final BigInteger N = BigInteger.TEN.pow(6);

	public String run() {
		int count = 0;
		// hint says the smallest value of n to result in over 1000000 is 23
		for (int n = 23; n <= 100; n++) {
			for (int r = 1; r <= n; r++) {
				BigInteger choose = Library.binomial(n, r);
				if (choose.compareTo(N) == 1)
					count++;
			}
		}

		return String.format("%d", count);
	}
}