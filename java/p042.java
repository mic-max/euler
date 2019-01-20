import java.util.*;
import java.io.*;
import java.util.stream.Stream;

public final class p042 implements EulerSolution {

	private Set<Integer> trinums = new HashSet<>();

	public String run() {
		// TODO check that a value is a triangle number more intelligently than just
		// adding the first thousand to a set..
		for (int i = 1; i < 1000; i++)
			trinums.add((int) (0.5 * i * (i+1)));
		
		long result = -1;
		try (BufferedReader buffer = new BufferedReader(new InputStreamReader(new FileInputStream("data/input042.txt")))) {
			result = Stream.of(buffer.readLine().split(","))
			.map(s -> Library.scoreWord(s.replaceAll("\"", "")))
			.filter(e -> trinums.contains(e))
			.count();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return String.format("%d", result);
	}
}