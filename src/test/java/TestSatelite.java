import static org.junit.Assert.*;

import org.junit.Test;

public class TestSatelite {
	private double meridiano;
	private double paralelo;
	private double distanciaTierra;

	@Test
	public void testConstructor1() {
		meridiano = 107;
		paralelo = 200;
		distanciaTierra = 500;
		Satelite sateliteTest = new Satelite(meridiano, paralelo, distanciaTierra);
		assertEquals(sateliteTest.meridiano, 107, 0);
		assertEquals(sateliteTest.paralelo, 200, 0);
		assertEquals(sateliteTest.distanciaTierra, 500, 0);
	}

	@Test
	public void testConstructor2() {
		Satelite sateliteTest = new Satelite();
		assertEquals(sateliteTest.meridiano, 0, 0);
		assertEquals(sateliteTest.paralelo, 0, 0);
		assertEquals(sateliteTest.distanciaTierra, 0, 0);
	}
	
	@Test
	public void testSetPosicion() {
		meridiano = 11;
		paralelo = 22;
		distanciaTierra = 44;
		Satelite sateliteTest = new Satelite();
		sateliteTest.setPosicion(meridiano, paralelo, distanciaTierra);
		assertEquals(sateliteTest.meridiano, 11, 0);
		assertEquals(sateliteTest.paralelo, 22, 0);
		assertEquals(sateliteTest.distanciaTierra, 44, 0);
	}
	
	@Test
	public void testEnOrbita() {
		distanciaTierra = 20;
		Satelite sateliteTest = new Satelite();
		sateliteTest.distanciaTierra=distanciaTierra;
		assertEquals(false, sateliteTest.enOrbita());
		sateliteTest.distanciaTierra=100;
		assertEquals(true, sateliteTest.enOrbita());
	}
}
