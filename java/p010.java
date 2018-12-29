public final class p010 implements EulerSolution {

	private static final int N = 2000000;

	public String run() {
		long sum = 0;

		for (int num : Library.listPrimes(N - 1))
			sum += num;

		return String.format("%d", sum);
	}
}
