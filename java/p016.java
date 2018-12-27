import java.math.BigInteger;

public final class p016 implements EulerSolution {

	public String run() {
		BigInteger num = BigInteger.ONE.shiftLeft(1000);

		int sum = 0;
		for (char c : num.toString().toCharArray())
			sum += Character.getNumericValue(c);

		return String.format("%d", sum);
	}
}
