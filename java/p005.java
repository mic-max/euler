import java.math.BigInteger;

public final class p005 implements EulerSolution {

	private static BigInteger lcm(BigInteger a, BigInteger b) {
		return a.divide(a.gcd(b)).multiply(b);
	}

	public String run() {
		BigInteger result = BigInteger.ONE;
		for (int i = 2; i <= 20; i++)
			result = lcm(BigInteger.valueOf(i), result);

		return String.format("%s", result);
	}
}
