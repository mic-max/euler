import java.math.BigInteger;

public final class p016 implements EulerSolution {

	public String run() {
		BigInteger num = BigInteger.ONE.shiftLeft(1000);

		return String.format("%d", Library.sumDigits(num));
	}
}
