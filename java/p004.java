public final class p004 implements EulerSolution {

	public String run() {
		int n = 0;

		final int MIN = 100;
		final int MAX = 999;

		for (int i = MAX; i >= MIN; i--) {
			for (int j = i; j >= MIN; j--) {
				int result = i * j;

				if (result > n && Library.palindrome("" + result))
					n = result;
			}
		}

		return String.format("%d", n);
	}
}