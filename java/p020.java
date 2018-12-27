import java.math.BigInteger;

public final class p020 implements EulerSolution {

	private static final int N = 100;

	public String run() {
		int sum = 0;
		BigInteger num = Library.factorial(N);

		for (char c : num.toString().toCharArray())
			sum += Character.getNumericValue(c);

		return String.format("%d", sum);
	}
}
