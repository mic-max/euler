import java.io.File;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public final class p018 implements EulerSolution {

	private Integer[] pyramid;

	public p018(String filename) {
		readPyramid(filename);
	}

	// TODO move away from 2D concept of the pyramid, cleanup confusing maths
	private int at(int i, int j) {
		return i * (i + 1) / 2 + j;
	}

	private double quadraticFormula(double a, double b, double c) {
		return (-1*b + Math.sqrt(b*b + 4*a*c)) / (2*a);
	}

	public String run() {
		for (int i = (int) quadraticFormula(1, 1, 2 * pyramid.length) - 2; i >= 0; i--) {
			for (int j = 0; j < i + 1; j++)
				pyramid[at(i, j)] += Math.max(pyramid[at(i + 1, j)],  pyramid[at(i+1, j+1)]);
		}
		return String.format("%d", pyramid[0]);
	}

	private void readPyramid(String filename) {
		File file = new File(filename);
		List<Integer> list = new ArrayList<>();

		try (Scanner sc = new Scanner(file);) {
			while (sc.hasNextInt())
				list.add(sc.nextInt());
		} catch (Exception e) {
			e.printStackTrace();
		}

		this.pyramid = list.stream().toArray(Integer[]::new);
	}
}
