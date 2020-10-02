package com.endava;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.*;

class StudentTest {
    private static final Logger logger = LogManager.getLogger(StudentTest.class);
    private Student student;

    StudentTest() {
    }

    @BeforeAll
    static void setup() {
        logger.info("@BeforeAll - executes once before all test methods in this class");
    }

    @BeforeEach
    void init() {
        logger.info("@BeforeEach - executes before each test method in this class");
        student = new Student("John", "Lock", 124);
    }

    @Test
    void shouldReturnCorrectName() {

        Assertions.assertSame("John", student.getName());
    }

    @DisplayName("Test for surname")
    @Test
    void shouldReturnCorrectSurname() {

        Assertions.assertSame("Lock", student.getSurname());
    }

    @DisplayName("Example of failed test")
    @Test
    void shouldCompareNames() {
        Assertions.assertSame("Elena", student.getName());
    }

    @Disabled("Not implemented yet")
    @Test
    void shouldReturnCorrectGrades() {

    }


    @AfterEach
    void tearDown() {
        logger.info("@AfterEach - executed after each test method.");
    }

    @AfterAll
    static void done() {
        logger.info("@AfterAll - executed after all test methods.");
    }

}
