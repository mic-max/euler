import static org.junit.Assert.assertEquals;
import org.junit.Test;

public final class EulerTest {

	@Test public void testP001() { assertEquals("233168",    new p001().run()); }
	@Test public void testP002() { assertEquals("4613732",   new p002().run()); }
	@Test public void testP003() { assertEquals("6857",      new p003().run()); }
	@Test public void testP004() { assertEquals("906609",    new p004().run()); }
	@Test public void testP005() { assertEquals("232792560", new p005().run()); }
	@Test public void testP006() { assertEquals("25164150",  new p006().run()); }
}
