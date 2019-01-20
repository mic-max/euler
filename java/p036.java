public final class p036 implements EulerSolution {

	private static final int N = 1000000;

	public String run() {
		int sum = 0;
		for (int i = 0; i < N; i++) {
			if (Library.palindrome(Integer.toBinaryString(i)) && Library.palindrome("" + i))
				sum += i;
		}

		return String.format("%d", sum);
	}
}