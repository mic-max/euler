import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public final class p022 implements EulerSolution {

	private static int scoreName(String name, int i) {
		int score = name.length() * -64;
		for (byte b : name.getBytes())
			score += b;
		return i * score;
	}

	public String run() {
		AtomicInteger i = new AtomicInteger();
		int result = -1;

		try (BufferedReader buffer = new BufferedReader(new InputStreamReader(new FileInputStream("data/input022.txt")))) {
			result = Stream.of(buffer.readLine().split(","))
			.map(s -> s.replaceAll("\"", ""))
			.sorted()
			.collect(Collectors.summingInt(s -> scoreName(s, i.incrementAndGet())));
		} catch (Exception e) {
			e.printStackTrace();
		}

		return String.format("%d", result);
	}
}
