package com.shivam.login;

/**
 * created by Shivam on 22-02-2019.
 */
public class UserValidationService {

    public boolean isValid(String name,String pass){
        return name.equals("Shivam1097") && pass.equals("12345");
    }

}
