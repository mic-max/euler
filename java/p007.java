public final class p007 implements EulerSolution {

	private static final int N = 10001;

	public String run() {
		PrimeGenerator pg = new PrimeGenerator();

		return String.format("%d", pg.get(N - 1));
	}
}
