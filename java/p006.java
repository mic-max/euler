public final class p006 implements EulerSolution {

	private static final int N = 100;

	public String run() {
		int sum = 0;
		int sq = (int) Math.pow(N * (N+1) / 2, 2);

		for (int i = 1; i <= N; i++)
			sum += (int) Math.pow(i, 2);

		return String.format("%d", sq - sum);
	}
}
