import java.math.BigInteger;

public final class p025 implements EulerSolution {

	private static final BigInteger N = BigInteger.TEN.pow(999);

	public String run() {
		BigInteger f1 = BigInteger.ONE;
		BigInteger f2 = BigInteger.ONE;
		int index;

		for (index = 2; N.compareTo(f2) == 1; index++) {
			BigInteger tmp = f1;
			f1 = f2;
			f2 = f2.add(tmp);
		}

		return String.format("%d", index);
	}
}
