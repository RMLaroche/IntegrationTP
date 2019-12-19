package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.Calculs;

class CalculsTest {
	
	protected int operande1 = 6;
	protected int operande2 = 9;
	Calculs calculs ;

	@BeforeEach
	void setUp() throws Exception {			//ce qui va	être éxécuté avant
		
		this.calculs = new Calculs(operande1,operande2);   //instancier objet calcul
		//attribuer des valeurs
	}

	@AfterEach
	void tearDown() throws Exception {
	}


	@Test
	void testMultiplier() {
		assertEquals(54, this.calculs.multiplier());
		//assertequals
	}

	@Test
	void testAdditionner() {
		assertEquals(15, this.calculs.additionner());
	}

	@Test
	void testDiviser() {
		assertEquals((6/9), this.calculs.diviser());
		Calculs calculs2 = new Calculs(8,0);
		Assertions.assertThrows(ArithmeticException.class,()->{calculs2.diviser();});
			
	}

	@Test
	void testSoustraire() {
		assertEquals(-3, this.calculs.soustraire());
	}

}
