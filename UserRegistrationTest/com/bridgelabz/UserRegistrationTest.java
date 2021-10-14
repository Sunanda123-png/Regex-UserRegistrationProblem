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
}
