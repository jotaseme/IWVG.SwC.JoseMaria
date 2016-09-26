package es.upm.miw.spai.ecp2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class UserTest {
	
	private User j;
	
	@Before
    public void before() {
        j = new User(1,"Jose Maria","Moreno");
    }

	@Test
	public void testUser() {
		assertEquals(1, j.getNumber());
		assertEquals("Jose Maria", j.getName());
		assertEquals("Moreno", j.getFamilyName());
	}

	@Test
	public void testGetNumber() {
		assertEquals("Jose Maria", j.getName());
	}

	@Test
	public void testGetName() {
		assertEquals("Jose Maria", j.getName());
	}

	@Test
	public void testGetFamilyName() {
		assertEquals("Moreno", j.getFamilyName());
	}

	@Test
	public void testFullName() {
		assertEquals("Jose Maria Moreno", j.fullName());
	}

	@Test
	public void testInitials() {
		assertEquals("J.", j.initials());
	}

}
