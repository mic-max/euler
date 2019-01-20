import java.math.BigInteger;

public final class p055 implements EulerSolution {

	private static final int N = 10000;
	private static final int M = 50;

	private static boolean isLychrel(int n) {
		BigInteger num = BigInteger.valueOf(n);
		for (int i = 1; i < M; i++) {
			num = num.add(new BigInteger(Library.reverse(num.toString())));
			if (Library.palindrome(num.toString()))
				return false;
		}
		return true;
	}

	public String run() {
		int count = 0;

		// TODO optimize by flagging all intermediate sums as lychrels
		// if it eventually becomes lychrel in less than 50 steps
		for (int i = 0; i < N; i++) {
			if (isLychrel(i))
				count++;
		}

		return String.format("%d", count);
	}
}