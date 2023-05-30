package com.skillsoft.junit;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.GregorianCalendar;
//import java.util.LinkedList;
//import java.util.ArrayList;
//import static org.junit.jupiter.api.Assertions.assertIterableEquals;
//import static org.junit.jupiter.api.Assertions.assertAll;
//import static org.junit.jupiter.api.Assertions.assertThrows;
//import javax.naming.InvalidNameException;
//import javax.naming.NamingException;
//import static org.junit.jupiter.api.Assertions.assertNotNull;
//import static org.junit.jupiter.api.Assertions.assertNull;
//import static org.junit.jupiter.api.Assertions.assertTimeout;
//import java.time.Duration;
//import static org.junit.jupiter.api.Assertions.assertNotSame;
//import static org.junit.jupiter.api.Assertions.assertSame;
//import static org.junit.jupiter.api.Assertions.assertFalse;
//import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeTest {

//    static Employee firstEmployee;
//    static Employee secondEmployee;

    static Employee employee;
    static GregorianCalendar gc;

    @BeforeAll
    static void initEmployee() {

        employee = new Employee("Susan", "Forrester", 1005, 'F',
                "Tech Lead", 80000, "Permanent");

        gc = new GregorianCalendar();

//        firstEmployee = new Employee("Susan", "4ester", 1005, 'F',
//                "Tech Lead", 80000, "Permanent");

//        firstEmployee = new Employee("Amy", "Cruz", 1001, 'F',
//                "Developer", 50000, "Permanent");

//        secondEmployee = null;

//        secondEmployee = new Employee("Brian", "Alford", 1011, 'M',
//                "Developer", 45000, "Contract");

//        employee = new Employee("Amy", "Cruz", 1001, 'F',
//                "Developer", 50000, "Permanent");
    }

    @Test
    void assumptionTest() {

        System.out.println("Current hour: " + gc.get(Calendar.HOUR_OF_DAY));

        Assumptions.assumingThat(gc.get(Calendar.HOUR_OF_DAY) < 10,
                () -> {employee.adjustSalary(5000);
                    assertEquals(85000, employee.getSalary());
                    System.out.println("\nThe assumption was satisfied and the test was run.");});

//        Assumptions.assumingThat(gc.get(Calendar.HOUR_OF_DAY) < 20,
//                () -> {employee.adjustSalary(5000);
//                    assertEquals(85000, employee.getSalary());
//                    System.out.println("\nThe assumption was satisfied and the test was run.");});

//        Assumptions.assumeFalse(gc.get(Calendar.HOUR_OF_DAY) < 20);
//        Assumptions.assumeTrue(gc.get(Calendar.HOUR_OF_DAY) < 8);
//        Assumptions.assumeTrue(gc.get(Calendar.HOUR_OF_DAY) < 20);

//        employee.adjustSalary(5000);
//        assertEquals(89000, employee.getSalary());
//        assertEquals(85000, employee.getSalary());

        System.out.println("\nAfter the invocation of assumingThat");
//        System.out.println("The assumption was satisfied and the test was run.");
    }

//    @Test
//    void assertTest() {

//        firstEmployee.addProject("Blue Flame");
//        firstEmployee.addProject("Black Box");

//        LinkedList<String> compareList = new LinkedList<>();
//        compareList.add("Blue Flame");
//        compareList.add("Black Box");

//        assertIterableEquals(compareList, firstEmployee.getProjects());

//        firstEmployee.adjustSalary(4000);

//        assertAll("Test Employee",
//                () -> assertEquals(84000, firstEmployee.getSalary()),
//                () -> assertNotNull(firstEmployee.getFirstName()),
//                () -> assertThrows(NullPointerException.class,
//                        () -> {firstEmployee.validateLastName();},
//                        "Throws Exception test")
//        );

//        assertAll("Test Employee",
//                () -> assertEquals(84000, firstEmployee.getSalary()),
//                () -> assertNotNull(firstEmployee.getFirstName()),
//                () -> assertThrows(NamingException.class,
//                        () -> {firstEmployee.validateLastName();},
//                        "Throws Exception test")
//        );

//        assertThrows(NullPointerException.class,
//                () -> {firstEmployee.validateLastName();},
//                "Throws Exception test");

//        assertThrows(NamingException.class,
//                () -> {firstEmployee.validateLastName();},
//                "Throws Exception test");

//        assertThrows(InvalidNameException.class,
//                () -> {firstEmployee.validateLastName();},
//                "Throws Exception test");

//        assertThrows(RuntimeException.class,
//                () -> {firstEmployee.validateLastName();},
//                "Throws Exception test");

//        assertNotNull(firstEmployee);

//        assertNull(firstEmployee);

//        assertNull(secondEmployee);

//        assertTimeout(Duration.ofSeconds(5),
//                () -> {firstEmployee.adjustSalary(2000);
//                    Employee secondEmployee =
//                        new Employee("Brian", "Alford",
//                                    1011, 'M', "Developer",
//                                    45000, "Contractor");
//                    secondEmployee.adjustSalary(3000);});

//        assertTimeout(Duration.ofSeconds(5),
//                () -> {firstEmployee.adjustSalary(2000);});

//        Employee firstShallowCopy = firstEmployee;
//        Employee firstSeparateCopy = new Employee(firstEmployee.getFirstName(), firstEmployee.getLastName(),
//                firstEmployee.getId(), firstEmployee.getGender(),
//                firstEmployee.getRole(), firstEmployee.getSalary(),
//                firstEmployee.getType());

//        assertNotSame(firstEmployee, firstShallowCopy,
//                "Test two objects for sameness");

//        assertSame(firstEmployee.getRole(), firstSeparateCopy.getRole(),
//                "Test two Strings for sameness");

//        assertSame(firstEmployee, firstSeparateCopy,
//                "Test an object and a copy for sameness");

//        assertSame(firstEmployee, firstShallowCopy,
//                "Test an object and a copy for sameness");

//        assertFalse(firstEmployee.getRole().equals(secondEmployee.getRole()),
//                "Test that both employees have the same role");

//        assertTrue(firstEmployee.getRole().equals(secondEmployee.getRole()),
//                "Test that both employees have the same role");

//        assertEquals("Alford", employee.getLastName(), "Check last name");

//        employee.adjustSalary(5000);
//        assertEquals(55000, employee.getSalary());
//    }

}