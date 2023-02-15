package com.example.freemoneynoscam.services;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateEmailService {
    public boolean isEmailValid(String email){
        boolean isValid = false;

        //Initialize reg ex for email.
        String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
        CharSequence inputStr = email;
        //Make the comparison case-insensitive.
        Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(inputStr);
        if (matcher.matches()) {
            isValid = true;
        }
        return isValid;
    }
}