import java.io.File;
import java.util.*;
import java.util.stream.Stream;
import java.util.regex.Pattern;
import java.util.concurrent.atomic.AtomicInteger;

public final class p059 implements EulerSolution {

	private static final int ENOUGH = 80; // how many characters to score of text

	private Integer[] loadEncryptedData(String filename) {
		File file = new File(filename);
		List<Integer> list = new ArrayList<>();

		try (Scanner sc = new Scanner(file).useDelimiter("[,\\s]");) {
			while (sc.hasNextInt())
				list.add(sc.nextInt());
		} catch (Exception e) {
			e.printStackTrace();
		}

		return list.stream().toArray(Integer[]::new);
	}

	private static Integer[] decrypt(Integer[] ciphertext, int[] key) {
		AtomicInteger i = new AtomicInteger();
		return Arrays.stream(ciphertext)
		.map(c -> c ^ key[i.getAndIncrement() % key.length])
		.toArray(Integer[]::new);
	}

	private static long score(Integer[] data, int n) {
		return Arrays.stream(data)
		.limit(n)
		.filter(c -> Pattern.matches("[A-Za-z0-9 \\.]", String.format("%c", c)))
		.count();
	}

	public String run() {
		final Integer[] CIPHERTEXT = loadEncryptedData("data/input059.txt");
		int[] bestKey = null;
		Integer[] bestDecrypted = null;
		long bestScore = Long.MIN_VALUE;

		// TODO simplify how permutations of length n using a given set is iterated
		for (int i = 'a'; i <= 'z'; i++) {
			for (int j = 'a'; j <= 'z'; j++) {
				for (int k = 'a'; k <= 'z'; k++) {
					int[] key = {i, j, k};
					Integer[] decrypted = decrypt(CIPHERTEXT, key);
					long score = score(decrypted, ENOUGH);
					if (bestKey == null || score > bestScore) {
						bestKey = key;
						bestDecrypted = decrypted;
						bestScore = score;
					}
				}
			}
		}

		int sum = Stream.of(bestDecrypted).mapToInt(Integer::intValue).sum();
		return String.format("%d", sum);
	}
}