package com.skillsoft.junit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;

//import org.junit.Test;
//import static org.junit.jupiter.api.Assertions.assertTrue;

public class AccountDetailsTest {

    static AccountDetails accountDetails;

    @BeforeAll
    static void initAll() {

        accountDetails = new AccountDetails("Anita", 011401533, 114532,
                5000, "Savings");

        System.out.println("Initial account balance: " + accountDetails.getBalance());
        System.out.println("@BeforeAll block has been executed");

//        System.out.println("@BeforeAll block has been executed");
//        System.out.println("Initialize all");
    }

//    @BeforeEach
//    void init() {
//        accountDetails = new AccountDetails("Anita", 011401533, 114532,
//                5000, "Savings");

//        System.out.println("@BeforeEach block has been executed");
//        System.out.println("Account balance: " + accountDetails.getBalance());
//    }

    @Test
    void depositTest() {
        accountDetails.deposit(500);
        System.out.println("@Test block for deposit has been executed");
    }

    @Test
    void withdrawTest() {
        accountDetails.withdraw(1000);
        System.out.println("@Test block for withdraw has been executed");
    }

    @AfterEach
    void balance() {
//        System.out.println("@AfterEach has been executed");
        System.out.println("Account balance: " + accountDetails.getBalance());
    }

    @AfterAll
    static void teardownAll() {
        System.out.println("Final account balance: " + accountDetails.getBalance());
        accountDetails = null;
        System.out.println("@AfterAll block has been executed");

//        System.out.println("@AfterAll block has been executed");
//        System.out.println("Clean all");
    }

//    AccountDetails accountDetails = new AccountDetails("Anita4",
//            011401533, 114532,
//            5000, "Savings");
//
//    @Test
//    public void validateName() {
//
//        assertTrue(accountDetails.getName().matches("^[a-zA-Z]*$"));
//    }
//
//    @Test
//    public void validateBalance() {
//        assertTrue(accountDetails.getBalance() >= 0);
//    }
}
