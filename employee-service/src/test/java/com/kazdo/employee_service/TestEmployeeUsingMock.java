package com.kazdo.employee_service;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class TestEmployeeUsingMock {

	@Mock
	EmployeeDataService edsMock;
	List<String> programmerEmployeeStub = new ArrayList<>();
	List<String> systemAdmidEmployeeStub = new ArrayList<>();
	private Employee employee;

	@Before
	public void init() {
		// can use @Mock instead of this line and need to @RunWith above test class.
		// edsMock = mock(EmployeeDataService.class);
		employee = new Employee(edsMock);

		programmerEmployeeStub.add("John");
		programmerEmployeeStub.add("Ruby");
		programmerEmployeeStub.add("Ohima");
		programmerEmployeeStub.add("Barak");

		systemAdmidEmployeeStub.add("Dan");
		systemAdmidEmployeeStub.add("Moji");
	}

	@Test
	public void testGetProgramerEmployee() {
		when(edsMock.getData()).thenReturn(programmerEmployeeStub);
		assertEquals(4, employee.getEmployeeOfCareer("Programmer").size());
		verify(edsMock).getData();
	}

	@Test
	public void testGetSystemAdminEmployee() {
		when(edsMock.getData()).thenReturn(systemAdmidEmployeeStub);
		assertEquals(2, employee.getEmployeeOfCareer("System Admin").size());
		verify(edsMock).getData();
	}

	@Test
	public void MutiValueReturnMock() {
		when(edsMock.getData()).thenReturn(systemAdmidEmployeeStub).thenReturn(programmerEmployeeStub);

		assertEquals(2, employee.getEmployeeOfCareer("System Admin").size());
		assertEquals(4, employee.getEmployeeOfCareer("Programmer").size());
	}

	@Test(expected = Exception.class)
	public void testThrowExceptionMock() {
		when(edsMock.getData()).thenThrow(Exception.class);
		assertEquals(2, employee.getEmployeeOfCareer("System Admin").size());
	}

}
