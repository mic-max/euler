import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public final class p024 implements EulerSolution {

	private static final int N = 1000000;
	private List<Integer> elems = new ArrayList<>(Arrays.asList(0,1,2,3,4,5,6,7,8,9));
	private int[] factorial = new int[10];

	public String run() {
		for (int i = 1; i < 10; i++)
			factorial[i] = Library.factorial(i).intValue();

		int current = N - 1;
		String result = "";

		for (int i = elems.size() - 1; current > 0; i--) {
			int fits = (int) Math.floor(current / factorial[i]);
			current -= fits * factorial[i];
			result += elems.remove(fits);
		}
		result += elems.toString().replaceAll("[\\[\\], ]", "");

		return String.format("%s", result);
	}
}
