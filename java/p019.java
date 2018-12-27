import java.util.Calendar;
import java.util.GregorianCalendar;

public final class p019 implements EulerSolution {

	public String run() {
		Calendar cal = new GregorianCalendar(1901, Calendar.JANUARY, 1);

		int sundays = 0;
		while (cal.get(Calendar.YEAR) < 2001) {
			if (cal.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY)
				sundays++;

			cal.add(Calendar.MONTH, 1);
		}

		return String.format("%d", sundays);
	}
}
