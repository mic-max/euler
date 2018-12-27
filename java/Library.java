import java.math.BigInteger;

final class Library {

	public static BigInteger binomial(int n, int k) {
		if (k < 0 || k > n)
			throw new IllegalArgumentException();

		BigInteger product = BigInteger.ONE;
		for (int i = 0; i < k; i++)
			product = product.multiply(BigInteger.valueOf(n - i));
		return product.divide(factorial(k));
	}

	public static BigInteger factorial(int n) {
		if (n < 0)
			throw new IllegalArgumentException();
		BigInteger product = BigInteger.ONE;
		for (int i = 2; i <= n; i++)
			product = product.multiply(BigInteger.valueOf(i));
		return product;
	}
}
