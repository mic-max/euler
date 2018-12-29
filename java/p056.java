import java.math.BigInteger;

public final class p056 implements EulerSolution {

	private static final int N = 100;

	public String run() {
		int max = -1;
		for (int a = 1; a < N; a++) {
			for (int b = 1; b < N; b++) {
				BigInteger val = BigInteger.valueOf(a).pow(b);
				max = Math.max(max, Library.sumDigits(val));
			}
		}

		return String.format("%d", max);
	}
}