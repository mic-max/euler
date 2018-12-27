import java.util.regex.Pattern;

public final class p017 implements EulerSolution {

	private static final int N = 1000;

	// TODO improve speed of solution by counting how many of each english word appears in the range
	// eg. hundred appears 899? times between 1 and 1000
	//     seven appears 200 times, (100 times in the ones place, and 100 times in the hundreds place)
	public String run() {
		int letters = 0;
		Pattern p = Pattern.compile("[ \\-]");

		for (int i = 1; i <= N; i++)
			letters += p.matcher(Library.toEnglish(i)).replaceAll("").length();

		return String.format("%d", letters);
	}
}
