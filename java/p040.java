public final class p040 implements EulerSolution {

	private static int[] offs = genOffsets(6);

	public String run() {
		int prod = 1;

		for (int i = 1; i <= 1_000_000; i *= 10) {
			int mult = getDigit(i);
			prod *= mult;
		}

		return String.format("%d", prod);
	}

	private static int getDigit(int d) {
		if (d <= 10)
			return Library.getDigit(d, 0);

		int pos = numRange(d);
		int newVal = d - offs[pos];
		int frick = newVal / (pos + 1) + (int) Math.pow(10, pos) - 1;
		int rem = newVal % (pos + 1);
		
		return Library.getDigit(frick, rem - 1);
	}

	private static int numRange(int d) {
		for (int i = 1; i < offs.length; i++) {
			if (d < offs[i])
				return i - 1;
		}

		return offs.length - 1;
	}

	private static int[] genOffsets(int n) {
		int[] res = new int[n];
		res[0] = 0;

		for (int i = 1; i < n; i++)
			res[i] = (9 * (int) Math.pow(10, i - 1)) * i + res[i - 1];

		return res;
	}
}
