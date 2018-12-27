import java.math.BigInteger;

final class Library {

	public static String toEnglish(int n) {
		if (n < 0 || n >= 1000000)
			throw new IllegalArgumentException("Does not currently support negatives or millions.");

		if (n < 20)
			return ONES[n];
		if (n < 100)
			return TENS[n / 10] + (n % 10 != 0 ? "-" + ONES[n % 10] : "");
		if (n < 1000)
			return ONES[n / 100] + " hundred" + (n % 100 != 0 ? " and " + toEnglish(n % 100) : "");

		return ONES[n / 1000] + " thousand" + (n % 1000 != 0 ? " " + toEnglish(n % 1000) : "");
	}

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

	private static final String[] ONES = {
		"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven",
		"twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"
	};
	private static final String[] TENS = {
		"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"
	};
}
