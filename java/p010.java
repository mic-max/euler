public final class p010 implements EulerSolution {

	private static final int N = 2000000;

	public String run() {
		PrimeGenerator pg = new PrimeGenerator();
		long sum = 0;

		// TODO speedup this prime generation, takes ~150 seconds
		for (Long num : pg) {
			if (num >= N)
				break;

			sum += num;
		}

		return String.format("%d", sum);
	}
}
