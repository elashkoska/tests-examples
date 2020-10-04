package com.endava;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class AccountTest {
    private static final Logger logger = LogManager.getLogger(AccountTest.class);
    private Account account;

    AccountTest() {

    }

    @BeforeAll
    static void setup() {
        logger.info("@BeforeAll");
    }


    @BeforeEach
    void init() {
        logger.info("@BeforeEach-executes before each test method in this class");
        account = new Account("Student1", 12345, "student123!");
    }

    @Test
    void shouldReturnCorrectName() {
        Assertions.assertSame("Student1", account.getUsername());
    }

    @Disabled
    @Test
    void shouldReturnCorrectAccountNumber() {
        Assertions.assertSame(12345, account.getAccountNumber());
    }

}
