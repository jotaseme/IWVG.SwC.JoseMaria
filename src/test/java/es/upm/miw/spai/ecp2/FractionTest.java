 package es.upm.miw.spai.ecp2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import es.upm.miw.spai.ecp2.Fraction;;             

public class FractionTest {
	
	private Fraction f;	
	
    @Before
    public void before() {
        f = new Fraction(4, 2);
       
    }


	@Test
	public void testFractionIntInt() {
		assertEquals(4, f.getNumerator());
        assertEquals(2, f.getDenominator());
	}


	public void testFraction() {
		assertEquals(1, f.getNumerator());
        assertEquals(1, f.getDenominator());
	}

	@Test
	public void testDecimal() {
		assertEquals(2, f.decimal(),10e-5);
     
	}

	@Test
	public void testGetNumerator() {
		assertEquals(4, f.getNumerator());
	}

	@Test
	public void testGetDenominator() {
		assertEquals(2, f.getDenominator());
	}
	
	@Test
    public void testIsPropia() {
        assertFalse(f.isPropia());
    }

	@Test
    public void testIsEquivalente() {
	    Fraction instance = new Fraction();
	    Fraction f2 = new Fraction(10,5);
        assertEquals(true,instance.isEquivalente(f, f2));
    }
}
