import java.math.BigInteger;
import java.util.stream.*;
import java.util.Arrays;

final class Library {

	public static boolean anagram(String s1, String s2) {
		char[] w1 = s1.replaceAll("[\\s]", "").toCharArray();
		char[] w2 = s2.replaceAll("[\\s]", "").toCharArray();
		Arrays.sort(w1);
		Arrays.sort(w2);
		return Arrays.equals(w1, w2);
	}

	public static boolean palindrome(String str) {
		return str.equals(reverse(str));
	}

	public static String reverse(String str) {
		return new StringBuilder(str).reverse().toString();
	}

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

	public static int sumDigits(BigInteger num) {
		int sum = 0;
		for (char c : num.toString().toCharArray())
			sum += Character.getNumericValue(c);
		return sum;
	}

	public static int scoreWord(String word) {
		int score = word.length() * -64;
		for (byte b : word.getBytes())
			score += b;
		return score;
	}

	public static int sqrt(int x) {
		return (int) Math.floor(Math.sqrt(x));
	}

	public static int sumDivisors(int n) {
		if (n < 1)
			throw new IllegalArgumentException();

		int sum = 1;
		final int end = Library.sqrt(n);
		for (int i = 2; i <= end; i++) {
			if (n % i == 0)
				sum += i + n/i;
		}

		if (end * end == n)
			sum -= end;
		return sum;
	}

	public static boolean[] listPrimality(int n) {
		boolean[] result = new boolean[n + 1];
		if (n >= 2)
			result[2] = true;
		for (int i = 3; i <= n; i += 2)
			result[i] = true;
		
		// Sieve of Eratosthenes
		for (int i = 3, end = sqrt(n); i <= end; i += 2) {
			if (result[i]) {
				for (int j = i * i, inc = i * 2; j <= n; j += inc)
					result[j] = false;
			}
		}
		return result;
	}

	public static int[] listPrimes(int n) {
		boolean[] isPrime = listPrimality(n);
		int count = (int) IntStream.range(0, isPrime.length).mapToObj(i -> isPrime[i]).filter(p -> p).count();

		int[] result = new int[count];
		for (int i = 0, j = 0; i < isPrime.length; i++) {
			if (isPrime[i]) {
				result[j] = i;
				j++;
			}
		}
		return result;
	}

	private static final String[] ONES = {
		"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven",
		"twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"
	};
	private static final String[] TENS = {
		"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"
	};
}
