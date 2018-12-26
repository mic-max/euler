public final class p009 implements EulerSolution {

	private static final int N = 1000;

	public String run() {
		int prod = -1;

		for (int i = 1; i < N; i++) {
			for (int j = 1; j < N - i; j++) {
				int k = N - i - j;
				if (i*i + j*j == k*k) {
					prod = i * j * k;
					break;
				}
			}
		}

		return String.format("%d", prod);
	}
}
