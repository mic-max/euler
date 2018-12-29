import java.math.BigInteger;

public final class p048 implements EulerSolution {

	private static final int N = 1000;
	private static final int M = 10;

	public String run() {
		BigInteger sum = BigInteger.ZERO;

		for (int i = 1; i <= N; i++) {
			BigInteger x = BigInteger.valueOf(i);
			sum = sum.add(x.pow(i));
		}

		String result = sum.toString();
		return String.format("%s", result.substring(result.length() - M));
	}
}