public final class p021 implements EulerSolution {

	private static final int N = 10000;

	private static boolean isAmicable(int n) {
		int val = Library.sumDivisors(n);
		return val != n && val >= 1 && Library.sumDivisors(val) == n;
	}

	// TODO add both of the amicable pairs to the sum, memoization
	public String run() {
		int sum = 0;
		for (int i = 1; i < N; i++) {
			if (isAmicable(i))
				sum += i;
		}

		return String.format("%d", sum);
	}
}
