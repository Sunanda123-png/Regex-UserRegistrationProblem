package com.bridgelabz;


import org.junit.Test;

import static org.junit.Assert.*;

public class UserRegistrationTest {
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        UserRegistration validator = new UserRegistration();
        boolean result = validator.validateFirstName("Sunanda");
        assertTrue(result);
    }
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrueTest() {
        UserRegistration validator = new UserRegistration();
        Boolean result = validator.validateFirstName("sunanda");
        assertEquals("Sad Test Case", false, result);
    }
    @Test
    public void givenLastName_WhenProper_ShouldReturnTure() {
        UserRegistration validator = new UserRegistration();
        boolean result = validator.validateLastName("Shil");
        assertTrue(result);
    }
    @Test
    public void givenLastName_WhenProper_ShouldReturnTrueTest() {
        UserRegistration validator = new UserRegistration();
        Boolean result = validator.validateFirstName("8shil");
        assertEquals("Sad Test Case", false, result);
    }
    @Test
    public void givenEmailId_WhenProper_ShouldReturnTure() {
        UserRegistration validator = new UserRegistration();
        boolean result = validator.validateEmailId("sunanda.shil@bl.co.in");
        assertTrue(result);
    }
    @Test
    public void givenEMailId_WhenProper_ShouldReturnTure() {
        UserRegistration validator = new UserRegistration();
        boolean result = validator.validateEMailId("narendramodi@bl.com");
        assertTrue(result);
    }
    @Test
    public void givenMobileNo_WhenProper_ShouldReturnTure() {
        UserRegistration validator = new UserRegistration();
        boolean result = validator.validateMobileNo("91 7578061886");
        assertTrue(result);
    }
    @Test
    public void givenMobileNo_WhenProper_ShouldReturnTureTest() {
        UserRegistration validator = new UserRegistration();
        Boolean result = validator.validateFirstName("4567");
        assertEquals("Sad Test Case", false, result);
    }
    @Test
    public void givenPassword_WhenProper_ShouldReturnTure() {
        UserRegistration validator = new UserRegistration();
        boolean result = validator.validatePassword("Abcdefgh1@");
        assertTrue(result);
    }
    @Test
    public void givenPassword_WhenProper_ShouldReturnTureTest() {
        UserRegistration validator = new UserRegistration();
        Boolean result = validator.validateFirstName("Wait");
        assertEquals("Happy Test Case", true, result);
    }

}
