public final class p023 implements EulerSolution {

	private static final int LOWER = 12;
	private static final int UPPER = 28123;
	private boolean[] isAbundant = new boolean[UPPER + 1];
	
	public String run() {
		for (int i = 1; i < isAbundant.length; i++)
			isAbundant[i] = Library.sumDivisors(i) > i;
		
		int sum = 0;
		for (int i = 1; i <= UPPER; i++) {
			if (!isSumAbundants(i))
				sum += i;
		}

		return String.format("%d", sum);
	}

	private boolean isSumAbundants(int n) {
		for (int i = 0; i <= n; i++) {
			if (isAbundant[i] && isAbundant[n - i])
				return true;
		}
		return false;
	}
}
