public final class p012 implements EulerSolution {

	private static final int N = 500;

	private static int numDivisors(int n) {
		int count = 0;
		int stop = (int) Math.sqrt(n);

		for (int i = 1; i < stop; i++) {
			if (n % i == 0)
				count += 2;
		}

		if (stop*stop == n)
			count++;

		return count;
	}

	public String run() {
		int triangle = 0;
		int divisors = 0;
		for (int i = 0; divisors <= N; i++) {
			triangle += i;
			divisors = numDivisors(triangle);
		}

		return String.format("%d", triangle);
	}
}
