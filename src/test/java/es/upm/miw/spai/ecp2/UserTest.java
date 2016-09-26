package es.upm.miw.spai.ecp2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class UserTest {
	
	private User j;
	
	@Before
    public void before() {
        j = new User(1,"Jose","Moreno");
    }

	@Test
	public void testUser() {
		assertEquals(1, j.getNumber());
		assertEquals("Jose", j.getName());
		assertEquals("Moreno", j.getFamilyName());
	}

	@Test
	public void testGetNumber() {
		assertEquals("Jose", j.getName());
	}

	@Test
	public void testGetName() {
		assertEquals("Jose", j.getName());
	}

	@Test
	public void testGetFamilyName() {
		assertEquals("Moreno", j.getFamilyName());
	}

	@Test
	public void testFullName() {
		assertEquals("Jose Moreno", j.fullName());
	}

	@Test
	public void testInitials() {
		assertEquals("J.", j.initials());
	}

}
