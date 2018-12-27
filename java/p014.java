import java.math.BigInteger;

public final class p014 implements EulerSolution {

	private static final int N = 1000000;
	private static final BigInteger CACHE_SIZE = BigInteger.valueOf(N);
	private int[] lengths = new int[CACHE_SIZE.intValue()];

	public String run() {
		int maxStart = -1;
		int maxChain = 0;
		for (int i = 1; i < N; i++) {
			int chainLen = collatzCache(BigInteger.valueOf(i));
			if (chainLen > maxChain) {
				maxStart = i;
				maxChain = chainLen;
			}
		}
		return String.format("%d", maxStart);
	}

	private int collatzCache(BigInteger n) {
		if (n.signum() < 0)
			throw new IllegalArgumentException();

		if (n.compareTo(CACHE_SIZE) >= 0)
			return collatz(n);

		int index = n.intValue();
		if (lengths[index] == 0)
			lengths[index] = collatz(n);
		return lengths[index];
	}

	private int collatz(BigInteger n) {
		if (n.equals(BigInteger.ONE))
			return 1;

		return 1 + collatzCache(n.testBit(0) ? n.multiply(BigInteger.valueOf(3)).add(BigInteger.ONE) : n.shiftRight(1));
	}
}
