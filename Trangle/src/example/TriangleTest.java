package example;

import static org.junit.Assert.*;

import org.junit.Test;

public class TriangleTest {

	@Test
	public void vaidTriangleShouldHavePositiveSide() {
		assertTrue(new Triangle(2,4,5).isValid());
		assertFalse(new Triangle(-2,4,5).isValid());
		assertFalse(new Triangle(-1,-1,-1).isValid());
		assertFalse(new Triangle(1,1,0).isValid());
		assertFalse(new Triangle(0,0,0).isValid());
	}
	@Test
	public void vaidTriangleShouldHaveSTGTOS() {
		assertTrue(new Triangle(1,1,1).isValid());
		assertFalse(new Triangle(1,1,3).isValid());
		assertFalse(new Triangle(1,3,1).isValid());
		assertFalse(new Triangle(3,1,1).isValid());
	}
	@Test
	public void test() {
		fail("Not yet implemented");
	}
}
