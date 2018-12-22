import java.util.stream.Collectors;
import java.util.stream.Stream;

public final class p002 implements EulerSolution {

	private static final Stream<Long> FIB = Stream.iterate(
		new Long[]{0L, 1L}, p->new Long[]{p[1], p[0] + p[1]})
		.limit(92)
		.map(n -> n[0]);

	public String run() {
		// System.out.println(FIB.filter(n -> n < 4000000).collect(Collectors.toList()));
		Long sum = FIB.filter(n -> n < 4_000_000 && n % 2 == 0).reduce(Long::sum).get();
		return String.format("%d", sum);
	}
}