package edu.umb.cs680.hw04;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StudentTest {
	Student inStateStudent = Student.createInStateStudent("deepak", "bos");
	Student outStateStudent = Student.createOutStateStudent("deepak", "charlotte", 20,"Northcarolina");
	Student intlStudent = Student.createIntlStudent("deepak", "in", 367834, "in");

	

	@Test
	void testGetI20() {
		assertEquals(0, inStateStudent.getI20());
		assertEquals(0, outStateStudent.getI20());
		assertEquals(367834, intlStudent.getI20());
		
	}
	
	@Test
	void testGetName() {
		assertEquals("deepak", inStateStudent.getName());
		assertEquals("deepak", outStateStudent.getName());
		assertEquals("deepak", intlStudent.getName());
	}



	@Test
	void testGetYearsInState() {
		assertEquals(0, inStateStudent.getYearsInState());
		assertEquals(20, outStateStudent.getYearsInState());
		assertEquals(0, intlStudent.getYearsInState());
	}

	@Test
	void testGetState() {
		assertNull(inStateStudent.getState());
		assertEquals("Northcarolina",outStateStudent.getState());
		assertNull(intlStudent.getState());
	}  
	
	@Test
	void testGetUsAddress() {
		assertEquals("bos", inStateStudent.getUsAddress());
		assertEquals("charlotte", outStateStudent.getUsAddress());
		assertEquals("in", intlStudent.getUsAddress());
	}

	@Test
	void testGetForeignAddress() {
		assertNull(inStateStudent.getForeignAddress());
		assertNull(outStateStudent.getForeignAddress());
		assertEquals("in", intlStudent.getForeignAddress());
	}
	@Test
	void testCreateInStateStudentName() {
		Student student= Student.createInStateStudent("deepak", "bos");
		String name = "deepak";
		assertEquals(name, student.getName());
	}
	
	
	
	
	@Test
	void testCreateOutStateStudentAddress() {
		Student student = Student.createOutStateStudent("deepak", "charlotte", 20,"Northcarolina");
		String address = "charlotte";
		assertEquals(address, student.getUsAddress());
	}
	
	@Test
	void testCreateOutStateStudentYearsInState() {
		Student student = Student.createOutStateStudent("deepak", "charlotte", 20,"Northcarolina");
		int expected = 20;
		assertEquals(expected, student.getYearsInState());
	}
	
	@Test
	void testCreateOutStateStudentState() {
		Student student = Student.createOutStateStudent("deepak", "charlotte", 40,"Northcarolina");
		String expected = "Northcarolina";
		assertEquals(expected, student.getState());
	}
	
	@Test
	void testCreateOutStateStudentTuition() {
		Student student = Student.createOutStateStudent("deepak", "charlotte", 40,"Northcarolina");
		float actual = student.getTuition(); 
		float expected = 15000;
		assertEquals(expected, actual);
	
	}   
	
	@Test
	void testCreateIntlStudentForeignAddress() {
		Student student = Student.createIntlStudent("deepakrtp", "in", 367834, "in");
		String address = "in";
		assertEquals(address, student.getForeignAddress());
	}
	
	@Test
	void testCreateIntlStudentTuition() {
		Student student = Student.createIntlStudent("deepakrtp", "in", 367834, "in");
		float actual = student.getTuition(); 
		float expected = 30000;
		assertEquals(expected, actual);
	}
	

}
