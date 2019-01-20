public final class p052 implements EulerSolution {

	public String run() {
		int i = 1;

		// TODO optimize by bucketizing digits of i once per 2..6 loop and readability
		outer: for (i = 1; ; i++) {
			final String s1 = "" + i;
			for (int j = 2; j <= 6; j++) {
				if (!Library.anagram(s1, "" + i * j))
					continue outer;
			}
			break;
		}

		return String.format("%d", i);
	}
}