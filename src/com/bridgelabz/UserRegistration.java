package com.bridgelabz;

import java.util.regex.Pattern;

public class UserRegistration {
    private static final String FIRST_NAME_PATTERN = "[A-Z][a-z]{2,}";
    private static final String LAST_NAME_PATTERN = "[A-Z][a-z]{2,}";
    private static final String EMAIL_ID_PATTERN = "[a-zA-Z0-9]+[.][a-zA-Z0-9]*[@][b][l][.][c][o][.][in]*";
    private static final String EMAIL_ID_PATERN = "[a-zA-Z0-9]*[@][b][l][.][c][o][m]*";
    private static final String MOBILE_NUMBER_PATTERN = "[9][1] [1-9][0-9]{9}";
    private static final String PASSWORD_PATTERN = "(?=.*[a-zA-Z])(?=.*[0-9])(?=.*[!@#$%^&]{1}).{8,}";


    public boolean validateFirstName(String firstName) {
        Pattern pattern = Pattern.compile(FIRST_NAME_PATTERN);
        return pattern.matcher(firstName).matches();
    }
    public boolean validateLastName( String lastName) {
        Pattern pattern = Pattern.compile(LAST_NAME_PATTERN);
        return pattern.matcher(lastName).matches();
    }
    public boolean validateEmailId(String emailId) {
        Pattern pattern = Pattern.compile(EMAIL_ID_PATTERN);
        return pattern.matcher(emailId).matches();
    }
    public boolean validateEMailId(String emailId) {
        Pattern pattern = Pattern.compile(EMAIL_ID_PATERN);
        return pattern.matcher(emailId).matches();
    }
    public boolean validateMobileNo(String mobileNo) {
        Pattern pattern = Pattern.compile(MOBILE_NUMBER_PATTERN);
        return pattern.matcher(mobileNo).matches();
    }
    public boolean validatePassword(String password) {
        Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
        return pattern.matcher(password).matches();
    }

}
