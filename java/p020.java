import java.math.BigInteger;

public final class p020 implements EulerSolution {

	public String run() {
		BigInteger num = Library.factorial(100);

		return String.format("%d", Library.sumDigits(num));
	}
}
