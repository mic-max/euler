import static org.junit.Assert.assertEquals;
import org.junit.Test;

public final class EulerTest {

	@Test public void testP001() { assertEquals("233168",       new p001().run()); }
	@Test public void testP002() { assertEquals("4613732",      new p002().run()); }
	@Test public void testP003() { assertEquals("6857",         new p003().run()); }
	@Test public void testP004() { assertEquals("906609",       new p004().run()); }
	@Test public void testP005() { assertEquals("232792560",    new p005().run()); }
	@Test public void testP006() { assertEquals("25164150",     new p006().run()); }
	@Test public void testP007() { assertEquals("104743",       new p007().run()); }
	@Test public void testP008() { assertEquals("23514624000",  new p008().run()); }
	@Test public void testP009() { assertEquals("31875000",     new p009().run()); }
	@Test public void testP010() { assertEquals("142913828922", new p010().run()); }
	@Test public void testP011() { assertEquals("70600674",     new p011().run()); }
}
