package com.bridgelabz;


import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class UserRegistrationTest {
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        UserRegistration validator = new UserRegistration();
        boolean result = validator.validateFirstName("Sunanda");
        assertTrue(result);
    }
    @Test
    public void givenLastName_WhenProper_ShouldReturnTure() {
        UserRegistration validator = new UserRegistration();
        boolean result = validator.validateLastName("Shil");
        assertTrue(result);
    }
    @Test
    public void givenEmailId_WhenProper_ShouldReturnTure() {
        UserRegistration validator = new UserRegistration();
        boolean result = validator.validateEmailId("sunanda.shil@bl.co.in");
        assertTrue(result);
    }
    @Test
    public void givenMobileNo_WhenProper_ShouldReturnTure() {
        UserRegistration validator = new UserRegistration();
        boolean result = validator.validateMobileNo("91 7578061886");
        assertTrue(result);
    }
}
