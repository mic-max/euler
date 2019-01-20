public final class p026 implements EulerSolution {

	private static int recurringCycle(double a) {
		return 1;
	}

	public String run() {
		int maxIndex = -1;
		int maxRecur = 0;
		for (int i = 2; i < 1000; i++) {
			int cycle = recurringCycle(1 / i);
			if (cycle > maxRecur) {
				maxIndex = i;
				maxRecur = cycle;
			}

		}

		return String.format("%d", maxIndex);
	}
}
